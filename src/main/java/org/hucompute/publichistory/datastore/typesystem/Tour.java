

/* First created by JCasGen Tue Jan 25 16:36:33 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Jan 25 16:36:33 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Tour.xml
 * @generated */
public class Tour extends UnityPosition {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Tour.class);
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
  protected Tour() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Tour(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Tour(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Tour(JCas jcas, int begin, int end) {
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
  //* Feature: previous

  /** getter for previous - gets 
   * @generated
   * @return value of the feature 
   */
  public Waypoint getPrevious() {
    if (Tour_Type.featOkTst && ((Tour_Type)jcasType).casFeat_previous == null)
      jcasType.jcas.throwFeatMissing("previous", "org.hucompute.publichistory.datastore.typesystem.Tour");
    return (Waypoint)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Tour_Type)jcasType).casFeatCode_previous)));}
    
  /** setter for previous - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrevious(Waypoint v) {
    if (Tour_Type.featOkTst && ((Tour_Type)jcasType).casFeat_previous == null)
      jcasType.jcas.throwFeatMissing("previous", "org.hucompute.publichistory.datastore.typesystem.Tour");
    jcasType.ll_cas.ll_setRefValue(addr, ((Tour_Type)jcasType).casFeatCode_previous, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: next

  /** getter for next - gets 
   * @generated
   * @return value of the feature 
   */
  public Waypoint getNext() {
    if (Tour_Type.featOkTst && ((Tour_Type)jcasType).casFeat_next == null)
      jcasType.jcas.throwFeatMissing("next", "org.hucompute.publichistory.datastore.typesystem.Tour");
    return (Waypoint)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Tour_Type)jcasType).casFeatCode_next)));}
    
  /** setter for next - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNext(Waypoint v) {
    if (Tour_Type.featOkTst && ((Tour_Type)jcasType).casFeat_next == null)
      jcasType.jcas.throwFeatMissing("next", "org.hucompute.publichistory.datastore.typesystem.Tour");
    jcasType.ll_cas.ll_setRefValue(addr, ((Tour_Type)jcasType).casFeatCode_next, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    