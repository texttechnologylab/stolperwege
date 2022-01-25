

/* First created by JCasGen Tue Jan 25 16:26:50 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Jan 25 16:35:46 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Proposition.xml
 * @generated */
public class Proposition extends StolperwegeElement {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Proposition.class);
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
  protected Proposition() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Proposition(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Proposition(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Proposition(JCas jcas, int begin, int end) {
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
  //* Feature: events

  /** getter for events - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getEvents() {
    if (Proposition_Type.featOkTst && ((Proposition_Type)jcasType).casFeat_events == null)
      jcasType.jcas.throwFeatMissing("events", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_events)));}
    
  /** setter for events - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEvents(FSArray v) {
    if (Proposition_Type.featOkTst && ((Proposition_Type)jcasType).casFeat_events == null)
      jcasType.jcas.throwFeatMissing("events", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    jcasType.ll_cas.ll_setRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_events, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for events - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Event getEvents(int i) {
    if (Proposition_Type.featOkTst && ((Proposition_Type)jcasType).casFeat_events == null)
      jcasType.jcas.throwFeatMissing("events", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_events), i);
    return (Event)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_events), i)));}

  /** indexed setter for events - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEvents(int i, Event v) { 
    if (Proposition_Type.featOkTst && ((Proposition_Type)jcasType).casFeat_events == null)
      jcasType.jcas.throwFeatMissing("events", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_events), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_events), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: termconnectors

  /** getter for termconnectors - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getTermconnectors() {
    if (Proposition_Type.featOkTst && ((Proposition_Type)jcasType).casFeat_termconnectors == null)
      jcasType.jcas.throwFeatMissing("termconnectors", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_termconnectors)));}
    
  /** setter for termconnectors - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTermconnectors(FSArray v) {
    if (Proposition_Type.featOkTst && ((Proposition_Type)jcasType).casFeat_termconnectors == null)
      jcasType.jcas.throwFeatMissing("termconnectors", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    jcasType.ll_cas.ll_setRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_termconnectors, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for termconnectors - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TermConnector getTermconnectors(int i) {
    if (Proposition_Type.featOkTst && ((Proposition_Type)jcasType).casFeat_termconnectors == null)
      jcasType.jcas.throwFeatMissing("termconnectors", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_termconnectors), i);
    return (TermConnector)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_termconnectors), i)));}

  /** indexed setter for termconnectors - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTermconnectors(int i, TermConnector v) { 
    if (Proposition_Type.featOkTst && ((Proposition_Type)jcasType).casFeat_termconnectors == null)
      jcasType.jcas.throwFeatMissing("termconnectors", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_termconnectors), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Proposition_Type)jcasType).casFeatCode_termconnectors), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    