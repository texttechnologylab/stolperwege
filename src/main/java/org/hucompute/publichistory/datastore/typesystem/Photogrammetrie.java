

/* First created by JCasGen Tue Jul 09 12:17:28 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Jul 09 12:17:28 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/Photogrammetrie.xml
 * @generated */
public class Photogrammetrie extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Photogrammetrie.class);
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
  protected Photogrammetrie() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Photogrammetrie(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Photogrammetrie(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Photogrammetrie(JCas jcas, int begin, int end) {
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
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModel() {
    if (Photogrammetrie_Type.featOkTst && ((Photogrammetrie_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.hucompute.publichistory.datastore.typesystem.Photogrammetrie");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Photogrammetrie_Type)jcasType).casFeatCode_model);}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(String v) {
    if (Photogrammetrie_Type.featOkTst && ((Photogrammetrie_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.hucompute.publichistory.datastore.typesystem.Photogrammetrie");
    jcasType.ll_cas.ll_setStringValue(addr, ((Photogrammetrie_Type)jcasType).casFeatCode_model, v);}    
   
    
  //*--------------*
  //* Feature: materials

  /** getter for materials - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMaterials() {
    if (Photogrammetrie_Type.featOkTst && ((Photogrammetrie_Type)jcasType).casFeat_materials == null)
      jcasType.jcas.throwFeatMissing("materials", "org.hucompute.publichistory.datastore.typesystem.Photogrammetrie");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Photogrammetrie_Type)jcasType).casFeatCode_materials);}
    
  /** setter for materials - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMaterials(String v) {
    if (Photogrammetrie_Type.featOkTst && ((Photogrammetrie_Type)jcasType).casFeat_materials == null)
      jcasType.jcas.throwFeatMissing("materials", "org.hucompute.publichistory.datastore.typesystem.Photogrammetrie");
    jcasType.ll_cas.ll_setStringValue(addr, ((Photogrammetrie_Type)jcasType).casFeatCode_materials, v);}    
  }

    