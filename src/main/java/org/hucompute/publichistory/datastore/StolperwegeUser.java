package org.hucompute.publichistory.datastore;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by abrami on 11.03.16.
 */
public interface StolperwegeUser extends DiscourseReferent {

    enum STATUS {online, offline}

    void setName(String newName);
    String getName();

    String getUsername();

    String getRealName();
    void setRealName(String sRealName);

    void setPosition(GeoPoint pPoint);
    GeoPoint getPosition();

    String getMail();
    void setMail(String sMail);

    STATUS getStatus();
    void setStatus(STATUS eStatus);

    void setPassword(String sPassword);
    String getPassword();

    URI getPicture() throws URISyntaxException, MalformedURLException;
    void setPicture(URI picture);


}
