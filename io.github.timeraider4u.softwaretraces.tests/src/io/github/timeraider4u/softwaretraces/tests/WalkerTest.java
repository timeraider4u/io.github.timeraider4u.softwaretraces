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
import io.github.timeraider4u.softwaretraces.utils.WalkerType;

public class WalkerTest {

	private Model model = null;

	@Before
	public void setUp() {
		final String uriAsString = "platform:/plugin/io.github.timeraider4u.softwaretraces.tests/res/Model1.softwaretraces.xmi";
		this.model = Repository.loadModel(uriAsString);
		Assert.assertNotNull(this.model);
	}

	@Test
	public void testWalkerHelperTopLevel() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, WalkerType.TopLevel);
		walker.visit(this.model);
		final String actual = visitor.buffer.toString();
		final String expected = "model ";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testWalkerHelperChildren() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, WalkerType.Children);
		walker.visit(this.model);
		final String actual = visitor.buffer.toString();
		final String expected = "f[Main entry point] f[Office] t[Main.java:0] t[Main.java:0] ";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testWalkerHelperDepthOne() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, WalkerType.DepthOne);
		walker.visit(this.model);
		final String actual = visitor.buffer.toString();
		final String expected = "model f[Main entry point] f[Office] t[Main.java:0] t[Main.java:0] ";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testWalkerHelperRecursion() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, WalkerType.Recursive);
		walker.visit(this.model);
		final String actual = visitor.buffer.toString();
		final String expected = "model f[Main entry point] t[Main.java:15] "
				+ "f[Office] f[Print] f[PrintToPDF] "
				+ "t[Main.java:30] t[Print.java:56] t[Print.java:105] t[345:0] "
				+ "f[PrintToPrinter] f[Scan] t[Main.java:0] t[Main.java:0] ";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testWalkerHelperTopLevelForFeatureOffice() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, WalkerType.TopLevel);
		final Feature office = this.model.getFeatures().get(1);
		Assert.assertNotNull(office);
		walker.visit(office);
		final String actual = visitor.buffer.toString();
		final String expected = "f[Office] ";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testWalkerHelperChildrenForFeatureOffice() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, WalkerType.Children);
		final Feature office = this.model.getFeatures().get(1);
		Assert.assertNotNull(office);
		walker.visit(office);
		final String actual = visitor.buffer.toString();
		final String expected = "f[Print] f[Scan] ";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testWalkerHelperDepthOneForFeatureOffice() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, WalkerType.DepthOne);
		final Feature office = this.model.getFeatures().get(1);
		Assert.assertNotNull(office);
		walker.visit(office);
		final String actual = visitor.buffer.toString();
		final String expected = "f[Office] f[Print] f[Scan] ";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testWalkerHelperRecursionForFeatureOffice() {
		final MyVisitor visitor = new MyVisitor();
		final Walker walker = new Walker(visitor, WalkerType.Recursive);
		final Feature office = this.model.getFeatures().get(1);
		Assert.assertNotNull(office);
		walker.visit(office);
		final String actual = visitor.buffer.toString();
		final String expected = "f[Office] f[Print] f[PrintToPDF] "
				+ "t[Main.java:30] t[Print.java:56] t[Print.java:105] t[345:0] "
				+ "f[PrintToPrinter] f[Scan] ";
		Assert.assertEquals(expected, actual);
	}

	private class MyVisitor implements Visitor {

		public StringBuffer buffer;

		public MyVisitor() {
			this.buffer = new StringBuffer("");
		}
		
		@Override
		public void visit(final Model model) {
			this.buffer.append("model ");
		}
		
		@Override
		public void visit(final Feature feature) {
			this.buffer.append("f[");
			this.buffer.append(feature.getName());
			this.buffer.append("] ");
		}
		
		@Override
		public void visit(final Trace trace) {
			final String fileName = trace.getFileName();
			final String lineStr = "" + trace.getLineNumber();
			this.buffer.append("t[");
			this.buffer.append(fileName);
			this.buffer.append(":");
			this.buffer.append(lineStr);
			this.buffer.append("] ");
		}

	}

}
