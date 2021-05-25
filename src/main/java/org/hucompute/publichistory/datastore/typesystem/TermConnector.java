

/* First created by JCasGen Tue Jul 09 12:14:17 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Jul 09 12:14:27 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/Event.xml
 * @generated */
public class TermConnector extends StolperwegeElement {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TermConnector.class);
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
  protected TermConnector() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TermConnector(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TermConnector(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TermConnector(JCas jcas, int begin, int end) {
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
  //* Feature: connector

  /** getter for connector - gets 
   * @generated
   * @return value of the feature 
   */
  public Connector getConnector() {
    if (TermConnector_Type.featOkTst && ((TermConnector_Type)jcasType).casFeat_connector == null)
      jcasType.jcas.throwFeatMissing("connector", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    return (Connector)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TermConnector_Type)jcasType).casFeatCode_connector)));}
    
  /** setter for connector - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConnector(Connector v) {
    if (TermConnector_Type.featOkTst && ((TermConnector_Type)jcasType).casFeat_connector == null)
      jcasType.jcas.throwFeatMissing("connector", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    jcasType.ll_cas.ll_setRefValue(addr, ((TermConnector_Type)jcasType).casFeatCode_connector, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: terms

  /** getter for terms - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getTerms() {
    if (TermConnector_Type.featOkTst && ((TermConnector_Type)jcasType).casFeat_terms == null)
      jcasType.jcas.throwFeatMissing("terms", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TermConnector_Type)jcasType).casFeatCode_terms)));}
    
  /** setter for terms - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTerms(FSArray v) {
    if (TermConnector_Type.featOkTst && ((TermConnector_Type)jcasType).casFeat_terms == null)
      jcasType.jcas.throwFeatMissing("terms", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    jcasType.ll_cas.ll_setRefValue(addr, ((TermConnector_Type)jcasType).casFeatCode_terms, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for terms - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Term getTerms(int i) {
    if (TermConnector_Type.featOkTst && ((TermConnector_Type)jcasType).casFeat_terms == null)
      jcasType.jcas.throwFeatMissing("terms", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TermConnector_Type)jcasType).casFeatCode_terms), i);
    return (Term)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TermConnector_Type)jcasType).casFeatCode_terms), i)));}

  /** indexed setter for terms - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTerms(int i, Term v) { 
    if (TermConnector_Type.featOkTst && ((TermConnector_Type)jcasType).casFeat_terms == null)
      jcasType.jcas.throwFeatMissing("terms", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TermConnector_Type)jcasType).casFeatCode_terms), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TermConnector_Type)jcasType).casFeatCode_terms), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    