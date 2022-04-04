package org.hucompute.publichistory;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by abrami on 26.02.16.
 */
public class STConst {

    /*
    *   Webservices and Commands
    */

    //public static final String OWLNOTATOR = "http://localhost:8080/owlnotator/"; //the url of the Annotation-Service (OWLnotator)
    public static final String APPURI = "http://app.stolperwege.hucompute.org"; //the url of the Annotation-Service

    public static final String OWLNOTATOR = "http://db.stolperwege.hucompute.org/"; //the url of the Annotation-Service (OWLnotator)
    public static final String CMD_CREATEANNOTATION = OWLNOTATOR+"createAnnotation/"; //the Command for Creating Annotation
    public static final String CMD_SPARQL = OWLNOTATOR+"sparql"; //the Command for Creating Annotation
    public static final String CMD_GETANNOTATIONS = OWLNOTATOR+"getannotations"; //the Command for Creating Annotation
    public static final String CMD_FIELDSFORANNOTATION = OWLNOTATOR+"getFieldsForAnnotation/"; //the Command for Creating Annotation
    public static final String CMD_PROPERTIES = OWLNOTATOR+"listOntologiesProperties/"; //the Command for Creating Annotation
    public static final String CMD_SETANNOTATION = OWLNOTATOR+"setannotation/"; //the Command for Creating Annotation
    public static final String CMD_REMOVEANNOTATION = OWLNOTATOR+"removeAnnotation/"; //the Command for removing an Annotation
    public static final String CMD_LISTCLASSES = OWLNOTATOR+"listClasses/"; //the Command for list Classes
    public static final String CMD_LISTONTOLOGIES = OWLNOTATOR+"listOntologies/"; //the Command for list Classes
    public static final String CMD_LISTOBJECTS = OWLNOTATOR+"listObjects/"; //the Command for list Objects
    public static final String CMD_GRAPH = OWLNOTATOR+"graph"; //the Command for list Objects

    public static final String AUTHORITY = "https://authority.hucompute.org/"; //the uri of the Authority-Service

    public static final String CMD_LOGIN = AUTHORITY+"login"; //the Command for Login
    public static final String CMD_CHECK_LOGIN = AUTHORITY+"checklogin"; //the Command for Login
    public static final String CMD_PERMISSION = AUTHORITY+"accesspermission"; //the Command for Login


    public static final String RESOURCES = "https://resources.hucompute.org/"; //the uri of the resources-Service
    public static final String STOLPERWEGE_REPOSITORY = "https://resources.hucompute.org/repository/306"; //the uri of the resources-Repository

    public static final String CMD_ADDPICTURE= "https://resources.hucompute.org/upload";
    public static final String CMD_GETMBTILES= "https://resources.hucompute.org/mbtiles";
    public static final String CMD_GETMBTILE= "https://resources.hucompute.org/mbtile";
    public static final String CMD_GETUNITY3D= "https://resources.hucompute.org/unity3d";
    public static final String CMD_GETFILE= "https://resources.hucompute.org/file";
    public static final String CMD_DOWNLOAD= "https://resources.hucompute.org/download";



    public static final String AREA_PERSONS = OWLNOTATOR+"area/bio"; //the uri of the Authority-Service
    public static final String AREA_USER = OWLNOTATOR+"area/user"; //the uri of the Authority-Service
    public static final String AREA_EVENTS = OWLNOTATOR+"area/event"; //the uri of the Authority-Service
    public static final String AREA_PLACES = OWLNOTATOR+"area/geo"; //the uri of the Authority-Service
    public static final String AREA_STEINE = OWLNOTATOR+"area/stolpersteine"; //the uri of the Authority-Service
    public static final String AREA_BIOGRAPHY = OWLNOTATOR+"area/biography"; //the uri of the Authority-Service
    public static final String AREA_ONTOLOGY= OWLNOTATOR+"area/ontology"; //the uri of Ontology-Area

    /*
    *   == Consts ==
    */
    public static String SESSION;
    public static final int PORT = 8990;

    public static final String DUMMYURI="http://dummy";

    public static final String username = "stolperwege";
    public static final String password = "a699199498abed476543511aa749a9d9";

    public enum TYPE {STOLPERWEGE, USER, CHAT, MESSAGE, PERSON, EVENT, PLACE, ARGUMENT,ARGUMENTASSIGNMENT,ARGUMENTROLE,PREDICATE,PROPOSITION, STOLPERSTEIN, DISCOURSEREFERENT, TIME}



