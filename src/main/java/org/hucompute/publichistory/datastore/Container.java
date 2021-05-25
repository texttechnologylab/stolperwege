package org.hucompute.publichistory.datastore;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by abrami on 15.12.16.
 */
public interface Container extends Comparable<Container>, Serializable {

    URI getURI() throws URISyntaxException;

    String getTitle();
    void setTitle(String sValue);

    String getDescription();
    void setDescription(String sValue);;

    void delete();

    JSONObject toJSON() throws JSONException, URISyntaxException;

    JSONObject getReference() throws JSONException, URISyntaxException;

    JSONArray toJSONArray() throws JSONException, URISyntaxException;

    void update();
}
