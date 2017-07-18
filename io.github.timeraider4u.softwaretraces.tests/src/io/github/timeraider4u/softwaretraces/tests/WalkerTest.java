package io.github.timeraider4u.softwaretraces.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.timeraider4u.softwaretraces.softwaretraces.Feature;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.Trace;
import io.github.timeraider4u.softwaretraces.utils.Repository;
import io.github.timeraider4u.softwaretraces.utils.Visitor;
import io.github.timeraider4u.softwaretraces.utils.Walker;

public class WalkerTest {

	private Model model = null;

	@Before
	public void setUp() {
		final String uriAsString = "platform:/plugin/io.github.timeraider4u.softwaretraces.tests/res/Model1.softwaretraces.xmi";
		this.model = Repository.loadModel(uriAsString);
		Assert.assertNotNull(this.model);
	}

	@Test
	public void testWalkerHelperNoRecursion() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, false);
		walker.visit(this.model);
		Assert.assertEquals(1, visitor.models);
		Assert.assertEquals(2, visitor.features);
		Assert.assertEquals(2, visitor.traces);
	}

	@Test
	public void testWalkerHelperRecursion() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, true);
		walker.visit(this.model);
		Assert.assertEquals(1, visitor.models);
		Assert.assertEquals(6, visitor.features);
		Assert.assertEquals(7, visitor.traces);
	}
	
	@Test
	public void testWalkerHelperNoRecursionForFeatureOffice() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, false);
		final Feature office = this.model.getFeatures().get(1);
		Assert.assertNotNull(office);
		walker.visit(office);
		Assert.assertEquals(0, visitor.models);
		Assert.assertEquals(3, visitor.features);
		Assert.assertEquals(0, visitor.traces);
	}

	@Test
	public void testWalkerHelperRecursionForFeatureOffice() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, true);
		final Feature office = this.model.getFeatures().get(1);
		Assert.assertNotNull(office);
		walker.visit(office);
		Assert.assertEquals(0, visitor.models);
		Assert.assertEquals(5, visitor.features);
		Assert.assertEquals(4, visitor.traces);
	}

	private class MyVisitor implements Visitor {

		public int models;
		public int features;
		public int traces;

		public MyVisitor() {
			this.models = 0;
			this.features = 0;
			this.traces = 0;
		}
		
		@Override
		public void visit(final Model model) {
			this.models++;
		}
		
		@Override
		public void visit(final Feature feature) {
			this.features++;

		}
		
		@Override
		public void visit(final Trace trace) {
			this.traces++;
		}

	}

}
