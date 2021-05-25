package org.hucompute.publichistory.datastore;

/**
 * Created by abrami on 02.08.17.
 */
public interface Neo4J {

    Object getProperty(String sProperty);
    Object getProperty(String sProperty, Object pDefault);



}
