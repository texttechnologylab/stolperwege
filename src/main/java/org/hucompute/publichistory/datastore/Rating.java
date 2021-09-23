package org.hucompute.publichistory.datastore;

public interface Rating extends UnityPosition {

    String getScale();
    void setScale(String vector);

    RatingType getRatingType();
    void setRatingType(RatingType pType);

}
