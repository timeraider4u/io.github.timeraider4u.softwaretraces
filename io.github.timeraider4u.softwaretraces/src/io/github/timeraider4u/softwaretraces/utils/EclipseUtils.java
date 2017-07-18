package io.github.timeraider4u.softwaretraces.utils;

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
	
	public static IProgressMonitor getProgressMonitor() {
		return new NullProgressMonitor();
	}

}
