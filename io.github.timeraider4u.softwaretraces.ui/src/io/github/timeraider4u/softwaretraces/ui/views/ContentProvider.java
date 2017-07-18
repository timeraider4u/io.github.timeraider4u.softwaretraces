package io.github.timeraider4u.softwaretraces.ui.views;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ITreeContentProvider;

import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.utils.EclipseUtils;
import io.github.timeraider4u.softwaretraces.utils.Repository;

public class ContentProvider implements ITreeContentProvider {
	
	// private static final String QUALIFIER =
	// "io.github.timeraider4u.softwaretraces";
	// private static final String KEY = "resourceFileName";
	private static final String DEFAULT_PROJECT = "SoftwareTraces";
	private static final String DEFAULT_FNAME = "SoftwareTraces.softwaretraces.xmi";
	private static final String DEFAULT_RES_FNAME = "platform:/resource/"
			+ ContentProvider.DEFAULT_PROJECT + "/"
			+ ContentProvider.DEFAULT_FNAME;

	private final Model model;

	public ContentProvider() {
		this.model = this.getModel();
	}

	private Model getModel() {
		// final IPreferencesService service = Platform.getPreferencesService();
		// final String resFileName =
		// service.getString(ContentProvider.QUALIFIER,
		// ContentProvider.KEY, ContentProvider.DEFAULT_RES_FNAME, null);
		final String resFileName = ContentProvider.DEFAULT_RES_FNAME;
		final IProject defaultProject = this.getProject();
		final IFile resource = defaultProject.getFile(resFileName);
		if (resource.exists()) {
			return Repository.loadModel(resFileName);
		} else {
			return Repository.createModel(resFileName);
		}
	}
	
	private IProject getProject() {
		final IProject project = EclipseUtils
				.getProject(ContentProvider.DEFAULT_PROJECT);
		if (!project.exists()) {
			try {
				project.create(EclipseUtils.getProgressMonitor());
			} catch (final Exception ex) {
				ex.printStackTrace();
				return null;
			}
		}
		return project;
	}

	@Override
	public Object[] getElements(final Object inputElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getChildren(final Object parentElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParent(final Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(final Object element) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
