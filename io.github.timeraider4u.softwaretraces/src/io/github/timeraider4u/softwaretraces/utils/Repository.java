package io.github.timeraider4u.softwaretraces.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import io.github.timeraider4u.softwaretraces.softwaretraces.Model;
import io.github.timeraider4u.softwaretraces.softwaretraces.SoftwareTracesFactory;

public class Repository {

	private Repository() {
		
	}
	
	public static Model createModel(final String uriAsString) {
		final Model result = SoftwareTracesFactory.eINSTANCE.createModel();
		if (uriAsString != null) {
			Repository.saveModel(result, uriAsString, true);
		}
		return result;
	}

	public static Model loadModel(final String uriAsString) {
		final Resource resource = Repository.loadResource(uriAsString);
		if (resource == null) {
			return null;
		}
		final EList<EObject> content = resource.getContents();
		if ((content == null) || (content.size() < 1)) {
			return null;
		}
		final EObject object = content.get(0);
		if (!(object instanceof Model)) {
			return null;
		}
		final Model model = (Model) object;
		model.setResourceFileName(uriAsString);
		// model.setLastSelected(null);
		return model;
	}
	
	private static Resource loadResource(final String uriAsString) {
		try {
			final Resource result = Repository
					.loadResourceWithoutHandling(uriAsString);
			return result;
		} catch (final IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	private static Resource loadResourceWithoutHandling(
			final String uriAsString) throws IOException {
		final URI uri = URI.createURI(uriAsString);
		final ResourceSet resourceSet = Repository.getResourceSetForURI();
		final Resource resource = resourceSet.getResource(uri, true);
		final Map<Object, Object> options = Repository.getOptions();
		resource.load(options);
		return resource;
	}

	public static boolean saveModel(final Model model, final String uriAsString,
			final boolean overwriteExistingContent) {
		try {
			final URI uri = URI.createURI(uriAsString);
			final ResourceSet resourceSet = Repository.getResourceSetForURI();
			Resource resource = null;

			if (overwriteExistingContent) {
				resource = resourceSet.createResource(uri);
				final EList<EObject> content = resource.getContents();
				content.clear();
				content.add(model);
			} else {
				resource = resourceSet.getResource(uri, true);
			}
			model.setResourceFileName(uriAsString);
			Repository.saveResourceWithoutHandling(resource, model);
			return true;
		} catch (final IOException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	private static void saveResourceWithoutHandling(final Resource resource,
			final Model model) throws IOException {
		final Map<Object, Object> options = Repository.getOptions();
		resource.save(options);
	}

	private static ResourceSet getResourceSetForURI() {
		return new ResourceSetImpl();
	}

	private static Map<Object, Object> getOptions() {
		return new HashMap<Object, Object>();
	}

}
