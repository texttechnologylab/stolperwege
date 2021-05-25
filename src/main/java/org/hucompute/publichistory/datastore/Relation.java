package org.hucompute.publichistory.datastore;

public interface Relation extends Container {

    RelationType getRelationType();
    void setRelationType(RelationType rType);

    StolperwegeElement getStart();
    void setStart(StolperwegeElement rStart);

    StolperwegeElement getTarget();
    void setTarget(StolperwegeElement rTarget);
}
