package org.hucompute.publichistory.datastore;


import java.net.URI;
import java.util.List;

/**
 * Created by Simon on 05.12.2016.
 */
public interface Place extends DiscourseReferent {

    Position getPos();
    void setPos(Position pos);



}
