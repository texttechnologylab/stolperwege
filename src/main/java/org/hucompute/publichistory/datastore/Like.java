package org.hucompute.publichistory.datastore;

public interface Like extends DiscourseReferent {

    long getTimestamp();

    StolperwegeUser getUser();
    DiscourseReferent getTarget();


}
