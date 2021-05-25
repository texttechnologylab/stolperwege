package org.hucompute.publichistory.datastore;

import org.hucompute.publichistory.app.StolperwegeAppElement;

public interface RelationType extends Container{

    String getRangeFrom();
    void setRangeFrom(String rRange);

    String getRangeTo();
    void setRangeTo(String rRange);

    String getName();
    void setName(String name);
}
