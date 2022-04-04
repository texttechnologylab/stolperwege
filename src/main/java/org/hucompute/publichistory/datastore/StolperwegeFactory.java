package org.hucompute.publichistory.datastore;


import org.hucompute.publichistory.datastore.typesystem.Journey;
import org.hucompute.publichistory.datastore.typesystem.Quiz;

import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Set;

/**
 * Created by abrami on 13.09.16.
 */
public interface StolperwegeFactory {

    StolperwegeUser getUserByURI(String sURI);

    StolperwegeUser getUser(String sParam);

    StolperwegeUser getUser(long lId);

    Set<StolperwegeUser> getUsers();

    StolperwegeUser createUser(String sUsername, String sFullname, String sPassword, String sMail);

    Chat getChat(long lID);

    Chat getChat(String pString) throws URISyntaxException;

    Chat getChat(StolperwegeUser owner, Set<StolperwegeUser> participants);

    Chat createChat(StolperwegeUser owner, Set<StolperwegeUser> participants);

    Set<Chat> getChats(StolperwegeUser pUser);

    ChatMessage createMessage(StolperwegeUser sender, Object content);

    Place createPlace(GeoPoint position, String title);

    Person createPerson(String firstname, String lastname);

    Event createEvent(Time startdate);

    Stolperstein createStolperstein(Place place, Person person);

    Set<Place> getPlacesByURI(String[] sURIs);

    Set<Person> getPersonsByURI(String[] sURIs);

    Set<Event> getEventsByURI(String[] sURIs);

    Set<Stolperstein> getStolpersteineByURI(String[] sURIs);

    Set<Place> getPlaces();

    Set<Person> getPersons();

    Set<Event> getEvents();

    Set<Stolperstein> getStolpersteine();

    ArgumentRole createArgumentRole(String name);

    Predicate createPredicate(String name);

    Proposition createProposition(String name, Predicate predicate);

    Set<ArgumentRole> getArgumentRoleByURI(String[] sURIs);

    Set<Predicate> getPredicateByURI(String[] sURIs);

    Set<Proposition> getPropositionByURI(String[] sURIs);

    Set<Argument> getArgumentByURI(String[] sURIs);

    Set<ArgumentRole> getArgumentRoles();

    Set<Predicate> getPredicates();

    Set<Proposition> getPropositions();

    Set<DiscourseReferent> getDiscouseReferentByURI(String[] sURIs);

    Set<DiscourseReferent> getDiscourseReferents();

    DiscourseReferent createDiscourseReferent(String title);

    TimeLayer createTimeLayer(String sValue);

    TimeLayer createTimeLayer(String sValue, boolean bElementsOnly);
    TimeLayer getTimeLayer(String sValue);

    Journey createJourney(String sValue, Set<Quiz> pQuizes);

    Journey getJourney(String sValue);

    Set<Time> getTimes();
    Set<Time> getTimeByURI(String[] sURIs);
    Time createTime(Calendar calendar);

}
