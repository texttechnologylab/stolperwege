package org.hucompute.publichistory.datastore;

import java.util.Set;

public interface Exploration extends DiscourseReferent {

    Set<Quiz> getElements();

}
