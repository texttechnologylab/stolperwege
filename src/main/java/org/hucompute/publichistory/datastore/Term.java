package org.hucompute.publichistory.datastore;

import java.util.List;

/**
 * Created by Stolperwege on 21.06.2017.
 */
public interface Term extends StolperwegeElement {

    Predicate getPredicate();
    void setPredicate(Predicate predicate);

    void setArguments(List<Argument> arguments);
    void addArgument(int i, Argument argument);
    List<Argument> getArguments();
}
