package io.github.timeraider4u.softwaretraces.utils;

import io.github.timeraider4u.softwaretraces.softwaretraces.Feature;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.MyNode;
import io.github.timeraider4u.softwaretraces.softwaretraces.Trace;

public class VisitorHelper implements Visitor {

	private final Visitor visitor;
	
	public VisitorHelper(final Visitor visitor) {
		this.visitor = visitor;
	}

	public void visit(final MyNode myNode) {
		if (myNode instanceof Model) {
			final Model model = (Model) myNode;
			this.visit(model);
		} else if (myNode instanceof Feature) {
			final Feature feature = (Feature) myNode;
			this.visit(feature);
		} else if (myNode instanceof Trace) {
			final Trace trace = (Trace) myNode;
			this.visit(trace);
		}
	}
	
	@Override
	public void visit(final Model model) {
		this.visitor.visit(model);
	}
	
	@Override
	public void visit(final Feature feature) {
		this.visitor.visit(feature);
	}
	
	@Override
	public void visit(final Trace trace) {
		this.visitor.visit(trace);
	}
	
}
