

/* First created by JCasGen Tue Jul 09 12:14:17 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Jul 09 12:14:26 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/Event.xml
 * @generated */
public class Predicate extends StolperwegeElement {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Predicate.class);
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
  protected Predicate() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Predicate(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Predicate(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Predicate(JCas jcas, int begin, int end) {
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
  //* Feature: name

  /** getter for name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (Predicate_Type.featOkTst && ((Predicate_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Predicate_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (Predicate_Type.featOkTst && ((Predicate_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    jcasType.ll_cas.ll_setStringValue(addr, ((Predicate_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: mendatoryRole

  /** getter for mendatoryRole - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getMendatoryRole() {
    if (Predicate_Type.featOkTst && ((Predicate_Type)jcasType).casFeat_mendatoryRole == null)
      jcasType.jcas.throwFeatMissing("mendatoryRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_mendatoryRole)));}
    
  /** setter for mendatoryRole - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMendatoryRole(FSArray v) {
    if (Predicate_Type.featOkTst && ((Predicate_Type)jcasType).casFeat_mendatoryRole == null)
      jcasType.jcas.throwFeatMissing("mendatoryRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    jcasType.ll_cas.ll_setRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_mendatoryRole, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for mendatoryRole - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public ArgumentRole getMendatoryRole(int i) {
    if (Predicate_Type.featOkTst && ((Predicate_Type)jcasType).casFeat_mendatoryRole == null)
      jcasType.jcas.throwFeatMissing("mendatoryRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_mendatoryRole), i);
    return (ArgumentRole)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_mendatoryRole), i)));}

  /** indexed setter for mendatoryRole - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMendatoryRole(int i, ArgumentRole v) { 
    if (Predicate_Type.featOkTst && ((Predicate_Type)jcasType).casFeat_mendatoryRole == null)
      jcasType.jcas.throwFeatMissing("mendatoryRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_mendatoryRole), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_mendatoryRole), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: optionalRole

  /** getter for optionalRole - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getOptionalRole() {
    if (Predicate_Type.featOkTst && ((Predicate_Type)jcasType).casFeat_optionalRole == null)
      jcasType.jcas.throwFeatMissing("optionalRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_optionalRole)));}
    
  /** setter for optionalRole - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOptionalRole(FSArray v) {
    if (Predicate_Type.featOkTst && ((Predicate_Type)jcasType).casFeat_optionalRole == null)
      jcasType.jcas.throwFeatMissing("optionalRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    jcasType.ll_cas.ll_setRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_optionalRole, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for optionalRole - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public ArgumentRole getOptionalRole(int i) {
    if (Predicate_Type.featOkTst && ((Predicate_Type)jcasType).casFeat_optionalRole == null)
      jcasType.jcas.throwFeatMissing("optionalRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_optionalRole), i);
    return (ArgumentRole)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_optionalRole), i)));}

  /** indexed setter for optionalRole - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setOptionalRole(int i, ArgumentRole v) { 
    if (Predicate_Type.featOkTst && ((Predicate_Type)jcasType).casFeat_optionalRole == null)
      jcasType.jcas.throwFeatMissing("optionalRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_optionalRole), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Predicate_Type)jcasType).casFeatCode_optionalRole), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    