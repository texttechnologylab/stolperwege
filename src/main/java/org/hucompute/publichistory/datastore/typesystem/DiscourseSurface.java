

/* First created by JCasGen Wed Jan 16 13:35:19 CET 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.IntegerArray;


/** 
 * Updated by JCasGen Tue Jul 09 14:40:40 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/DiscourseSurface.xml
 * @generated */
public class DiscourseSurface extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DiscourseSurface.class);
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
  protected DiscourseSurface() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DiscourseSurface(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DiscourseSurface(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DiscourseSurface(JCas jcas, int begin, int end) {
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
  //* Feature: vertices

  /** getter for vertices - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getVertices() {
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_vertices == null)
      jcasType.jcas.throwFeatMissing("vertices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_vertices)));}
    
  /** setter for vertices - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVertices(StringArray v) {
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_vertices == null)
      jcasType.jcas.throwFeatMissing("vertices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    jcasType.ll_cas.ll_setRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_vertices, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for vertices - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getVertices(int i) {
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_vertices == null)
      jcasType.jcas.throwFeatMissing("vertices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_vertices), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_vertices), i);}

  /** indexed setter for vertices - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setVertices(int i, String v) { 
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_vertices == null)
      jcasType.jcas.throwFeatMissing("vertices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_vertices), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_vertices), i, v);}
   
    
  //*--------------*
  //* Feature: indices

  /** getter for indices - gets 
   * @generated
   * @return value of the feature 
   */
  public IntegerArray getIndices() {
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_indices == null)
      jcasType.jcas.throwFeatMissing("indices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    return (IntegerArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_indices)));}
    
  /** setter for indices - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndices(IntegerArray v) {
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_indices == null)
      jcasType.jcas.throwFeatMissing("indices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    jcasType.ll_cas.ll_setRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_indices, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for indices - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public int getIndices(int i) {
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_indices == null)
      jcasType.jcas.throwFeatMissing("indices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_indices), i);
    return jcasType.ll_cas.ll_getIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_indices), i);}

  /** indexed setter for indices - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setIndices(int i, int v) { 
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_indices == null)
      jcasType.jcas.throwFeatMissing("indices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_indices), i);
    jcasType.ll_cas.ll_setIntArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_indices), i, v);}
   
    
  //*--------------*
  //* Feature: uv

  /** getter for uv - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUv() {
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_uv == null)
      jcasType.jcas.throwFeatMissing("uv", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_uv);}
    
  /** setter for uv - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUv(String v) {
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_uv == null)
      jcasType.jcas.throwFeatMissing("uv", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    jcasType.ll_cas.ll_setStringValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_uv, v);}    
   
    
  //*--------------*
  //* Feature: normal

  /** getter for normal - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNormal() {
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_normal == null)
      jcasType.jcas.throwFeatMissing("normal", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_normal);}
    
  /** setter for normal - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNormal(String v) {
    if (DiscourseSurface_Type.featOkTst && ((DiscourseSurface_Type)jcasType).casFeat_normal == null)
      jcasType.jcas.throwFeatMissing("normal", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    jcasType.ll_cas.ll_setStringValue(addr, ((DiscourseSurface_Type)jcasType).casFeatCode_normal, v);}    
  }

    