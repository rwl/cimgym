package com.github.cimgym.rdf.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class RDFResourceFactoryImpl extends ResourceFactoryImpl {

    /**
     * Constructor for XMLResourceFactoryImpl.
     */
	public RDFResourceFactoryImpl() {
	    super();
	}

	/**
	 * Creates an RDFResourceImpl and returns it.
	 */
	@Override
	public Resource createResource(URI uri) {
		return new RDFResourceImpl(uri);
	}
}
