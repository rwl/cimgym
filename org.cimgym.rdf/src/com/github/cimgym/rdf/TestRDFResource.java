package com.github.cimgym.rdf;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import CPSM.CPSMPackage;

import com.github.cimgym.rdf.impl.RDFResourceFactoryImpl;

public class TestRDFResource {

    public static void main(String[] args) {
//        String ecorePath = args[0];
//        String rdfPath = args[1];
//        String ecorePath = "platform:/resource/cimgym/org.cimgym.cpsm/model/CPSM.ecore";
//        String rdfPath = "platform:/resource/cimgym/org.cimgym.rdf/data/areva05-cpsm.xml";
        String ecorePath = "/home/rwl/workspace/cimgym/org.cimgym.cpsm/model/CPSM.ecore";
        String rdfPath = "/home/rwl/workspace/cimgym/org.cimgym.rdf/data/areva05-cpsm.rdf";

        System.out.println("ECore path: " + ecorePath);
        System.out.println("RDF path: " + rdfPath);

        ResourceSet resourceSet = new ResourceSetImpl();

        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                "*", new EcoreResourceFactoryImpl());

//        resourceSet.getPackageRegistry().INSTANCE.put(CPSMPackage.eNS_URI, CPSMPackage);

        Resource ecoreResource = resourceSet.getResource(URI.createURI(ecorePath), true);
        EPackage ePackage = (EPackage)ecoreResource.getContents().get(0);


        ResourceSet metaResourceSet = new ResourceSetImpl();
        metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
            "rdf", new  RDFResourceFactoryImpl());

        // Create empty resource with the given URI
        org.eclipse.emf.ecore.resource.Resource metaResource =
            metaResourceSet.createResource(URI.createURI(rdfPath));

//        metaResource.getContents().add(ePackage);
//        try {
//            metaResource.save(null);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            metaResource.load(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
