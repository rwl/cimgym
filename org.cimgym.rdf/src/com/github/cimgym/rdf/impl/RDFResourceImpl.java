package com.github.cimgym.rdf.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.github.cimgym.rdf.RDFHelper;
import com.github.cimgym.rdf.RDFResource;
import com.github.cimgym.rdf.RDFSave;

public class RDFResourceImpl extends ResourceImpl implements RDFResource {

    public RDFResourceImpl() {
        super();
    }

    /**
     * Constructor for RDFResourceImpl.
     */
    public RDFResourceImpl(URI uri) {
        super(uri);
    }

    public Map<Object, Object> getDefaultSaveOptions() {
        if (defaultSaveOptions == null) {
            defaultSaveOptions = new HashMap<Object, Object>();
        }
        return defaultSaveOptions;
    }

    public Map<Object, Object> getDefaultLoadOptions() {
        if (defaultLoadOptions == null) {
            defaultLoadOptions = new HashMap<Object, Object>();
        }
        return defaultLoadOptions;
    }

    protected RDFHelper createRDFHelper() {
        return new RDFHelperImpl(this);
    }

    protected RDFSave createRDFSave() {
        return new RDFSaveImpl(createRDFHelper());
    }

    @Override
    public void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
        RDFSave rdfSave = createRDFSave();

        if (options == null) {
            options = Collections.EMPTY_MAP;
        }

//        ResourceHandler handler = (ResourceHandler)options.get(OPTION_RESOURCE_HANDLER);

//        if (handler != null) {
//            handler.preSave(this, outputStream, options);
//        }

        rdfSave.save(this, outputStream, options);

//        if (handler != null) {
//            handler.postSave(this, outputStream, options);
//        }
    }
}
