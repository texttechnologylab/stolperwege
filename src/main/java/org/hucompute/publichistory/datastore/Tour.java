package org.hucompute.publichistory.datastore;

/**
 * Created by abrami on 15.12.17.
 */
public interface Tour extends UnityPosition {

    Waypoint getPrevious();
    void setPrevious(Waypoint pWaypoint);

    Waypoint getNext();
    void setNext(Waypoint pWaypoint);

}
