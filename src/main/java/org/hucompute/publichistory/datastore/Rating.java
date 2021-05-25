package org.hucompute.publichistory.datastore;

public interface Rating extends UnityPosition {

    String getScale();
    void setScale(String vector);

    String getRatingType();
    void setRatingType(String sValue);

}
