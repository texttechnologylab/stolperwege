

/* First created by JCasGen Tue Jan 25 16:36:48 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Jan 25 16:36:48 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/VirtualRoom.xml
 * @generated */
public class VirtualRoom extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(VirtualRoom.class);
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
  protected VirtualRoom() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public VirtualRoom(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public VirtualRoom(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public VirtualRoom(JCas jcas, int begin, int end) {
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
  //* Feature: public

  /** getter for public - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getPublic() {
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_public == null)
      jcasType.jcas.throwFeatMissing("public", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_public);}
    
  /** setter for public - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPublic(boolean v) {
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_public == null)
      jcasType.jcas.throwFeatMissing("public", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_public, v);}    
   
    
  //*--------------*
  //* Feature: visible

  /** getter for visible - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getVisible() {
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_visible == null)
      jcasType.jcas.throwFeatMissing("visible", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_visible);}
    
  /** setter for visible - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVisible(boolean v) {
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_visible == null)
      jcasType.jcas.throwFeatMissing("visible", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_visible, v);}    
   
    
  //*--------------*
  //* Feature: host

  /** getter for host - gets 
   * @generated
   * @return value of the feature 
   */
  public StolperwegeUser getHost() {
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_host == null)
      jcasType.jcas.throwFeatMissing("host", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    return (StolperwegeUser)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_host)));}
    
  /** setter for host - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHost(StolperwegeUser v) {
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_host == null)
      jcasType.jcas.throwFeatMissing("host", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    jcasType.ll_cas.ll_setRefValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_host, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: port

  /** getter for port - gets 
   * @generated
   * @return value of the feature 
   */
  public int getPort() {
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_port == null)
      jcasType.jcas.throwFeatMissing("port", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    return jcasType.ll_cas.ll_getIntValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_port);}
    
  /** setter for port - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPort(int v) {
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_port == null)
      jcasType.jcas.throwFeatMissing("port", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    jcasType.ll_cas.ll_setIntValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_port, v);}    
   
    
  //*--------------*
  //* Feature: clients

  /** getter for clients - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getClients() {
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_clients == null)
      jcasType.jcas.throwFeatMissing("clients", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_clients)));}
    
  /** setter for clients - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setClients(FSArray v) {
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_clients == null)
      jcasType.jcas.throwFeatMissing("clients", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    jcasType.ll_cas.ll_setRefValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_clients, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for clients - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public StolperwegeUser getClients(int i) {
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_clients == null)
      jcasType.jcas.throwFeatMissing("clients", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_clients), i);
    return (StolperwegeUser)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_clients), i)));}

  /** indexed setter for clients - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setClients(int i, StolperwegeUser v) { 
    if (VirtualRoom_Type.featOkTst && ((VirtualRoom_Type)jcasType).casFeat_clients == null)
      jcasType.jcas.throwFeatMissing("clients", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_clients), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((VirtualRoom_Type)jcasType).casFeatCode_clients), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    