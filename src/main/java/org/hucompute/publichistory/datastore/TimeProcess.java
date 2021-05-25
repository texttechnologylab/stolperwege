package org.hucompute.publichistory.datastore;

/**
 * Created by Stolperwege on 21.06.2017.
 */
public interface TimeProcess extends Time {

    void setEndDate(String v);
    String getEndDate();
}
