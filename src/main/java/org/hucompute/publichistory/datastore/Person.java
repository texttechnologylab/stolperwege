package org.hucompute.publichistory.datastore;

import javax.print.URIException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

public interface Person extends DiscourseReferent {

    enum GENDER {male, female}

    void setLastName(String sValue);
    String getLastName();

    void setFirstName(String sValue);
    String getFirstName();

    void setOptionalName(Set<String> sValues);
    void addOptionalName(String sValue);
    Set<String> getOptionalName();

    void setGender(GENDER pGender);
    GENDER getGender();

    boolean hasStolperstein();
    void setStolperstein(Stolperstein pStolperstein);
    Stolperstein getStolperstein();

    Time getBirth();
    void setBirth(Time pDate);
    String getDateOfBirth(String format);

    Time getDeath();
    void setDeath(Time pDate);
    String getDateOfDeath(String format);

    Person getFather();
    void setFather(Person pPerson);

    Person getMother();
    void setMother(Person pPerson);

    List<Person> getRelatedPersons();
    void addRelatedPerson(Person p);
    void setRelatedPersons(List<Person> pSet);

    List<Event> getEvents();
    void setEvents(List<Event> eventSet);
    void addEvent(Event pEvent);

    void setGnd(String gnd);
    String getGnd();


}
