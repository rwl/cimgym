package com.github.cimgym.rdf.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.URIConverter;

import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

import com.github.cimgym.rdf.RDFHelper;
import com.github.cimgym.rdf.RDFResource;
import com.github.cimgym.rdf.RDFSave;

public class RDFSaveImpl implements RDFSave {

    protected Model model;
    protected RDFHelper helper;
    protected RDFResource rdfResource;
    protected List<? extends EObject> roots;

    public RDFSaveImpl() {
        init();
    }

    public RDFSaveImpl(RDFHelper helper) {
        this.helper = helper;
        init();
    }

    protected void init() {
        this.model = ModelFactory.createDefaultModel();
    }

    public void save(RDFResource resource, OutputStream outputStream, Map<?, ?> options) throws IOException {
        if (outputStream instanceof URIConverter.Writeable) {
            throw new UnsupportedOperationException();
        }
        this.rdfResource = resource;
        List<? extends EObject> contents= resource.getContents();
        traverse(contents);
    }

    public void traverse(List<? extends EObject> contents) {
        EObject top = contents.get(0);
        EClass eClass = top.eClass();
        System.out.println("Top: " + eClass.getEPackage().getNsURI());

        String nsURI = eClass.getEPackage().getNsURI();
        String nsPrefix = eClass.getEPackage().getNsPrefix();
        model.setNsPrefix(nsPrefix, nsURI);
        Resource pkg = model.createResource(nsURI + eClass.getName());

        Property attr = model.createProperty(nsURI, "EAttribute");

        for (EAttribute eAttribute : eClass.getEAllAttributes()) {
            System.out.println("Attribute: " + eAttribute.getName());
            pkg.addProperty(attr, eAttribute.getName());
        }

        model.write(System.out);
    }

    protected void writeTopObject(EObject top) {
        EClass eClass = top.eClass();
//        EPackage topPackage = (EPackage) top;

//        for (EClassifier eClass : topPackage.getEClassifiers()) {
//            com.hp.hpl.jena.rdf.model.Resource klass = model.createResource(eClass.getName());
//        }
    }
}
