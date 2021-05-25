package org.hucompute.publichistory.datastore;

/**
 * Created by abrami on 02.02.17.
 */
public interface GeoPoint<T> {

    double getLat();

    double getLon();

    double getLatitude();

    double getLongitude();

    T getInstance();

}
