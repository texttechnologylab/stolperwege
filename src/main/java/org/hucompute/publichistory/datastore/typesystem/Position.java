

/* First created by JCasGen Tue Jul 09 12:14:17 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Sep 23 09:36:56 CEST 2021
 * XML source: /home/staff_homes/abrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Rating.xml
 * @generated */
public class Position extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Position.class);
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
  protected Position() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Position(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Position(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Position(JCas jcas, int begin, int end) {
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
  //* Feature: latitude

  /** getter for latitude - gets 
   * @generated
   * @return value of the feature 
   */
  public double getLatitude() {
    if (Position_Type.featOkTst && ((Position_Type)jcasType).casFeat_latitude == null)
      jcasType.jcas.throwFeatMissing("latitude", "org.hucompute.publichistory.datastore.typesystem.Position");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Position_Type)jcasType).casFeatCode_latitude);}
    
  /** setter for latitude - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLatitude(double v) {
    if (Position_Type.featOkTst && ((Position_Type)jcasType).casFeat_latitude == null)
      jcasType.jcas.throwFeatMissing("latitude", "org.hucompute.publichistory.datastore.typesystem.Position");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Position_Type)jcasType).casFeatCode_latitude, v);}    
   
    
  //*--------------*
  //* Feature: longitude

  /** getter for longitude - gets 
   * @generated
   * @return value of the feature 
   */
  public double getLongitude() {
    if (Position_Type.featOkTst && ((Position_Type)jcasType).casFeat_longitude == null)
      jcasType.jcas.throwFeatMissing("longitude", "org.hucompute.publichistory.datastore.typesystem.Position");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Position_Type)jcasType).casFeatCode_longitude);}
    
  /** setter for longitude - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLongitude(double v) {
    if (Position_Type.featOkTst && ((Position_Type)jcasType).casFeat_longitude == null)
      jcasType.jcas.throwFeatMissing("longitude", "org.hucompute.publichistory.datastore.typesystem.Position");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Position_Type)jcasType).casFeatCode_longitude, v);}    
   
    
  //*--------------*
  //* Feature: orientation

  /** getter for orientation - gets 
   * @generated
   * @return value of the feature 
   */
  public int getOrientation() {
    if (Position_Type.featOkTst && ((Position_Type)jcasType).casFeat_orientation == null)
      jcasType.jcas.throwFeatMissing("orientation", "org.hucompute.publichistory.datastore.typesystem.Position");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Position_Type)jcasType).casFeatCode_orientation);}
    
  /** setter for orientation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrientation(int v) {
    if (Position_Type.featOkTst && ((Position_Type)jcasType).casFeat_orientation == null)
      jcasType.jcas.throwFeatMissing("orientation", "org.hucompute.publichistory.datastore.typesystem.Position");
    jcasType.ll_cas.ll_setIntValue(addr, ((Position_Type)jcasType).casFeatCode_orientation, v);}    
  }

    