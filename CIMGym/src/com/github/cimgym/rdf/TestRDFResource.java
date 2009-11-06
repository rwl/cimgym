package com.github.cimgym.rdf;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import com.github.cimgym.rdf.impl.RDFResourceFactoryImpl;

public class TestRDFResource {

    public static void main(String[] args) {
        String ecorePath = args[0];
        String rdfPath = args[1];

        System.out.println("ECore path: " + ecorePath);
        System.out.println("RDF path: " + rdfPath);

        ResourceSet resourceSet = new ResourceSetImpl();

        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                "*", new EcoreResourceFactoryImpl());

        Resource ecoreResource = resourceSet.getResource(URI.createURI(ecorePath), true);
        EPackage ePackage = (EPackage)ecoreResource.getContents().get(0);


        ResourceSet metaResourceSet = new ResourceSetImpl();
        metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
            "rdf", new  RDFResourceFactoryImpl());
        // Create empty resource with the given URI
        org.eclipse.emf.ecore.resource.Resource metaResource =
            metaResourceSet.createResource(URI.createURI(rdfPath));
        metaResource.getContents().add(ePackage);
        try {
            metaResource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
