package org.hucompute.publichistory.datastore;

import org.hucompute.publichistory.app.StolperwegeAppElement;

import java.util.Set;

/**
 * Created by abrami on 28.09.16.
 */
public interface MBTile extends StolperwegeAppElement {

    Set<GeoPoint> getBoundingBox();

    Set<MBTile> getTiles(GeoPoint northEast, GeoPoint southWest);

    Set<MBTile> getTiles(GeoPoint northEast, GeoPoint southWest, int zoom);

}
