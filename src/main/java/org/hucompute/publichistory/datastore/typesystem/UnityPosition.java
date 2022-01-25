

/* First created by JCasGen Tue Jul 09 12:16:34 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Sep 23 09:36:56 CEST 2021
 * XML source: /home/staff_homes/abrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Rating.xml
 * @generated */
public class UnityPosition extends Position {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UnityPosition.class);
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
  protected UnityPosition() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public UnityPosition(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public UnityPosition(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public UnityPosition(JCas jcas, int begin, int end) {
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
  //* Feature: posvector3

  /** getter for posvector3 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPosvector3() {
    if (UnityPosition_Type.featOkTst && ((UnityPosition_Type)jcasType).casFeat_posvector3 == null)
      jcasType.jcas.throwFeatMissing("posvector3", "org.hucompute.publichistory.datastore.typesystem.UnityPosition");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UnityPosition_Type)jcasType).casFeatCode_posvector3);}
    
  /** setter for posvector3 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPosvector3(String v) {
    if (UnityPosition_Type.featOkTst && ((UnityPosition_Type)jcasType).casFeat_posvector3 == null)
      jcasType.jcas.throwFeatMissing("posvector3", "org.hucompute.publichistory.datastore.typesystem.UnityPosition");
    jcasType.ll_cas.ll_setStringValue(addr, ((UnityPosition_Type)jcasType).casFeatCode_posvector3, v);}    
   
    
  //*--------------*
  //* Feature: rotation

  /** getter for rotation - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRotation() {
    if (UnityPosition_Type.featOkTst && ((UnityPosition_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "org.hucompute.publichistory.datastore.typesystem.UnityPosition");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UnityPosition_Type)jcasType).casFeatCode_rotation);}
    
  /** setter for rotation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRotation(String v) {
    if (UnityPosition_Type.featOkTst && ((UnityPosition_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "org.hucompute.publichistory.datastore.typesystem.UnityPosition");
    jcasType.ll_cas.ll_setStringValue(addr, ((UnityPosition_Type)jcasType).casFeatCode_rotation, v);}    
  }

    