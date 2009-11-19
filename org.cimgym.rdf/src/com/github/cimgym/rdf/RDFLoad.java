package com.github.cimgym.rdf;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import com.github.cimgym.rdf.RDFResource;

/**
 * This defines the methods for the interface that RDFResourceImpl
 * uses to load the resource.
 */
public interface RDFLoad {
	  void load(RDFResource resource, InputStream inputStream, Map<?, ?> options) throws IOException;
}
