package org.hucompute.publichistory.datastore;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by s2717197 on 25.11.16.
 */

public interface Chat extends Container {

    ChatMessage addMessage(ChatMessage message);

    void deleteMessage(ChatMessage message);

    Set<ChatMessage> getMessages(StolperwegeUser pUser);

    Set<ChatMessage> getMessages();
    Set<ChatMessage> getMessagesCount(int count);
    Set<ChatMessage> getMessages(int from, int to);
    Set<ChatMessage> getMessagesTime(Timestamp time);

    Set<StolperwegeUser> getParticipants();
    void setParticipants(Set<StolperwegeUser> users);
    void addParticipant(StolperwegeUser user);

    ChatMessage getLastMessage();

    StolperwegeUser getOwner();

    boolean isDeleted();

    void setDelete();

    void setOwner(StolperwegeUser pUser);

    Timestamp getCreateTime();
    void setCreateTime(Timestamp ts);



}
