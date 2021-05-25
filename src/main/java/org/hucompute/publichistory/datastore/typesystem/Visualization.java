

/* First created by JCasGen Tue Jul 09 12:18:06 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Tue Jul 09 12:18:06 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/Visualization.xml
 * @generated */
public class Visualization extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Visualization.class);
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
  protected Visualization() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Visualization(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Visualization(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Visualization(JCas jcas, int begin, int end) {
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
  //* Feature: unityObjectIdentifier

  /** getter for unityObjectIdentifier - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUnityObjectIdentifier() {
    if (Visualization_Type.featOkTst && ((Visualization_Type)jcasType).casFeat_unityObjectIdentifier == null)
      jcasType.jcas.throwFeatMissing("unityObjectIdentifier", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Visualization_Type)jcasType).casFeatCode_unityObjectIdentifier);}
    
  /** setter for unityObjectIdentifier - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnityObjectIdentifier(String v) {
    if (Visualization_Type.featOkTst && ((Visualization_Type)jcasType).casFeat_unityObjectIdentifier == null)
      jcasType.jcas.throwFeatMissing("unityObjectIdentifier", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    jcasType.ll_cas.ll_setStringValue(addr, ((Visualization_Type)jcasType).casFeatCode_unityObjectIdentifier, v);}    
   
    
  //*--------------*
  //* Feature: requiredAnnotations

  /** getter for requiredAnnotations - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getRequiredAnnotations() {
    if (Visualization_Type.featOkTst && ((Visualization_Type)jcasType).casFeat_requiredAnnotations == null)
      jcasType.jcas.throwFeatMissing("requiredAnnotations", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Visualization_Type)jcasType).casFeatCode_requiredAnnotations)));}
    
  /** setter for requiredAnnotations - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRequiredAnnotations(StringArray v) {
    if (Visualization_Type.featOkTst && ((Visualization_Type)jcasType).casFeat_requiredAnnotations == null)
      jcasType.jcas.throwFeatMissing("requiredAnnotations", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    jcasType.ll_cas.ll_setRefValue(addr, ((Visualization_Type)jcasType).casFeatCode_requiredAnnotations, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for requiredAnnotations - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getRequiredAnnotations(int i) {
    if (Visualization_Type.featOkTst && ((Visualization_Type)jcasType).casFeat_requiredAnnotations == null)
      jcasType.jcas.throwFeatMissing("requiredAnnotations", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Visualization_Type)jcasType).casFeatCode_requiredAnnotations), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Visualization_Type)jcasType).casFeatCode_requiredAnnotations), i);}

  /** indexed setter for requiredAnnotations - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setRequiredAnnotations(int i, String v) { 
    if (Visualization_Type.featOkTst && ((Visualization_Type)jcasType).casFeat_requiredAnnotations == null)
      jcasType.jcas.throwFeatMissing("requiredAnnotations", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Visualization_Type)jcasType).casFeatCode_requiredAnnotations), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Visualization_Type)jcasType).casFeatCode_requiredAnnotations), i, v);}
  }

    