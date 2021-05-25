

/* First created by JCasGen Wed Jul 10 14:30:32 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Jul 10 14:31:07 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/Relation.xml
 * @generated */
public class Relation extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Relation.class);
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
  protected Relation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Relation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Relation(JCas jcas) {
    super(jcas);
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
  //* Feature: Start

  /** getter for Start - gets 
   * @generated
   * @return value of the feature 
   */
  public StolperwegeElement getStart() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Start == null)
      jcasType.jcas.throwFeatMissing("Start", "org.hucompute.publichistory.datastore.typesystem.Relation");
    return (StolperwegeElement)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Relation_Type)jcasType).casFeatCode_Start)));}
    
  /** setter for Start - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStart(StolperwegeElement v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Start == null)
      jcasType.jcas.throwFeatMissing("Start", "org.hucompute.publichistory.datastore.typesystem.Relation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Relation_Type)jcasType).casFeatCode_Start, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Target

  /** getter for Target - gets 
   * @generated
   * @return value of the feature 
   */
  public StolperwegeElement getTarget() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Target == null)
      jcasType.jcas.throwFeatMissing("Target", "org.hucompute.publichistory.datastore.typesystem.Relation");
    return (StolperwegeElement)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Relation_Type)jcasType).casFeatCode_Target)));}
    
  /** setter for Target - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(StolperwegeElement v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_Target == null)
      jcasType.jcas.throwFeatMissing("Target", "org.hucompute.publichistory.datastore.typesystem.Relation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Relation_Type)jcasType).casFeatCode_Target, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: RType

  /** getter for RType - gets 
   * @generated
   * @return value of the feature 
   */
  public RelationType getRType() {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_RType == null)
      jcasType.jcas.throwFeatMissing("RType", "org.hucompute.publichistory.datastore.typesystem.Relation");
    return (RelationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Relation_Type)jcasType).casFeatCode_RType)));}
    
  /** setter for RType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRType(RelationType v) {
    if (Relation_Type.featOkTst && ((Relation_Type)jcasType).casFeat_RType == null)
      jcasType.jcas.throwFeatMissing("RType", "org.hucompute.publichistory.datastore.typesystem.Relation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Relation_Type)jcasType).casFeatCode_RType, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    