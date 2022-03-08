package org.hucompute.publichistory.datastore;

import java.util.Set;

/**
 * Created by Stolperwege on 21.06.2017.
 */
public interface TimeLayer extends TimeProcess {

    void addElement(String sValue);

    void removeElement(String sValue);

    Set<String> getElements();
}
