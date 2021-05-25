package org.hucompute.publichistory.datastore;

import java.util.Set;

public interface StolperwegeSet extends DiscourseReferent {

    Set<StolperwegeElement> getContains();
    void setContains(Set<StolperwegeElement> pContains);
}