    /*
    *   Ontologies
    */
    public static final String FOAF = "http://xmlns.com/foaf/0.1/";
    public static final String Geo = "http://www.w3.org/2003/01/geo/wgs84_pos#";
    public static final String GeoNames = "http://www.geonames.org/ontology#";
    public static final String User = "http://ontologies.hucompute.org/StolperwegeUser#";
    public static final String Stolperwege = "http://ontologies.hucompute.org/Stolperwege#";
    public static final String Time = "http://www.w3.org/2006/time#";
    public static final String Bio = "http://vocab.org/bio/";
    public static final String dcterms = "http://purl.org/dc/terms/";
    public static final String cc = "http://creativecommons.org/ns#";
    public static final String DFKIBIO = "http://www.dfki.de/lt/onto/biography.owl#";
    public static final String DiscourseSituations = "http://ontologies.hucompute.org/DiscourseSituations#";
    public static final String DiscourseSituationsHasHappening = DiscourseSituations+"hasHappening";
    public static final String DiscourseSituationsArgumentRole = DiscourseSituations+"ArgumentRole";
    public static final String DiscourseSituationsProposition = DiscourseSituations+"Proposition";
    public static final String DiscourseSituationsHasArgumentAssignment = DiscourseSituations+"hasArgumentAssignment";
    public static final String DiscourseSituationshasEvent = DiscourseSituations+"hasEvent";
    public static final String DiscourseSituationshasPredicate = DiscourseSituations+"hasPredicate";
    public static final String DiscourseSituationsArgumentAssignment = DiscourseSituations+"ArgumentAssignment";
    public static final String DiscourseSituationsHasArgument = DiscourseSituations+"hasArgument";
    public static final String DiscourseSituationsHasRole = DiscourseSituations+"hasRole";
    public static final String DiscourseSituationsPredicate = DiscourseSituations+"Predicate";
    public static final String DiscourseSituationsMendatoryRole = DiscourseSituations+"mendatoryRole";
    public static final String DiscourseSituationsOptionalRole = DiscourseSituations+"optionalRole";



    /*
    *   Classes
    *
    */
    public static final String FOAF_Person = FOAF+"person";
    public static final String Geo_Place = Geo+"place";
    public static final String GeoName_Feature = Geo+"Feature";
    public static final String User_Account = User+"Account";

    public static final String Time_TemporalEntity = Time+"TemporalEntity";
    public static final String Time_Instant = Time+"Instant";
    public static final String Time_Interval = Time+"Interval";
    public static final String Time_ProperInterval = Time+"ProperInterval";
    public static final String Time_day_of_week = Time+"dayOfWeek";


    public static final String Stolperstein = Stolperwege+"Stolperstein";
    public static final String BIO_hasMember = DFKIBIO+"hasMember";
    public static final String GEO_location = Geo+"location";

    public static final String Event_Event = DFKIBIO+"Event";


    // Event Properties

    public static final String Event_startDate = DFKIBIO+"startDate";
    public static final String Event_endDate = DFKIBIO+"endDate";
    public static final String Event_startsWith = DFKIBIO+"startsWith";
    public static final String Event_endsWith = DFKIBIO+"endsWith";
    public static final String Event_continuesWith = DFKIBIO+"continuesWith";
    public static final String Event_leadsTo = DFKIBIO+"leadsTo";
    public static final String Event_happensAt = DFKIBIO+"happensAt";
    public static final String Event_involves = DFKIBIO+"involves";
    public static final String Event_basedOn = DFKIBIO+"basedOn";

    /*
    *   Geo Properties
    *
    * */
    public static final String Geo_altitute = Geo+"altitude";
    public static final String Geo_latitude= Geo+"latitude";
    public static final String Geo_longitude= Geo+"longitude";

    /*
    *   Stolperstein Properties
    * */
    public static final String Stolperstein_description= Stolperwege+"description";
    public static final String Stolperstein_hasMember= Stolperwege+"hasMember";
    public static final String Stolperstein_hatPraefix= Stolperwege+"hatPraefix";
    public static final String Stolperstein_location= GEO_location;
    public static final String Stolperstein_birthname= Stolperwege+"hasBirthname";
    public static final String Stolperstein_jahrgang= Stolperwege+"hasJahrgang";
    public static final String Stolperstein_firstname= Stolperwege+"hasFirstname";
    public static final String Stolperstein_surname= Stolperwege+"hasSurname";
    public static final String Stolperstein_name= Stolperwege+"hasName";
    public static final String Stolperstein_hasGebDatum = Stolperwege+"hasGebDatum";
    public static final String Stolperstein_hasSterbeDatum = Stolperwege+"hasSterbeDatum";
    public static final String Stolperwege_hasImage= Stolperwege+"hasImage";
    public static final String DiscourseSituations_hasHappening = DiscourseSituations+"hasHappening";

    /*
    *   Properties
    *
    * */

    public static final String User_password = User+"password";
    public static final String User_username = User+"username";
    public static final String User_status = User+"status";
    public static final String User_realName = User+"realName";
    public static final String User_longitude = User+"longitude";
    public static final String User_latitude = User+"latitude";
    public static final String User_position = User+"position";
    public static final String User_mailbox = FOAF+"mbox";
    public static final String User_topic = FOAF+"topic_interest";

