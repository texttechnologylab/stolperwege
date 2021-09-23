

/* First created by JCasGen Thu Sep 23 08:58:16 CEST 2021 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Thu Sep 23 08:58:16 CEST 2021
 * XML source: /home/staff_homes/abrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Rating.xml
 * @generated */
public class RatingType extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RatingType.class);
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
  protected RatingType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RatingType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RatingType(JCas jcas) {
    super(jcas);
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
  //* Feature: key

  /** getter for key - gets 
   * @generated
   * @return value of the feature 
   */
  public String getKey() {
    if (RatingType_Type.featOkTst && ((RatingType_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.hucompute.publichistory.datastore.typesystem.RatingType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RatingType_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    if (RatingType_Type.featOkTst && ((RatingType_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.hucompute.publichistory.datastore.typesystem.RatingType");
    jcasType.ll_cas.ll_setStringValue(addr, ((RatingType_Type)jcasType).casFeatCode_key, v);}    
   
    
  //*--------------*
  //* Feature: range

  /** getter for range - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRange() {
    if (RatingType_Type.featOkTst && ((RatingType_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "org.hucompute.publichistory.datastore.typesystem.RatingType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RatingType_Type)jcasType).casFeatCode_range);}
    
  /** setter for range - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRange(String v) {
    if (RatingType_Type.featOkTst && ((RatingType_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "org.hucompute.publichistory.datastore.typesystem.RatingType");
    jcasType.ll_cas.ll_setStringValue(addr, ((RatingType_Type)jcasType).casFeatCode_range, v);}    
  }

    