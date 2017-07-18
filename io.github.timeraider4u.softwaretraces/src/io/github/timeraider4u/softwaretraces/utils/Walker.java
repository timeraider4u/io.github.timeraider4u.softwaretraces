package io.github.timeraider4u.softwaretraces.utils;

import org.eclipse.emf.common.util.EList;

import io.github.timeraider4u.softwaretraces.softwaretraces.Feature;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.Trace;

public class Walker extends VisitorHelper {
	
	private final boolean recursive;
	private int currentLevel;

	public Walker(final Visitor visitor, final boolean recursive) {
		super(visitor);
		this.recursive = recursive;
		this.currentLevel = 0;
	}
	
	@Override
	public void visit(final Model model) {
		super.visit(model);
		final EList<Feature> features = model.getFeatures();
		this.walkAllFeatures(features);
		final EList<Trace> traces = model.getTraces();
		this.walkAllTraces(traces);
	}
	
	@Override
	public void visit(final Feature feature) {
		super.visit(feature);
		final EList<Feature> features = feature.getFeatures();
		this.walkAllFeatures(features);
		final EList<Trace> traces = feature.getTraces();
		this.walkAllTraces(traces);
	}
	
	@Override
	public void visit(final Trace trace) {
		super.visit(trace);
		final EList<Trace> traces = trace.getTraces();
		this.walkAllTraces(traces);
	}
	
	private void walkAllFeatures(final EList<Feature> features) {
		if (!this.checkEnterIteration()) {
			return;
		}
		for (int i = 0; i < features.size(); i++) {
			final Feature feature = features.get(i);
			this.currentLevel++;
			this.visit(feature);
			this.currentLevel--;
		}
	}
	
	private void walkAllTraces(final EList<Trace> traces) {
		if (!this.checkEnterIteration()) {
			return;
		}
		for (int i = 0; i < traces.size(); i++) {
			final Trace trace = traces.get(i);
			this.currentLevel++;
			this.visit(trace);
			this.currentLevel--;
		}
	}
	
	private boolean checkEnterIteration() {
		final boolean isTopLevel = (this.currentLevel == 0);
		if (!this.recursive && !isTopLevel) {
			return false;
		}
		return true;
	}

}
