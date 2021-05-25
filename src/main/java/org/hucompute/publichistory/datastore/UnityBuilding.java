package org.hucompute.publichistory.datastore;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Stolperwege on 16.12.2016.
 */
public interface UnityBuilding extends UnityObject {

    String getScene();
    void setScene(String sURI);

    String getModel();
    void setModel(String sURI);

    String getPrefab();
    void setPrefab(String sURI);

    float getScale();
    void setScale(float fValue);

    int getAngle();
    void setAngle(int iAngle);


}
