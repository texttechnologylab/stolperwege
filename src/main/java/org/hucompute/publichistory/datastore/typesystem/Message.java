

/* First created by JCasGen Tue Jul 09 12:15:56 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Jul 09 12:15:56 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/Message.xml
 * @generated */
public class Message extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Message.class);
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
  protected Message() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Message(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Message(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Message(JCas jcas, int begin, int end) {
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
  //* Feature: receiver

  /** getter for receiver - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getReceiver() {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_receiver == null)
      jcasType.jcas.throwFeatMissing("receiver", "org.hucompute.publichistory.datastore.typesystem.Message");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Message_Type)jcasType).casFeatCode_receiver)));}
    
  /** setter for receiver - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReceiver(FSArray v) {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_receiver == null)
      jcasType.jcas.throwFeatMissing("receiver", "org.hucompute.publichistory.datastore.typesystem.Message");
    jcasType.ll_cas.ll_setRefValue(addr, ((Message_Type)jcasType).casFeatCode_receiver, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for receiver - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public StolperwegeUser getReceiver(int i) {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_receiver == null)
      jcasType.jcas.throwFeatMissing("receiver", "org.hucompute.publichistory.datastore.typesystem.Message");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Message_Type)jcasType).casFeatCode_receiver), i);
    return (StolperwegeUser)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Message_Type)jcasType).casFeatCode_receiver), i)));}

  /** indexed setter for receiver - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setReceiver(int i, StolperwegeUser v) { 
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_receiver == null)
      jcasType.jcas.throwFeatMissing("receiver", "org.hucompute.publichistory.datastore.typesystem.Message");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Message_Type)jcasType).casFeatCode_receiver), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Message_Type)jcasType).casFeatCode_receiver), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: sender

  /** getter for sender - gets 
   * @generated
   * @return value of the feature 
   */
  public StolperwegeUser getSender() {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_sender == null)
      jcasType.jcas.throwFeatMissing("sender", "org.hucompute.publichistory.datastore.typesystem.Message");
    return (StolperwegeUser)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Message_Type)jcasType).casFeatCode_sender)));}
    
  /** setter for sender - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSender(StolperwegeUser v) {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_sender == null)
      jcasType.jcas.throwFeatMissing("sender", "org.hucompute.publichistory.datastore.typesystem.Message");
    jcasType.ll_cas.ll_setRefValue(addr, ((Message_Type)jcasType).casFeatCode_sender, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    