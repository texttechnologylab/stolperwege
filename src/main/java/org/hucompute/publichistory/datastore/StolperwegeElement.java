package org.hucompute.publichistory.datastore;

import org.hucompute.publichistory.app.StolperwegeAppElement;

/**
 * Created by Stolperwege on 21.06.2017.
 */
public interface StolperwegeElement extends StolperwegeAppElement {

    String getValue();
    void setValue(String value);

    String getID();
    void setID(String id);

    String getDescription();
    void setDescription(String description);
}
