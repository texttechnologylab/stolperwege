package org.hucompute.publichistory.datastore;

public interface RatingType extends DiscourseReferent {

    String getKey();
    void setKey(String sValue);

    String getRange();
    void setRange(String sValue);

}
