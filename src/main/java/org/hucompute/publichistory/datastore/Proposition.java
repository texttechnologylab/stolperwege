package org.hucompute.publichistory.datastore;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created by Stolperwege on 07.04.2017.
 */
public interface Proposition extends Argument{

    List<Event> hasEvent();

    void setEvent(Event event);

    void setEvents(List<Event> events);

    void setTermconnectors(List<TermConnector> termconnectors);
    List<TermConnector> getTermConnectors();
    void addTermConntector(int i, TermConnector termconnector);
}
