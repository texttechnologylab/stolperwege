

/* First created by JCasGen Tue Jan 25 16:26:50 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Tue Jan 25 16:36:22 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/TermConnector.xml
 * @generated */
public class Term extends StolperwegeElement {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Term.class);
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
  protected Term() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Term(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Term(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Term(JCas jcas, int begin, int end) {
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
  //* Feature: predicate

  /** getter for predicate - gets 
   * @generated
   * @return value of the feature 
   */
  public Predicate getPredicate() {
    if (Term_Type.featOkTst && ((Term_Type)jcasType).casFeat_predicate == null)
      jcasType.jcas.throwFeatMissing("predicate", "org.hucompute.publichistory.datastore.typesystem.Term");
    return (Predicate)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Term_Type)jcasType).casFeatCode_predicate)));}
    
  /** setter for predicate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPredicate(Predicate v) {
    if (Term_Type.featOkTst && ((Term_Type)jcasType).casFeat_predicate == null)
      jcasType.jcas.throwFeatMissing("predicate", "org.hucompute.publichistory.datastore.typesystem.Term");
    jcasType.ll_cas.ll_setRefValue(addr, ((Term_Type)jcasType).casFeatCode_predicate, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: argument

  /** getter for argument - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getArgument() {
    if (Term_Type.featOkTst && ((Term_Type)jcasType).casFeat_argument == null)
      jcasType.jcas.throwFeatMissing("argument", "org.hucompute.publichistory.datastore.typesystem.Term");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Term_Type)jcasType).casFeatCode_argument)));}
    
  /** setter for argument - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setArgument(FSArray v) {
    if (Term_Type.featOkTst && ((Term_Type)jcasType).casFeat_argument == null)
      jcasType.jcas.throwFeatMissing("argument", "org.hucompute.publichistory.datastore.typesystem.Term");
    jcasType.ll_cas.ll_setRefValue(addr, ((Term_Type)jcasType).casFeatCode_argument, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for argument - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Argument getArgument(int i) {
    if (Term_Type.featOkTst && ((Term_Type)jcasType).casFeat_argument == null)
      jcasType.jcas.throwFeatMissing("argument", "org.hucompute.publichistory.datastore.typesystem.Term");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Term_Type)jcasType).casFeatCode_argument), i);
    return (Argument)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Term_Type)jcasType).casFeatCode_argument), i)));}

  /** indexed setter for argument - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setArgument(int i, Argument v) { 
    if (Term_Type.featOkTst && ((Term_Type)jcasType).casFeat_argument == null)
      jcasType.jcas.throwFeatMissing("argument", "org.hucompute.publichistory.datastore.typesystem.Term");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Term_Type)jcasType).casFeatCode_argument), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Term_Type)jcasType).casFeatCode_argument), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    