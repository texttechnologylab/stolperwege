package org.hucompute.publichistory.datastore;

public interface UnityPosition extends Position {

    String getPositionVector();
    void setPositionVector(String vector);
}
