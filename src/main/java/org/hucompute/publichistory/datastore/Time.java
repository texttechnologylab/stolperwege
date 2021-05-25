package org.hucompute.publichistory.datastore;

import java.util.Calendar;

/**
 * Created by Stolperwege on 23.05.2017.
 */
public interface Time extends DiscourseReferent {

    void setTime(String sTime);
    String getTime();

    String getTime(String sFormat);
}
