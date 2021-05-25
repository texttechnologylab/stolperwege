package org.hucompute.publichistory.datastore;

import java.util.Set;

/**
 * Created by abrami on 04.12.17.
 */
public interface UnityObject extends DiscourseReferent  {

    float getVerstion();
    void setVersion(float fVersion);

    float getScale();
    void setScale(float fScale);

    String getModel();
    void setModel(String sModel);

    Set<UnityObject> getChildren();
    void setChildren(Set<UnityObject> pChildren);
    void addChild(UnityObject pChild);

}
