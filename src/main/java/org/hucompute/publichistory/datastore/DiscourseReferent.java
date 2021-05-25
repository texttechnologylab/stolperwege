package org.hucompute.publichistory.datastore;

import java.util.Set;

/**
 * Created by Stolperwege on 23.05.2017.
 */
public interface DiscourseReferent extends Argument {


    void addEquivalent(DiscourseReferent referent);
    void setEquivalent(Set<DiscourseReferent> referentSet);
    Set<DiscourseReferent> getEquivalents();

    boolean hasEquivalent();

}
