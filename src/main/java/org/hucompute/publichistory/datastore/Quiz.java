package org.hucompute.publichistory.datastore;

import java.util.Set;

public interface Quiz extends DiscourseReferent {

    Set<StolperwegeUser> getParticipants();
    Set<Text> getAnwsers();

}
