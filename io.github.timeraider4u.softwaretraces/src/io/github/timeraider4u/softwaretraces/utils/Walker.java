package io.github.timeraider4u.softwaretraces.utils;

import org.eclipse.emf.common.util.EList;

import io.github.timeraider4u.softwaretraces.softwaretraces.Feature;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.Trace;

public class Walker extends VisitorHelper {

	private final WalkerType type;
	private int currentLevel;
	
	public Walker(final Visitor visitor, final WalkerType type) {
		super(visitor);
		this.type = type;
		this.currentLevel = 0;
	}

	@Override
	public void visit(final Model model) {
		if (this.checkVisit()) {
			super.visit(model);
		}
		this.currentLevel++;
		final EList<Feature> features = model.getFeatures();
		this.walkAllFeatures(features);
		final EList<Trace> traces = model.getTraces();
		this.walkAllTraces(traces);
		this.currentLevel--;
	}

	@Override
	public void visit(final Feature feature) {
		if (this.checkVisit()) {
			super.visit(feature);
		}
		this.currentLevel++;
		final EList<Feature> features = feature.getFeatures();
		this.walkAllFeatures(features);
		final EList<Trace> traces = feature.getTraces();
		this.walkAllTraces(traces);
		this.currentLevel--;
	}

	@Override
	public void visit(final Trace trace) {
		if (this.checkVisit()) {
			super.visit(trace);
		}
		this.currentLevel++;
		final EList<Trace> traces = trace.getTraces();
		this.walkAllTraces(traces);
		this.currentLevel--;
	}

	private void walkAllFeatures(final EList<Feature> features) {
		if (!this.checkVisit()) {
			return;
		}
		for (int i = 0; i < features.size(); i++) {
			final Feature feature = features.get(i);
			this.visit(feature);
		}
	}

	private void walkAllTraces(final EList<Trace> traces) {
		if (!this.checkVisit()) {
			return;
		}
		for (int i = 0; i < traces.size(); i++) {
			final Trace trace = traces.get(i);
			this.visit(trace);
		}
	}
	
	private boolean checkVisit() {
		switch (this.type) {
		case TopLevel: {
			final boolean isTopLevel = (this.currentLevel == 0);
			return isTopLevel;
		}
		case Children: {
			final boolean isChildLevel = (this.currentLevel == 1);
			return isChildLevel;
		}
		case DepthOne: {
			final boolean isTopLevel = (this.currentLevel == 0);
			final boolean isChildLevel = (this.currentLevel == 1);
			final boolean depthOne = (isTopLevel || isChildLevel);
			return depthOne;
		}
		default:
			break;
		}
		return true;
	}
	
}
