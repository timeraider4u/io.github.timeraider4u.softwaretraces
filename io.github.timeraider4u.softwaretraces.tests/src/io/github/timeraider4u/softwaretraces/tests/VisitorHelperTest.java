package io.github.timeraider4u.softwaretraces.tests;

import org.junit.Assert;
import org.junit.Test;

import io.github.timeraider4u.softwaretraces.softwaretraces.Feature;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.MyNode;
import io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesFactory;
import io.github.timeraider4u.softwaretraces.softwaretraces.Trace;
import io.github.timeraider4u.softwaretraces.utils.Repository;
import io.github.timeraider4u.softwaretraces.utils.Visitor;
import io.github.timeraider4u.softwaretraces.utils.VisitorHelper;

public class VisitorHelperTest {
	
	private static String MODEL = "model:";
	private static String FEATURE = "feature:";
	private static String TRACE = "trace:";

	// not used to improve readability
	// private static String F_NAME = "f1";
	// private static String T_NAME = "t1.java";
	
	@Test
	public void test() {
		final Model model = Repository.createModel(null);
		final Feature f1 = SoftwareTracesFactory.eINSTANCE.createFeature();
		f1.setName("f1");
		final Trace t1 = SoftwareTracesFactory.eINSTANCE.createTrace();
		t1.setFileName("t1.java");

		final MyNode node1 = model;
		final MyNode node2 = f1;
		final MyNode node3 = t1;

		final MyVisitor visitor = new MyVisitor();
		final VisitorHelper helper = new VisitorHelper(visitor);
		helper.visit(model);
		Assert.assertEquals(VisitorHelperTest.MODEL, visitor.label);
		helper.visit(node1);
		Assert.assertEquals(VisitorHelperTest.MODEL, visitor.label);
		helper.visit(f1);
		Assert.assertEquals(VisitorHelperTest.FEATURE + "f1", visitor.label);
		helper.visit(node2);
		Assert.assertEquals(VisitorHelperTest.FEATURE + "f1", visitor.label);
		helper.visit(t1);
		Assert.assertEquals(VisitorHelperTest.TRACE + "t1.java", visitor.label);
		helper.visit(node3);
		Assert.assertEquals(VisitorHelperTest.TRACE + "t1.java", visitor.label);
		
	}
	
	private class MyVisitor implements Visitor {
		
		public String label = "";

		@Override
		public void visit(final Model model) {
			this.label = VisitorHelperTest.MODEL;
		}

		@Override
		public void visit(final Feature feature) {
			this.label = VisitorHelperTest.FEATURE + feature.getName();
		}

		@Override
		public void visit(final Trace trace) {
			this.label = VisitorHelperTest.TRACE + trace.getFileName();
		}
		
	}
	
}
