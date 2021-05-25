package org.hucompute.publichistory.datastore;

/**
 * Created by abrami on 15.12.17.
 */
public interface Cite extends DiscourseReferent {

    String getLicence();
    void setLicence(String sValue);

    String getAuthor();
    void setAuthor(String sValue);

    String getCite();
    void setCite(String sValue);

    String getBibTex();
    void setBobTex(String sValue);

}
