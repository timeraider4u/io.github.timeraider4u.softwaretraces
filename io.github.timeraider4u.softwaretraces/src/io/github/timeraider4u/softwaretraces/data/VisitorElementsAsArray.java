package io.github.timeraider4u.softwaretraces.data;

import java.util.ArrayList;
import java.util.List;

import io.github.timeraider4u.softwaretraces.softwaretraces.Feature;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.MyNode;
import io.github.timeraider4u.softwaretraces.softwaretraces.Trace;

public class VisitorElementsAsArray implements Visitor {

	private final List<MyNode> nodes;

	public VisitorElementsAsArray() {
		this.nodes = new ArrayList<MyNode>();
	}
	
	@Override
	public void visit(final Model model) {
		this.nodes.add(model);
	}
	
	@Override
	public void visit(final Feature feature) {
		this.nodes.add(feature);
	}
	
	@Override
	public void visit(final Trace trace) {
		this.nodes.add(trace);
	}

	public MyNode[] getChildren() {
		MyNode[] result = new MyNode[this.nodes.size()];
		result = this.nodes.toArray(result);
		return result;
	}
	
}
