

/* First created by JCasGen Tue Jan 25 16:26:01 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Jan 25 16:35:49 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Quiz.xml
 * @generated */
public class Quiz extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Quiz.class);
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
  protected Quiz() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Quiz(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Quiz(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Quiz(JCas jcas, int begin, int end) {
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
  //* Feature: participants

  /** getter for participants - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getParticipants() {
    if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_participants == null)
      jcasType.jcas.throwFeatMissing("participants", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_participants)));}
    
  /** setter for participants - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParticipants(FSArray v) {
    if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_participants == null)
      jcasType.jcas.throwFeatMissing("participants", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    jcasType.ll_cas.ll_setRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_participants, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for participants - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public StolperwegeUser getParticipants(int i) {
    if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_participants == null)
      jcasType.jcas.throwFeatMissing("participants", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_participants), i);
    return (StolperwegeUser)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_participants), i)));}

  /** indexed setter for participants - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setParticipants(int i, StolperwegeUser v) { 
    if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_participants == null)
      jcasType.jcas.throwFeatMissing("participants", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_participants), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_participants), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getAnswers() {
    if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswers(FSArray v) {
    if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    jcasType.ll_cas.ll_setRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answers - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Text getAnswers(int i) {
    if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_answers), i);
    return (Text)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_answers), i)));}

  /** indexed setter for answers - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAnswers(int i, Text v) { 
    if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_answers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_answers), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    