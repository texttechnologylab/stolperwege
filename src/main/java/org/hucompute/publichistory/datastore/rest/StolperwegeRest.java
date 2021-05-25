package org.hucompute.publichistory.datastore.rest;


import org.hucompute.publichistory.datastore.Container;
import org.json.JSONObject;

/**
 * Created by abrami on 21.12.16.
 */
public interface StolperwegeRest extends Container {

    enum METHODS{GET,POST,PUT,DELETE};

    JSONObject doRest(METHODS m, String sCMD, JSONObject params);

    JSONObject doRest(METHODS m, String sCMD, JSONObject params, String sSession);

    JSONObject getFromRest(String sCMD, JSONObject params);
    JSONObject postToRest(String sCMD, JSONObject params);
    JSONObject deleteFromRest(String sCMD, JSONObject params);
    JSONObject putToRest(String sCMD, JSONObject params);

    JSONObject getFromRest(String sCMD, JSONObject params, String sSession);

    JSONObject postToRest(String sCMD, JSONObject params, String sSession);

    JSONObject deleteFromRest(String sCMD, JSONObject params, String sSession);

    JSONObject putToRest(String sCMD, JSONObject params, String sSession);

}
