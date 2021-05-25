package org.hucompute.publichistory.datastore;

/**
 * Created by abrami on 21.02.18.
 */
public interface ToolChain extends DiscourseReferent {

    String getLanguage();
    void setLanguage(String sLanguage);

    String getTools();
    void setTools(String sTools);

}
