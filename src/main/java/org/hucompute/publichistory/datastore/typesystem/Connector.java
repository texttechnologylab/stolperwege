

/* First created by JCasGen Tue Jul 09 12:14:17 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Tue Jul 09 12:14:26 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/Event.xml
 * @generated */
public class Connector extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Connector.class);
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
  protected Connector() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Connector(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Connector(JCas jcas) {
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
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (Connector_Type.featOkTst && ((Connector_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.hucompute.publichistory.datastore.typesystem.Connector");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Connector_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (Connector_Type.featOkTst && ((Connector_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.hucompute.publichistory.datastore.typesystem.Connector");
    jcasType.ll_cas.ll_setStringValue(addr, ((Connector_Type)jcasType).casFeatCode_value, v);}    
  }

    