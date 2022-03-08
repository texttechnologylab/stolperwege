package org.hucompute.publichistory.datastore.typesystem;


import org.apache.uima.jcas.cas.AnnotationBase;
import org.hucompute.publichistory.datastore.GeoPoint;

import java.util.Set;

/**
 * Created by abrami on 02.06.17.
 */
public interface StolperwegeUIMAFactory {

    Person createPerson(String sFirstName, String sLastName);
    Person createPerson(String sFirstName, String sLastName, String fullname);
    Person getPerson(String sURI);
    Person findPerson(String sValue);
    Set<Person> findPersons(String sValue);
    Set<Person> listPersons();
    boolean deletePerson(Person pPerson);

    Time createTime(long timestamp);
    Time getTime(String sURI);
    Set<Time> findTimes(String sValue);
    Set<Time> listTimes();
    boolean deleteTime(Time pTime);

    Place createPlace(String sPlace, Position pPosition);
    Place getPlace(String sURI);
    Set<Place> findPlaces(String sValue);
    Place findPlace(String sValue);
    Set<Place> listPlaces();
    Set<Place> listPlaces(GeoPoint geoPoint, double distance);

    boolean deletePlace(Place pPlace);

    TimeProcess createTimeProcess(long fromTime, long toTime);
    TimeProcess getTimeProcess(String sURI);
    Set<TimeProcess> listTimeProcesses();
    boolean deleteTimeProcess(TimeProcess pTimeProcess);

    Event createEvent();
    Event createEvent(String title, Time pStart, Time pEnd);
    Event getEvent(String sURI);
    Set<Event> findEvent(String sValue);
    Set<Event> listEvents();
    boolean deleteEvent(Event pEvent);

    Argument createArgument(String sTitle, String sDescription);
    Argument getArgument(String sURI);
    Set<Argument> findArguments(String sValue);
    Set<Argument> listArguments();
    boolean deleteArgument(Argument pArgument);

    ArgumentRole createRole(String sName);
    ArgumentRole getRole(String sURI);
    ArgumentRole findRole(String sValue);
    Set<ArgumentRole> listRoles();
    boolean deleteRole(ArgumentRole pRole);

    Connector createConnector(String sValue);
    Connector getConnector(String sURI);
    Connector findConnector(String sValue);
    Set<Connector> listConnectors();

    Position createPosition(double latitude, double longitude);
    Position getPosition(String sURI);
    Set<Position> findPosition(String pos);
    Set<Position> listPositions();
    Set<Position> listPositions(double latitude1, double longitude1, double latitude2, double longitude2);
    Set<Position> listPositions(double latitude1, double longitude1);
    boolean deletePosition(Position pPosition);

    Predicate createPredicate(String sValue, Set<ArgumentRole> mendatoryRoles, Set<ArgumentRole> optionalRoles);
    Predicate getPredicate(String sURI);
    Set<Predicate> listPredicates();
    Set<Predicate> listPredicates(ArgumentRole... pRoles);
    boolean deletePredicate(Predicate pProposition);

    Proposition createProposition();
    Proposition getProposition(String sURI);
    Set<Proposition> listProposition();
    Set<Proposition> listProposition(ArgumentRole... pRoles);
    boolean deleteProposition(Proposition pProposition);
    Set<Proposition> findPropositions(Set<DiscourseReferent> pReferent);

    Term createTerm(Predicate pPredicate, Argument... args);
    Term createTerm(Predicate pPredicate, Set<Argument> args);
    Term getTerm(String sURI);
    Set<Term> listTerms();
    Set<Term> listTerms(ArgumentRole... pRoles);
    Set<Term> listTerms(DiscourseReferent pReferent);
    boolean deleteTerm(Term pTerm);

    TermConnector createTermConnector(Term pTerm, Connector pConnector);
    TermConnector createTermConnector(Set<Term> pTerm, Connector pConnector);
    TermConnector  getTermConnector(String sURI);
    Set<TermConnector> listTermConnectors();
    boolean deleteTermConnector(TermConnector pTermConnector);

    DiscourseReferent createDiscourseReferent(String sValue, String sDescription);
    DiscourseReferent getDiscourseReferent(String sURI);
    Set<DiscourseReferent> listDiscourseReferents();
    boolean deleteDiscourseReferent(DiscourseReferent pObject);
    Set<DiscourseReferent> findEquivalents(DiscourseReferent pObject);

