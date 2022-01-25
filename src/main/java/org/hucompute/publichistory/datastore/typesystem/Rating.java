

/* First created by JCasGen Tue Jan 25 16:35:52 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Jan 25 16:35:52 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Rating.xml
 * @generated */
public class Rating extends UnityPosition {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Rating.class);
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
  protected Rating() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Rating(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Rating(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Rating(JCas jcas, int begin, int end) {
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
  //* Feature: scale

  /** getter for scale - gets 
   * @generated
   * @return value of the feature 
   */
  public String getScale() {
    if (Rating_Type.featOkTst && ((Rating_Type)jcasType).casFeat_scale == null)
      jcasType.jcas.throwFeatMissing("scale", "org.hucompute.publichistory.datastore.typesystem.Rating");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Rating_Type)jcasType).casFeatCode_scale);}
    
  /** setter for scale - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScale(String v) {
    if (Rating_Type.featOkTst && ((Rating_Type)jcasType).casFeat_scale == null)
      jcasType.jcas.throwFeatMissing("scale", "org.hucompute.publichistory.datastore.typesystem.Rating");
    jcasType.ll_cas.ll_setStringValue(addr, ((Rating_Type)jcasType).casFeatCode_scale, v);}    
   
    
  //*--------------*
  //* Feature: ratingType

  /** getter for ratingType - gets 
   * @generated
   * @return value of the feature 
   */
  public RatingType getRatingType() {
    if (Rating_Type.featOkTst && ((Rating_Type)jcasType).casFeat_ratingType == null)
      jcasType.jcas.throwFeatMissing("ratingType", "org.hucompute.publichistory.datastore.typesystem.Rating");
    return (RatingType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Rating_Type)jcasType).casFeatCode_ratingType)));}
    
  /** setter for ratingType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRatingType(RatingType v) {
    if (Rating_Type.featOkTst && ((Rating_Type)jcasType).casFeat_ratingType == null)
      jcasType.jcas.throwFeatMissing("ratingType", "org.hucompute.publichistory.datastore.typesystem.Rating");
    jcasType.ll_cas.ll_setRefValue(addr, ((Rating_Type)jcasType).casFeatCode_ratingType, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ratingValue

  /** getter for ratingValue - gets 
   * @generated
   * @return value of the feature 
   */
  public int getRatingValue() {
    if (Rating_Type.featOkTst && ((Rating_Type)jcasType).casFeat_ratingValue == null)
      jcasType.jcas.throwFeatMissing("ratingValue", "org.hucompute.publichistory.datastore.typesystem.Rating");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Rating_Type)jcasType).casFeatCode_ratingValue);}
    
  /** setter for ratingValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRatingValue(int v) {
    if (Rating_Type.featOkTst && ((Rating_Type)jcasType).casFeat_ratingValue == null)
      jcasType.jcas.throwFeatMissing("ratingValue", "org.hucompute.publichistory.datastore.typesystem.Rating");
    jcasType.ll_cas.ll_setIntValue(addr, ((Rating_Type)jcasType).casFeatCode_ratingValue, v);}    
  }

    