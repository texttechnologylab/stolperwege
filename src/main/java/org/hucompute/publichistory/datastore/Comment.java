package org.hucompute.publichistory.datastore;

public interface Comment extends Text {

    long getTimestamp();

    StolperwegeUser getAuthor();

    DiscourseReferent getTarget();

}