    Image createImage(String sValue, String sDescription);
    Image getImage(String sURI);
    Image findImage(String sValue);
    Set<Image> listImages();
    boolean deleteImage(Image pObject);

    StolperwegeUser createStolperwegeUser(String sUsername, String sFullname, String sPassword, String sMail);
    StolperwegeUser getStolperwegeUser(String sURI);
    StolperwegeUser getStolperwegeUserByUsername(String sUsername);
    Set<StolperwegeUser> listStolperwegeUser();
    boolean deleteStolperwegeUser(StolperwegeUser pObject);

    Audio createAudio(String sValue, String sURI);
    Audio getAudio(String sURI);
    Set<Audio> listAudio();
    boolean deleteAudio(Audio pObject);

    UnityObject createUnityObject(String sValue, String sModel, float fScale);
    UnityObject getUnityObject(String sURI);
    Set<UnityObject> listUnityObjects();
    boolean deleteUnityObject(UnityObject pObject);

    Avatar createAvatar(String sValue, String sModel, float fScale);
    Avatar  getAvatar(String sURI);
    Set<Avatar> listAvatars();
    boolean deleteAvatar(Avatar pObject);

    Video createVideo(String sValue, String sURI);
    Video getVideo(String sURI);
    Set<Video> listVideo();
    boolean deleteVideo(Video pObject);

    Text createText(String sValue, String sURI);
    Text getText(String sURI);
    Set<Text> listText();
    boolean deleteText(Text pObject);

    Message createMessage(String sValue, StolperwegeUser sender, Set<StolperwegeUser> reciever);
    Message getMessage(String sURI);
    Set<Message> listMessages();
    Set<Message> listMessages(StolperwegeUser pUser);
    boolean deleteMessage(Message pObject);

    UnityBuilding createUnityBuilding(String sValue, Position pPosition, String sModel, String sScene, String sPrefab, float fScale, int iAngle);
    UnityBuilding getUnityBuilding(String sURI);
    UnityBuilding findUnityBuilding(String sValue);
    Set<UnityBuilding> listUnityBuildings();
    boolean deleteUnityBuilding(UnityBuilding pObject);

    UnityPosition createUnityPosition(String sVector, String sScale, UnityBuilding pBuilding);
    UnityPosition getUnityPosition(String sURI);
    Set<UnityPosition> listUnityPosition();
    Set<UnityPosition> listUnityPosition(UnityBuilding pBuilding);
    boolean deleteUnityPosition(UnityPosition pObject);

    Rating createRating(String sVector, String sScale, UnityBuilding pBuilding, int iRating, RatingType pRatingType);
    Rating getRating(String sURI);
    Set<Rating> listRating();
    Set<Rating> listRating(UnityBuilding pBuilding);
    boolean deleteRating(Rating pObject);

    RatingType createRatingType(String sKey, String sRange);
    RatingType getRatingType(String sURI);
    Set<RatingType> listRatingTypes();
    Set<RatingType> listRatingTypes(UnityBuilding pBuilding);
    boolean deleteRatingType(RatingType pObject);

    StolperwegeUri createUri(String sValue);
    StolperwegeUri getUri(String sURI);
    Set<StolperwegeUri> listUris();
    boolean deleteUri(StolperwegeUri pObject);

    Permission createPermission(String sValue);
    Permission getPermission(String sURI);
    Permission findPermission(String sValue);
    Set<Permission> listPermissions();
    boolean deletePermission(Permission pPermission);

    VirtualRoom createRoom(String sValue);
    VirtualRoom getRoom(String sURI);
    Set<VirtualRoom> listRooms();
    boolean deleteRoom(VirtualRoom pRoom);


    Cite createCite(String sValue, String sDescription, String sLicence, String sAuthor, String sHowToCite, String sBibTex);
    Cite getCite(String sURI);
    Cite findCite(String sValue);
    Set<Cite> listCites();
    boolean deleteCite(Cite pCite);


    Waypoint createWaypoint(String sVector, String sArea, boolean bVisible);
    Waypoint getWaypoint(String sURI);
    Waypoint findWaypoint(String sValue);
    Set<Waypoint> listWaypoints();
    boolean deleteWaypoint(Waypoint pWaypoint);

    Tour createTour(String sVector);
    Tour getTour(String sURI);
    Tour findTour(String sValue);
    Set<Tour> listTours();
    boolean deleteTour(Tour pTour);


    Set<Preference> getPreferences(DiscourseReferent pDiscourceReferent);

