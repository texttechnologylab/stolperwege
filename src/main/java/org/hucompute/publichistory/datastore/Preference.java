package org.hucompute.publichistory.datastore;

public interface Preference extends DiscourseReferent {

    String getKey();

    void setKey(String sValue);

    String getValue();

    void setValue(String sValue);

}
