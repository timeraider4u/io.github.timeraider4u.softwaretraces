package io.github.timeraider4u.softwaretraces.data;

import io.github.timeraider4u.softwaretraces.softwaretraces.Feature;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.Trace;

public interface Visitor {

	public void visit(Model model);

	public void visit(Feature feature);

	public void visit(Trace trace);

}
