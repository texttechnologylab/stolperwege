

/* First created by JCasGen Tue Jul 09 12:13:32 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Wed Jul 10 14:31:07 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/Relation.xml
 * @generated */
public class RelationType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RelationType.class);
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
  protected RelationType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RelationType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RelationType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public RelationType(JCas jcas, int begin, int end) {
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
  //* Feature: RangeFrom

  /** getter for RangeFrom - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRangeFrom() {
    if (RelationType_Type.featOkTst && ((RelationType_Type)jcasType).casFeat_RangeFrom == null)
      jcasType.jcas.throwFeatMissing("RangeFrom", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationType_Type)jcasType).casFeatCode_RangeFrom);}
    
  /** setter for RangeFrom - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRangeFrom(String v) {
    if (RelationType_Type.featOkTst && ((RelationType_Type)jcasType).casFeat_RangeFrom == null)
      jcasType.jcas.throwFeatMissing("RangeFrom", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationType_Type)jcasType).casFeatCode_RangeFrom, v);}    
   
    
  //*--------------*
  //* Feature: Name

  /** getter for Name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (RelationType_Type.featOkTst && ((RelationType_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationType_Type)jcasType).casFeatCode_Name);}
    
  /** setter for Name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (RelationType_Type.featOkTst && ((RelationType_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationType_Type)jcasType).casFeatCode_Name, v);}    
   
    
  //*--------------*
  //* Feature: RangeTo

  /** getter for RangeTo - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRangeTo() {
    if (RelationType_Type.featOkTst && ((RelationType_Type)jcasType).casFeat_RangeTo == null)
      jcasType.jcas.throwFeatMissing("RangeTo", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationType_Type)jcasType).casFeatCode_RangeTo);}
    
  /** setter for RangeTo - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRangeTo(String v) {
    if (RelationType_Type.featOkTst && ((RelationType_Type)jcasType).casFeat_RangeTo == null)
      jcasType.jcas.throwFeatMissing("RangeTo", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationType_Type)jcasType).casFeatCode_RangeTo, v);}    
  }

    