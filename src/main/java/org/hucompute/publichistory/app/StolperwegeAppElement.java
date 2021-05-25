package org.hucompute.publichistory.app;



import org.hucompute.publichistory.datastore.Container;
import org.hucompute.publichistory.datastore.Event;
import org.hucompute.publichistory.datastore.GeoPoint;

import java.util.List;

/**
 * Created by abrami on 16.12.16.
 * Ein StolperwegeElement ist jedes Element welches in der StolperwegeApp dargestellt werden kann.
 */
public interface StolperwegeAppElement extends Container {

    List<GeoPoint> getPositions();

    GeoPoint getPosition();

    GeoPoint getPosition(int iPosition);

    void setPosition(List<GeoPoint> lPoints);

    void addPosition(GeoPoint position);

    int getMaxZoom();
    int getMinZoom();

    void setMaxZoom(int iZoom);
    void setMinZoom(int iZoom);

    List<Event> getEvents();

    void addEvent(Event pEvent);
    void addEvents(List<Event> pEventSet);


}
