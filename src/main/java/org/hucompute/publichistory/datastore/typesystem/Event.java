

/* First created by JCasGen Tue Jul 09 12:14:17 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Jul 09 12:14:26 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/Event.xml
 * @generated */
public class Event extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Event.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Event() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Event(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Event(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Event(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: startsWith

  /** getter for startsWith - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getStartsWith() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_startsWith == null)
      jcasType.jcas.throwFeatMissing("startsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_startsWith)));}
    
  /** setter for startsWith - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartsWith(FSArray v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_startsWith == null)
      jcasType.jcas.throwFeatMissing("startsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    jcasType.ll_cas.ll_setRefValue(addr, ((Event_Type)jcasType).casFeatCode_startsWith, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for startsWith - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Event getStartsWith(int i) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_startsWith == null)
      jcasType.jcas.throwFeatMissing("startsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_startsWith), i);
    return (Event)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_startsWith), i)));}

  /** indexed setter for startsWith - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setStartsWith(int i, Event v) { 
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_startsWith == null)
      jcasType.jcas.throwFeatMissing("startsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_startsWith), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_startsWith), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: endsWith

  /** getter for endsWith - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getEndsWith() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_endsWith == null)
      jcasType.jcas.throwFeatMissing("endsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_endsWith)));}
    
  /** setter for endsWith - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndsWith(FSArray v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_endsWith == null)
      jcasType.jcas.throwFeatMissing("endsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    jcasType.ll_cas.ll_setRefValue(addr, ((Event_Type)jcasType).casFeatCode_endsWith, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for endsWith - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Event getEndsWith(int i) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_endsWith == null)
      jcasType.jcas.throwFeatMissing("endsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_endsWith), i);
    return (Event)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_endsWith), i)));}

  /** indexed setter for endsWith - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEndsWith(int i, Event v) { 
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_endsWith == null)
      jcasType.jcas.throwFeatMissing("endsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_endsWith), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_endsWith), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: startTime

  /** getter for startTime - gets 
   * @generated
   * @return value of the feature 
   */
  public Time getStartTime() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "org.hucompute.publichistory.datastore.typesystem.Event");
    return (Time)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_startTime)));}
    
  /** setter for startTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartTime(Time v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "org.hucompute.publichistory.datastore.typesystem.Event");
    jcasType.ll_cas.ll_setRefValue(addr, ((Event_Type)jcasType).casFeatCode_startTime, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endTime

  /** getter for endTime - gets 
   * @generated
   * @return value of the feature 
   */
  public Time getEndTime() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "org.hucompute.publichistory.datastore.typesystem.Event");
    return (Time)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_endTime)));}
    
  /** setter for endTime - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndTime(Time v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "org.hucompute.publichistory.datastore.typesystem.Event");
    jcasType.ll_cas.ll_setRefValue(addr, ((Event_Type)jcasType).casFeatCode_endTime, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: propositions

  /** getter for propositions - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getPropositions() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_propositions == null)
      jcasType.jcas.throwFeatMissing("propositions", "org.hucompute.publichistory.datastore.typesystem.Event");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_propositions)));}
    
  /** setter for propositions - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPropositions(FSArray v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_propositions == null)
      jcasType.jcas.throwFeatMissing("propositions", "org.hucompute.publichistory.datastore.typesystem.Event");
    jcasType.ll_cas.ll_setRefValue(addr, ((Event_Type)jcasType).casFeatCode_propositions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for propositions - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Proposition getPropositions(int i) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_propositions == null)
      jcasType.jcas.throwFeatMissing("propositions", "org.hucompute.publichistory.datastore.typesystem.Event");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_propositions), i);
    return (Proposition)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_propositions), i)));}

  /** indexed setter for propositions - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setPropositions(int i, Proposition v) { 
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_propositions == null)
      jcasType.jcas.throwFeatMissing("propositions", "org.hucompute.publichistory.datastore.typesystem.Event");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_propositions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_propositions), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    