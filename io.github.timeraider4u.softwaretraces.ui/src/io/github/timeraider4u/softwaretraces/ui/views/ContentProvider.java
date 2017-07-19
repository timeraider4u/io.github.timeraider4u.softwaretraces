package io.github.timeraider4u.softwaretraces.ui.views;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;

import io.github.timeraider4u.softwaretraces.data.VisitorElementsAsArray;
import io.github.timeraider4u.softwaretraces.data.Walker;
import io.github.timeraider4u.softwaretraces.data.WalkerType;
import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.MyNode;
import io.github.timeraider4u.softwaretraces.utils.EclipseUtils;
import io.github.timeraider4u.softwaretraces.utils.Repository;

public class ContentProvider implements ITreeContentProvider {

	private static final String QUALIFIER = "io.github.timeraider4u.softwaretraces";
	private static final String KEY = "resourceFileName";
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
		final IPreferencesService service = Platform.getPreferencesService();
		final String resFileName = service.getString(ContentProvider.QUALIFIER,
				ContentProvider.KEY, ContentProvider.DEFAULT_RES_FNAME, null);
		// final String resFileName = ContentProvider.DEFAULT_RES_FNAME;
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
		return new Object[] { this.model };
	}

	@Override
	public Object[] getChildren(final Object parentElement) {
		final VisitorElementsAsArray visitor = new VisitorElementsAsArray();
		final Walker walker = new Walker(visitor, WalkerType.Children);
		walker.visit(this.model);
		final MyNode[] items = visitor.getChildren();
		return items;
	}

	@Override
	public boolean hasChildren(final Object element) {
		final Object[] children = this.getChildren(element);
		final boolean result = (children.length > 0);
		return result;
	}

	@Override
	public Object getParent(final Object element) {
		if (!(element instanceof EObject)) {
			return null;
		}
		final EObject eObject = (EObject) element;
		final EObject container = eObject.eContainer();
		return container;
	}
	
}
