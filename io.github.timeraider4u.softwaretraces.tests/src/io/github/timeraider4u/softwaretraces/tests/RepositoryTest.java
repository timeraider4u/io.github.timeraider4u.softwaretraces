package io.github.timeraider4u.softwaretraces.tests;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Test;

import io.github.timeraider4u.softwaretraces.softwaretraces.Feature;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.MyNode;
import io.github.timeraider4u.softwaretraces.softwaretraces.Trace;
import io.github.timeraider4u.softwaretraces.utils.EclipseUtils;
import io.github.timeraider4u.softwaretraces.utils.Repository;

public class RepositoryTest {

	@Test
	public void testCreateModel() {
		final Model model = Repository.createModel(null);
		Assert.assertNotNull(model);
	}
	
	@Test
	public void testCreateAndSaveModel() throws CoreException {
		final IWorkspaceRoot workspaceRoot = EclipseUtils.getWorkspaceRoot();
		final IProject project = workspaceRoot.getProject("TestProject");
		Assert.assertFalse(project.exists());
		project.create(EclipseUtils.getProgressMonitor());
		project.open(EclipseUtils.getProgressMonitor());
		Assert.assertTrue(project.exists());
		Assert.assertTrue(project.isOpen());
		final String fileName = "CreateAndSave.softwaretraces.xmi";
		final IFile file = project.getFile(fileName);
		Assert.assertFalse(file.exists());
		final String uriAsString = "platform:/resource/TestProject/" + fileName;
		final Model model = Repository.createModel(uriAsString);
		Assert.assertNotNull(model);
		Assert.assertEquals(uriAsString, model.getResourceFileName());
		Assert.assertTrue(file.exists());
		Repository.saveModel(model, uriAsString, false);
		Assert.assertTrue(file.exists());
		final Model modelReload = Repository.loadModel(uriAsString);
		Assert.assertNotNull(modelReload);
	}

	@Test
	public void testLoadModel() {
		final String uriAsString = "platform:/plugin/io.github.timeraider4u.softwaretraces.tests/res/Model1.softwaretraces.xmi";
		final Model model = Repository.loadModel(uriAsString);
		Assert.assertNotNull(model);
		Assert.assertTrue(model instanceof MyNode);
		Assert.assertEquals(uriAsString, model.getResourceFileName());
		final EList<Feature> features = model.getFeatures();
		Assert.assertNotNull(features);
		Assert.assertEquals(2, features.size());
		final EList<Trace> traces = model.getTraces();
		Assert.assertNotNull(traces);
		Assert.assertEquals(2, traces.size());
		final Trace lastTrace = traces.get(1);
		Assert.assertNotNull(lastTrace);
		Assert.assertEquals("SampleProject", lastTrace.getProjectName());
		Assert.assertEquals("Main.java", lastTrace.getFileName());
		Assert.assertEquals(0, lastTrace.getLineNumber());
		// final MyNode lastSelected = model.getLastSelected();
		// Assert.assertNotNull(lastSelected);
		// Assert.assertEquals(lastTrace, lastSelected);
	}

}
