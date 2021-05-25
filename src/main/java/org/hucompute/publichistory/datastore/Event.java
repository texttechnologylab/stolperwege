package org.hucompute.publichistory.datastore;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by abrami on 20.12.16.
 */
public interface Event extends DiscourseReferent {

    Time getStartDate();
    void setStartDateTime(Time pDate);
    void setStartDate(Date pDate);

    Time getEndDate();
    void setEndDateTime(Time pDate);
    void setEndDate(Date pDate);

    String getEreignis();
    void setEreignis(String sValue);

    List<Person> getPersons();
    void setPersons(List<Person> pPerson);
    void addPerson(Person pPerson);

    List<Event> startsWith();
    void addStartsWith(Event pEvent);
    void setStartsWith(List<Event> pEvent);

    List<Event> endsWith();
    void addEndsWith(Event pEvent);
    void setEndsWith(List<Event> pEvent);

    List<Event> continueWith();
    void addContinueWith(Event pEvent);
    void setContinueWith(List<Event> pEvent);

    Place getPlace();
    List<Place> getPlaces();
    void addPlace(Place pPlace);
    void setPlaces(List<Place> pPlace);

    Set<Proposition> hasProposition();

}
