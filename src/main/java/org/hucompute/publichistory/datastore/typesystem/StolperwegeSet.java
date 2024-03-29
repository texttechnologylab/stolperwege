

/* First created by JCasGen Tue Jan 25 16:36:10 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Jan 25 16:36:10 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/StolperwegeSet.xml
 * @generated */
public class StolperwegeSet extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(StolperwegeSet.class);
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
  protected StolperwegeSet() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public StolperwegeSet(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public StolperwegeSet(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public StolperwegeSet(JCas jcas, int begin, int end) {
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
  //* Feature: contains

  /** getter for contains - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getContains() {
    if (StolperwegeSet_Type.featOkTst && ((StolperwegeSet_Type)jcasType).casFeat_contains == null)
      jcasType.jcas.throwFeatMissing("contains", "org.hucompute.publichistory.datastore.typesystem.StolperwegeSet");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((StolperwegeSet_Type)jcasType).casFeatCode_contains)));}
    
  /** setter for contains - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContains(FSArray v) {
    if (StolperwegeSet_Type.featOkTst && ((StolperwegeSet_Type)jcasType).casFeat_contains == null)
      jcasType.jcas.throwFeatMissing("contains", "org.hucompute.publichistory.datastore.typesystem.StolperwegeSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((StolperwegeSet_Type)jcasType).casFeatCode_contains, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for contains - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public StolperwegeElement getContains(int i) {
    if (StolperwegeSet_Type.featOkTst && ((StolperwegeSet_Type)jcasType).casFeat_contains == null)
      jcasType.jcas.throwFeatMissing("contains", "org.hucompute.publichistory.datastore.typesystem.StolperwegeSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((StolperwegeSet_Type)jcasType).casFeatCode_contains), i);
    return (StolperwegeElement)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((StolperwegeSet_Type)jcasType).casFeatCode_contains), i)));}

  /** indexed setter for contains - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setContains(int i, StolperwegeElement v) { 
    if (StolperwegeSet_Type.featOkTst && ((StolperwegeSet_Type)jcasType).casFeat_contains == null)
      jcasType.jcas.throwFeatMissing("contains", "org.hucompute.publichistory.datastore.typesystem.StolperwegeSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((StolperwegeSet_Type)jcasType).casFeatCode_contains), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((StolperwegeSet_Type)jcasType).casFeatCode_contains), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    