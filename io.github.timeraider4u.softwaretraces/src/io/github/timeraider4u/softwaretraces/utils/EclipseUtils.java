package io.github.timeraider4u.softwaretraces.utils;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

public class EclipseUtils {
	
	private EclipseUtils() {
		
	}
	
	public static IWorkspaceRoot getWorkspaceRoot() {
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot root = workspace.getRoot();
		return root;
	}

	public static IProject getProject(final String projectName) {
		final IWorkspaceRoot root = EclipseUtils.getWorkspaceRoot();
		final IProject project = root.getProject(projectName);
		return project;
	}

	public static IProgressMonitor getProgressMonitor() {
		return new NullProgressMonitor();
	}
	
}
