package org.hucompute.publichistory.datastore;

import java.util.Set;

/**
 * Created by abrami on 08.06.18.
 */
public interface Visualization extends DiscourseReferent {

    Set<String> getRequiredAnnotations();
    void setRequiredAnnotations(Set<String> pSet);

    String getUnityObjectIdentifier();
    void setUnityObjectIdentifier(String sValue);

}
