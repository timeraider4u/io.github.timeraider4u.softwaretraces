package io.github.timeraider4u.softwaretraces.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.timeraider4u.softwaretraces.data.VisitorElementsAsArray;
import io.github.timeraider4u.softwaretraces.data.Walker;
import io.github.timeraider4u.softwaretraces.data.WalkerType;
import io.github.timeraider4u.softwaretraces.softwaretraces.Feature;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.MyNode;
import io.github.timeraider4u.softwaretraces.softwaretraces.Trace;
import io.github.timeraider4u.softwaretraces.utils.Repository;

public class VisitorElementsAsArrayTest {
	
	private Model model = null;

	@Before
	public void setUp() {
		final String uriAsString = "platform:/plugin/io.github.timeraider4u.softwaretraces.tests/res/Model1.softwaretraces.xmi";
		this.model = Repository.loadModel(uriAsString);
		Assert.assertNotNull(this.model);
	}

	@Test
	public void test() {
		final VisitorElementsAsArray visitor = new VisitorElementsAsArray();
		final Walker walker = new Walker(visitor, WalkerType.Children);
		walker.visit(this.model);
		final MyNode[] items = visitor.getChildren();
		Assert.assertNotNull(items);
		Assert.assertEquals(4, items.length);
		final Feature feature1 = (Feature) items[0];
		Assert.assertEquals("Main entry point", feature1.getName());
		final Feature feature2 = (Feature) items[1];
		Assert.assertEquals("Office", feature2.getName());
		final Trace trace1 = (Trace) items[2];
		Assert.assertEquals("Main.java", trace1.getFileName());
		final Trace trace2 = (Trace) items[3];
		Assert.assertEquals("Main.java", trace2.getFileName());
	}
	
}
