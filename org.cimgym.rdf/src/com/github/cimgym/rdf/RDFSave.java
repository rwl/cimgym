package com.github.cimgym.rdf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/**
 * This defines the methods for the interface that RDFResourceImpl
 * uses to save the resource.
 */
public interface RDFSave {
    /** Saves the resource to the output stream using the specified options.
     * @param resource
     * @param output stream
     * @param options
     * @throws IOException
     */
    void save(RDFResource resource, OutputStream outputStream, Map<?, ?> options) throws IOException;
}
