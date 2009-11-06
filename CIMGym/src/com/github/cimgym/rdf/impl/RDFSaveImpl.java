package com.github.cimgym.rdf.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import com.github.cimgym.rdf.RDFHelper;
import com.github.cimgym.rdf.RDFResource;
import com.github.cimgym.rdf.RDFSave;

public class RDFSaveImpl implements RDFSave {

    protected RDFHelper helper;

    public RDFSaveImpl() {
        // TODO Auto-generated constructor stub
    }

    public RDFSaveImpl(RDFHelper helper) {
        this.helper = helper;
    }

    public void save(RDFResource resource, OutputStream outputStream,
            Map<?, ?> options) throws IOException {
        // TODO Auto-generated method stub

    }

}
