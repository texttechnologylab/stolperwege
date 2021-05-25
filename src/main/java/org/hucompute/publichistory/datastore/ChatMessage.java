package org.hucompute.publichistory.datastore;

import java.sql.Timestamp;

/**
 * Created by s2717197 on 25.11.16.
 */

public interface ChatMessage extends Container {

    Object getContent();

    Timestamp getTimestamp();

    Timestamp getRead();
    void setRead();
    boolean isRead();

    boolean isDeleted();

    void delete();

    StolperwegeUser getSender();



}
