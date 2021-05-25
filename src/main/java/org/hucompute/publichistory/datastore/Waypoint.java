package org.hucompute.publichistory.datastore;

/**
 * Created by abrami on 15.12.17.
 */
public interface Waypoint extends UnityPosition {

    boolean getVisible();
    void setVisible(boolean bValue);

    String getArea();
    void setArea(String sArea);

}
