package org.hucompute.publichistory.datastore;

/**
 * Created by Stolperwege on 21.06.2017.
 */
public interface Position extends DiscourseReferent {

    double getLatitude();
    void setLatitude(double latitude);

    double getLongitude();
    void setLongitude(double longitude);
}
