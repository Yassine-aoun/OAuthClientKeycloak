//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.04.24 at 11:32:56 AM BST 
//


package com.baeldung;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.baeldung package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.baeldung
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductDetailsRequest }
     * 
     */
    public GetProductDetailsRequest createGetProductDetailsRequest() {
        return new GetProductDetailsRequest();
    }

    /**
     * Create an instance of {@link DeleteProductRequest }
     * 
     */
    public DeleteProductRequest createDeleteProductRequest() {
        return new DeleteProductRequest();
    }

    /**
     * Create an instance of {@link GetProductDetailsResponse }
     * 
     */
    public GetProductDetailsResponse createGetProductDetailsResponse() {
        return new GetProductDetailsResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

}
