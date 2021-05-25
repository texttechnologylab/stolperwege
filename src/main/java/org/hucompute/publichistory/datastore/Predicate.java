package org.hucompute.publichistory.datastore;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by Stolperwege on 07.04.2017.
 */
public interface Predicate extends StolperwegeElement{

    void setName(String name);
    String getName();

    Set<ArgumentRole> mendatoryRole();

    void addMendatoryRole(ArgumentRole argumentRole);

    void setMendatoryRole(ArrayList<ArgumentRole> argumentRoles);

    Set<ArgumentRole> optionalRole();

    void addOptionalRole(ArgumentRole argumentRole);

    void setOptionalRole(ArrayList<ArgumentRole> argumentRoles);
}