    Set<Preference> getPreferences();
    Preference getPreference(DiscourseReferent pDiscourceReferent, String sValue);
    void addPreference(DiscourseReferent pDiscourceReferent, Preference pPreference);
    void deletePreference(DiscourseReferent pDiscourceReferent, Preference pPreference);
    Preference createPreference(String key, Object value);

    Photogrammetrie createPhotogrammetrie(String sValue, String description, String model, String materials, Position position, Time timestamp,  Set<Image> sImages);
    Photogrammetrie getPhotogrammetrie(String sURI);
    Set<Photogrammetrie> listPhotogrammetries();
    boolean deletePhotogrammetrie(Photogrammetrie pObject);

    // general
    Set<StolperwegeElement> findUsages(String sID);
    Set<DiscourseReferent> listStolpersteine();
    Set<DiscourseReferent> listStolpersteine(Position p);
    Set<DiscourseReferent> listStolpersteine(Position p, float fRadius);
    Set<DiscourseReferent> listStolpersteine(GeoPoint gp, GeoPoint gp2);
    Set<DiscourseReferent> listStolpersteine(GeoPoint geoPoint, double distance);

    AnnotationBase getElement(String sURI);


    ToolChain getToolChain(String sURI);
    ToolChain createToolChain(String sName, String sDescription, String sLanguage, String sTools);
    Set<ToolChain> listToolChains();
    ToolChain findToolChain(String sValue);
    void deleteToolChain(ToolChain pChain);

    StolperwegeCamera getStolperwegeCamera(String sURI);
    StolperwegeCamera createStolperwegeCamera(String sName, String sDescription);
    Set<StolperwegeCamera> listStolperwegeCameras();
    StolperwegeCamera findStolperwegeCamera(String sValue);
    void deleteStolperwegeCamera(StolperwegeCamera pCamera);

    StolperwegeSet getStolperwegeSet(String sURI);
    StolperwegeSet createStolperwegeSet(String sName, String sDescription);
    Set<StolperwegeSet> listStolperwegeSets();
    StolperwegeSet findStolperwegeSet(String sValue);
    void deleteStolperwegeSet(StolperwegeSet pSet);

    Visualization getVisualization(String sURI);
    Visualization createVisualization(String sName, String sDescription, Set<String> sSet);
    Set<Visualization> listVisualizations();
    Visualization findVisualizations(String sValue);
    void deleteVisualization(Visualization pObject);

    Relation getRelation(String sUri);
    Relation createRelation(RelationType type, StolperwegeElement start, StolperwegeElement end);
    Set<Relation> listRelations();
    Relation findRelation(RelationType type, StolperwegeElement start, StolperwegeElement end);
    void deleteRelation(Relation pObject);

    RelationType getRelationType(String sUri);
    RelationType createRelationType(String range, String name);
    Set<RelationType> listRelationTypes();
    RelationType findRelationType(String range, String name);
    void deleteRelationType(RelationType pObject);

    Like getLike(String sUri);
    Like createLike(StolperwegeUser pUser, DiscourseReferent pReferent, boolean bValue);
    Set<Like> listLikes();
    Set<Like> listLikes(StolperwegeUser pUser);
    void deleteLike(Like pLike);

    Comment getComment(String sUri);
    Comment createComment(StolperwegeUser pUser, DiscourseReferent pReferent, String sValue, String sDescription);
    Set<Comment> listComments();
    Set<Comment> listComments(StolperwegeUser pUser);
    Set<Comment> listComments(DiscourseReferent pReferent);
    void deleteComment(Comment pValue);

    Quiz getQuiz(String sURI);
    Quiz createQuiz(String sValue, String sDescription, Set<Text> pAnswers);
    Set<Quiz> listQuizes();
    Set<Quiz> listQuizes(StolperwegeUser pUser);
    void deleteQuiz(Quiz pQuiz);

    Exploration getExploration(String sURI);
    Exploration createExploration(String sValue, String sDescription, Set<DiscourseReferent> pElements);
    Set<Exploration> listExploration();
    void deleteExploration(Exploration pElement);

    TimeLayer createTimeLayer(String sValue);
    TimeLayer getTimeLayer(String sURI);
    Set<TimeLayer> listTimeLayers();
    void deleteTimeLayer(TimeLayer pElement);

    Journey createJourney(String sValue);
    Journey getJourney(String sURI);
    Set<Journey> listJourneys();
    void deleteJourney(Journey pElement);

}
