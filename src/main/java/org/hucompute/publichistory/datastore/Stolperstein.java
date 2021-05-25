package org.hucompute.publichistory.datastore;

import org.hucompute.publichistory.app.StolperwegeAppElement;

import java.net.URI;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

/*
*   Ein Stolperstein ist ein Konstrukt des Künstlers Günter Demnig
*   und besteht aus einer oder keiner Überschrift
*   einem Namen, ggf. einem Geburtsnamen sowie den Jahrgang oder das Geburtsdatum einer Person.
*   Darüberhinaus enthält er eine Liste von Ereignissen.
* */
public interface Stolperstein extends StolperwegeAppElement {

    List<Event> getEreignisse();
    void addEreignis(Event pEreignis);
    void setEreignisse(List<Event> listEreignisse);

    List<URI> getImages();
    void addImage(URI pUri);
    void setImages(List<URI> images);

    Person getPerson();
    boolean hasPerson();
    void setPerson(Person pPerson);

    Place getPlace();
    void setPlace(Place place);

}
