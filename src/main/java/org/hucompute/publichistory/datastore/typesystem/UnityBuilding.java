

/* First created by JCasGen Tue Jan 25 16:36:37 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Jan 25 16:36:37 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/UnityBuilding.xml
 * @generated */
public class UnityBuilding extends UnityObject {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UnityBuilding.class);
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
  protected UnityBuilding() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public UnityBuilding(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public UnityBuilding(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public UnityBuilding(JCas jcas, int begin, int end) {
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
  //* Feature: prefab

  /** getter for prefab - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPrefab() {
    if (UnityBuilding_Type.featOkTst && ((UnityBuilding_Type)jcasType).casFeat_prefab == null)
      jcasType.jcas.throwFeatMissing("prefab", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UnityBuilding_Type)jcasType).casFeatCode_prefab);}
    
  /** setter for prefab - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrefab(String v) {
    if (UnityBuilding_Type.featOkTst && ((UnityBuilding_Type)jcasType).casFeat_prefab == null)
      jcasType.jcas.throwFeatMissing("prefab", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    jcasType.ll_cas.ll_setStringValue(addr, ((UnityBuilding_Type)jcasType).casFeatCode_prefab, v);}    
   
    
  //*--------------*
  //* Feature: angle

  /** getter for angle - gets 
   * @generated
   * @return value of the feature 
   */
  public int getAngle() {
    if (UnityBuilding_Type.featOkTst && ((UnityBuilding_Type)jcasType).casFeat_angle == null)
      jcasType.jcas.throwFeatMissing("angle", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    return jcasType.ll_cas.ll_getIntValue(addr, ((UnityBuilding_Type)jcasType).casFeatCode_angle);}
    
  /** setter for angle - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAngle(int v) {
    if (UnityBuilding_Type.featOkTst && ((UnityBuilding_Type)jcasType).casFeat_angle == null)
      jcasType.jcas.throwFeatMissing("angle", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    jcasType.ll_cas.ll_setIntValue(addr, ((UnityBuilding_Type)jcasType).casFeatCode_angle, v);}    
   
    
  //*--------------*
  //* Feature: scene

  /** getter for scene - gets 
   * @generated
   * @return value of the feature 
   */
  public String getScene() {
    if (UnityBuilding_Type.featOkTst && ((UnityBuilding_Type)jcasType).casFeat_scene == null)
      jcasType.jcas.throwFeatMissing("scene", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UnityBuilding_Type)jcasType).casFeatCode_scene);}
    
  /** setter for scene - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScene(String v) {
    if (UnityBuilding_Type.featOkTst && ((UnityBuilding_Type)jcasType).casFeat_scene == null)
      jcasType.jcas.throwFeatMissing("scene", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    jcasType.ll_cas.ll_setStringValue(addr, ((UnityBuilding_Type)jcasType).casFeatCode_scene, v);}    
  }

    