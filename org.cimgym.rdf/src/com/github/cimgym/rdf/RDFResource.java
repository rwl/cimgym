package com.github.cimgym.rdf;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * This interface represents an RDF resource.
 * You can use it to load and save RDF documents.
 */
public interface RDFResource extends Resource {

      /**
       * Write only the subtree starting at the specified list of EObjects,
       * which must be objects contained by the resource.
       */
      String OPTION_ROOT_OBJECTS = "ROOT_OBJECTS";
}
