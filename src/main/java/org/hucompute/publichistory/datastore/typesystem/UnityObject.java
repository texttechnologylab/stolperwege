

/* First created by JCasGen Tue Jul 09 12:14:39 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Jul 09 12:16:21 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/UnityBuilding.xml
 * @generated */
public class UnityObject extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UnityObject.class);
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
  protected UnityObject() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public UnityObject(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public UnityObject(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public UnityObject(JCas jcas, int begin, int end) {
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
  //* Feature: version

  /** getter for version - gets 
   * @generated
   * @return value of the feature 
   */
  public float getVersion() {
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((UnityObject_Type)jcasType).casFeatCode_version);}
    
  /** setter for version - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(float v) {
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    jcasType.ll_cas.ll_setFloatValue(addr, ((UnityObject_Type)jcasType).casFeatCode_version, v);}    
   
    
  //*--------------*
  //* Feature: scale

  /** getter for scale - gets 
   * @generated
   * @return value of the feature 
   */
  public float getScale() {
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_scale == null)
      jcasType.jcas.throwFeatMissing("scale", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((UnityObject_Type)jcasType).casFeatCode_scale);}
    
  /** setter for scale - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScale(float v) {
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_scale == null)
      jcasType.jcas.throwFeatMissing("scale", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    jcasType.ll_cas.ll_setFloatValue(addr, ((UnityObject_Type)jcasType).casFeatCode_scale, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModel() {
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UnityObject_Type)jcasType).casFeatCode_model);}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(String v) {
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    jcasType.ll_cas.ll_setStringValue(addr, ((UnityObject_Type)jcasType).casFeatCode_model, v);}    
   
    
  //*--------------*
  //* Feature: preview

  /** getter for preview - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPreview() {
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_preview == null)
      jcasType.jcas.throwFeatMissing("preview", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UnityObject_Type)jcasType).casFeatCode_preview);}
    
  /** setter for preview - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPreview(String v) {
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_preview == null)
      jcasType.jcas.throwFeatMissing("preview", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    jcasType.ll_cas.ll_setStringValue(addr, ((UnityObject_Type)jcasType).casFeatCode_preview, v);}    
   
    
  //*--------------*
  //* Feature: children

  /** getter for children - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getChildren() {
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UnityObject_Type)jcasType).casFeatCode_children)));}
    
  /** setter for children - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChildren(FSArray v) {
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    jcasType.ll_cas.ll_setRefValue(addr, ((UnityObject_Type)jcasType).casFeatCode_children, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for children - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public UnityObject getChildren(int i) {
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((UnityObject_Type)jcasType).casFeatCode_children), i);
    return (UnityObject)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((UnityObject_Type)jcasType).casFeatCode_children), i)));}

  /** indexed setter for children - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setChildren(int i, UnityObject v) { 
    if (UnityObject_Type.featOkTst && ((UnityObject_Type)jcasType).casFeat_children == null)
      jcasType.jcas.throwFeatMissing("children", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((UnityObject_Type)jcasType).casFeatCode_children), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((UnityObject_Type)jcasType).casFeatCode_children), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    