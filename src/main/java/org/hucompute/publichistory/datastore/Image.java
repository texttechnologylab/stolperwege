package org.hucompute.publichistory.datastore;

/**
 * Created by Stolperwege on 21.06.2017.
 */
public interface Image extends DiscourseReferent {

    String getLicense();
    void setLicense(String license);

    String getAuthor();
    void setAuthor(String author);

    String getCite();
    void setCite(String cite);

}
