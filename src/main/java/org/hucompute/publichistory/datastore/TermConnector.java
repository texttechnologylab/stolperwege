package org.hucompute.publichistory.datastore;

import java.util.List;

/**
 * Created by Stolperwege on 21.06.2017.
 */
public interface TermConnector extends StolperwegeElement{

    Connector getConntector();
    void setConnector(Connector connector);

    void setTerms(List<Term> terms);
    void addTerm(int i, Term term);
    List<Term> getTerms();
}