    public static final String User_picture = FOAF+"depiction";

    /*
    *Person Properties
     */
    public static final String Person_lastname = FOAF+"lastName";
    public static final String Person_title = FOAF+"title";
    public static final String Person_name = FOAF+"name";
    public static final String Person_firstname= FOAF+"firstName";
    public static final String Person_gender= FOAF+"gender";
    public static final String Person_birth = Bio+"brith";
    public static final String Person_death = Bio+"death";
    public static final String Person_father= Bio+"father";
    public static final String Person_mother = Bio+"mother";
    public static final String Person_child = Bio+"child";
    public static final String Person_surname = FOAF+"surname";
    public static final String Person_familyname = FOAF+"family_name";

    public static final String Person_picture = FOAF+"img"; //alternatively there is depiction and image

    /*
    *GeoNames Properties
     */
    public static final String Place_latitude = Geo+"lat";
    public static final String Place_longitude = Geo+"lon";
    public static final String Place_location = Geo+"location";
    public static final String Place_altitude = Geo+"altitude";
    public static final String Place_point = Geo + "point";

    public static final String Geo_name = GeoNames+"name";
    public static final String Geo_CountryCode = GeoNames+"countryCode";
    public static final String Geo_alternateName = GeoNames+"alternateName";
    public static final String Geo_nearbyFeatures = GeoNames+"nearbyFeatures";
    public static final String Geo_nearby = GeoNames+"nearby";
    public static final String Geo_parentADM1 = GeoNames+"parentADM1";
    public static final String Geo_parentADM2 = GeoNames+"parentADM2";
    public static final String Geo_parentADM3 = GeoNames+"parentADM3";
    public static final String Geo_parentADM4 = GeoNames+"parentADM4";
    public static final String Geo_parentCountry = GeoNames+"parentCountry";
    public static final String Geo_parentFeature = GeoNames+"parentFeature";
    public static final String DCTERMS_created = dcterms+"created";
    public static final String DCTERMS_modified = dcterms+"modified";
    public static final String CC_license = cc+"license";

    /*
    *Time properties
     */

    public static final String Time_before = Time+"before";
    public static final String Time_after = Time+"after";
    public static final String Time_hasBeginning = Time+"hasBeginning";
    public static final String Time_hasEnd = Time+"hasEnds";
    public static final String Time_inside = Time+"inside";

    public static final String Time_year = Time+"year";
    public static final String Time_month = Time+"month";
    public static final String Time_week = Time+"week";
    public static final String Time_day = Time+"day";
    public static final String Time_hour = Time+"hour";
    public static final String Time_minute = Time+"minute";
    public static final String Time_second = Time+"second";


    public static final String Time_years = Time+"years";
    public static final String Time_months = Time+"months";
    public static final String Time_weeks = Time+"weeks";
    public static final String Time_days = Time+"days";
    public static final String Time_hours = Time+"hours";
    public static final String Time_minutes = Time+"minutes";
    public static final String Time_seconds = Time+"seconds";

    public static final String Time_intervalBefore = Time+"intervalBefore";
    public static final String Time_intervalEquals = Time+"intervalEquals";
    public static final String Time_intervalMeets = Time+"intervalMeets";
    public static final String Time_intervalOverlaps = Time+"intervalOverlaps";
    public static final String Time_intervalStarts = Time+"intervalStarts";
    public static final String Time_intervalDuring = Time+"intervalDuring";
    public static final String Time_intervalFinishes = Time+"intervalFinishes";
    public static final String Time_intervalAfter = Time+"intervalAfter";
    public static final String Time_intervalMetBy = Time+"intervalMetBy";
    public static final String Time_intervalOverlapped = Time+"intervalOverlapped";
    public static final String Time_intervalStartedBy = Time+"intervalStartedBy";
    public static final String Time_intervalContains = Time+"intervalContains";
    public static final String Time_intervalFinishedBy= Time+"intervalFinishedBy";

    public static final String Time_monday = Time+"Monday";
    public static final String Time_tuesday = Time+"Tuesday";
    public static final String Time_wednesday = Time+"Wednesday";
    public static final String Time_thursday = Time+"Thursday";
    public static final String Time_friday = Time+"Friday";
    public static final String Time_saturday = Time+"Saturday";
    public static final String Time_sunday = Time+"Sunday";

    public static final String Time_unitSecond = Time+"unitSecond";
    public static final String Time_unitMinute = Time+"unitMinute";
    public static final String Time_unitHour = Time+"unitHour";
    public static final String Time_unitDay = Time+"unitDay";
    public static final String Time_unitMonth = Time+"unitMonth";
    public static final String Time_unitYear = Time+"unitYear";


    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.GERMAN);
}
