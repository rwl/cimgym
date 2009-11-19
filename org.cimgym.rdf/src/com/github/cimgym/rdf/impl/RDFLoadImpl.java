package com.github.cimgym.rdf.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import com.github.cimgym.rdf.RDFHelper;
import com.github.cimgym.rdf.RDFLoad;
import com.github.cimgym.rdf.RDFResource;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class RDFLoadImpl implements RDFLoad {

    protected RDFHelper helper;

    public RDFLoadImpl(RDFHelper helper) {
        this.helper = helper;
    }

    public void load(RDFResource resource, InputStream inputStream, Map<?, ?> options) throws IOException {

        // create an empty model
        Model model = ModelFactory.createDefaultModel();

        // read the RDF/XML file
        model.read(new InputStreamReader(inputStream), "file:"+resource.getURI().toFileString(), "RDF/XML");


        System.out.println(model.getNsPrefixMap().toString());

        Map<String, String> nsPrefixMap = model.getNsPrefixMap();

        EPackage schema = EPackage.Registry.INSTANCE.getEPackage(nsPrefixMap.get("cim"));

        System.out.println(schema.toString());
    }

}
