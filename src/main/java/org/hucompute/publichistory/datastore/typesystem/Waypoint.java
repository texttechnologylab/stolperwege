

/* First created by JCasGen Tue Jul 09 12:17:00 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Jul 09 12:17:00 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/Tour.xml
 * @generated */
public class Waypoint extends UnityPosition {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Waypoint.class);
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
  protected Waypoint() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Waypoint(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Waypoint(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Waypoint(JCas jcas, int begin, int end) {
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
  //* Feature: area

  /** getter for area - gets 
   * @generated
   * @return value of the feature 
   */
  public String getArea() {
    if (Waypoint_Type.featOkTst && ((Waypoint_Type)jcasType).casFeat_area == null)
      jcasType.jcas.throwFeatMissing("area", "org.hucompute.publichistory.datastore.typesystem.Waypoint");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Waypoint_Type)jcasType).casFeatCode_area);}
    
  /** setter for area - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setArea(String v) {
    if (Waypoint_Type.featOkTst && ((Waypoint_Type)jcasType).casFeat_area == null)
      jcasType.jcas.throwFeatMissing("area", "org.hucompute.publichistory.datastore.typesystem.Waypoint");
    jcasType.ll_cas.ll_setStringValue(addr, ((Waypoint_Type)jcasType).casFeatCode_area, v);}    
   
    
  //*--------------*
  //* Feature: visible

  /** getter for visible - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getVisible() {
    if (Waypoint_Type.featOkTst && ((Waypoint_Type)jcasType).casFeat_visible == null)
      jcasType.jcas.throwFeatMissing("visible", "org.hucompute.publichistory.datastore.typesystem.Waypoint");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Waypoint_Type)jcasType).casFeatCode_visible);}
    
  /** setter for visible - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVisible(boolean v) {
    if (Waypoint_Type.featOkTst && ((Waypoint_Type)jcasType).casFeat_visible == null)
      jcasType.jcas.throwFeatMissing("visible", "org.hucompute.publichistory.datastore.typesystem.Waypoint");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Waypoint_Type)jcasType).casFeatCode_visible, v);}    
  }

    