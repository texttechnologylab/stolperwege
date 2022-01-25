

/* First created by JCasGen Tue Jan 25 16:26:50 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Tue Jan 25 16:35:46 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Proposition.xml
 * @generated */
public class Person extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Person.class);
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
  protected Person() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Person(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Person(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Person(JCas jcas, int begin, int end) {
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
  //* Feature: firstName

  /** getter for firstName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFirstName() {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_firstName == null)
      jcasType.jcas.throwFeatMissing("firstName", "org.hucompute.publichistory.datastore.typesystem.Person");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Person_Type)jcasType).casFeatCode_firstName);}
    
  /** setter for firstName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFirstName(String v) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_firstName == null)
      jcasType.jcas.throwFeatMissing("firstName", "org.hucompute.publichistory.datastore.typesystem.Person");
    jcasType.ll_cas.ll_setStringValue(addr, ((Person_Type)jcasType).casFeatCode_firstName, v);}    
   
    
  //*--------------*
  //* Feature: lastName

  /** getter for lastName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLastName() {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_lastName == null)
      jcasType.jcas.throwFeatMissing("lastName", "org.hucompute.publichistory.datastore.typesystem.Person");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Person_Type)jcasType).casFeatCode_lastName);}
    
  /** setter for lastName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLastName(String v) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_lastName == null)
      jcasType.jcas.throwFeatMissing("lastName", "org.hucompute.publichistory.datastore.typesystem.Person");
    jcasType.ll_cas.ll_setStringValue(addr, ((Person_Type)jcasType).casFeatCode_lastName, v);}    
   
    
  //*--------------*
  //* Feature: optionalName

  /** getter for optionalName - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getOptionalName() {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_optionalName == null)
      jcasType.jcas.throwFeatMissing("optionalName", "org.hucompute.publichistory.datastore.typesystem.Person");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Person_Type)jcasType).casFeatCode_optionalName)));}
    
  /** setter for optionalName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOptionalName(StringArray v) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_optionalName == null)
      jcasType.jcas.throwFeatMissing("optionalName", "org.hucompute.publichistory.datastore.typesystem.Person");
    jcasType.ll_cas.ll_setRefValue(addr, ((Person_Type)jcasType).casFeatCode_optionalName, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for optionalName - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getOptionalName(int i) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_optionalName == null)
      jcasType.jcas.throwFeatMissing("optionalName", "org.hucompute.publichistory.datastore.typesystem.Person");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Person_Type)jcasType).casFeatCode_optionalName), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Person_Type)jcasType).casFeatCode_optionalName), i);}

  /** indexed setter for optionalName - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setOptionalName(int i, String v) { 
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_optionalName == null)
      jcasType.jcas.throwFeatMissing("optionalName", "org.hucompute.publichistory.datastore.typesystem.Person");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Person_Type)jcasType).casFeatCode_optionalName), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Person_Type)jcasType).casFeatCode_optionalName), i, v);}
   
    
  //*--------------*
  //* Feature: birthDate

  /** getter for birthDate - gets 
   * @generated
   * @return value of the feature 
   */
  public Time getBirthDate() {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_birthDate == null)
      jcasType.jcas.throwFeatMissing("birthDate", "org.hucompute.publichistory.datastore.typesystem.Person");
    return (Time)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Person_Type)jcasType).casFeatCode_birthDate)));}
    
  /** setter for birthDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBirthDate(Time v) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_birthDate == null)
      jcasType.jcas.throwFeatMissing("birthDate", "org.hucompute.publichistory.datastore.typesystem.Person");
    jcasType.ll_cas.ll_setRefValue(addr, ((Person_Type)jcasType).casFeatCode_birthDate, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: deathDate

  /** getter for deathDate - gets 
   * @generated
   * @return value of the feature 
   */
  public Time getDeathDate() {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_deathDate == null)
      jcasType.jcas.throwFeatMissing("deathDate", "org.hucompute.publichistory.datastore.typesystem.Person");
    return (Time)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Person_Type)jcasType).casFeatCode_deathDate)));}
    
  /** setter for deathDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDeathDate(Time v) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_deathDate == null)
      jcasType.jcas.throwFeatMissing("deathDate", "org.hucompute.publichistory.datastore.typesystem.Person");
    jcasType.ll_cas.ll_setRefValue(addr, ((Person_Type)jcasType).casFeatCode_deathDate, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: father

  /** getter for father - gets 
   * @generated
   * @return value of the feature 
   */
  public Person getFather() {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_father == null)
      jcasType.jcas.throwFeatMissing("father", "org.hucompute.publichistory.datastore.typesystem.Person");
    return (Person)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Person_Type)jcasType).casFeatCode_father)));}
    
  /** setter for father - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFather(Person v) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_father == null)
      jcasType.jcas.throwFeatMissing("father", "org.hucompute.publichistory.datastore.typesystem.Person");
    jcasType.ll_cas.ll_setRefValue(addr, ((Person_Type)jcasType).casFeatCode_father, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: mother

  /** getter for mother - gets 
   * @generated
   * @return value of the feature 
   */
  public Person getMother() {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_mother == null)
      jcasType.jcas.throwFeatMissing("mother", "org.hucompute.publichistory.datastore.typesystem.Person");
    return (Person)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Person_Type)jcasType).casFeatCode_mother)));}
    
  /** setter for mother - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMother(Person v) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_mother == null)
      jcasType.jcas.throwFeatMissing("mother", "org.hucompute.publichistory.datastore.typesystem.Person");
    jcasType.ll_cas.ll_setRefValue(addr, ((Person_Type)jcasType).casFeatCode_mother, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: gnd

  /** getter for gnd - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGnd() {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_gnd == null)
      jcasType.jcas.throwFeatMissing("gnd", "org.hucompute.publichistory.datastore.typesystem.Person");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Person_Type)jcasType).casFeatCode_gnd);}
    
  /** setter for gnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGnd(String v) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_gnd == null)
      jcasType.jcas.throwFeatMissing("gnd", "org.hucompute.publichistory.datastore.typesystem.Person");
    jcasType.ll_cas.ll_setStringValue(addr, ((Person_Type)jcasType).casFeatCode_gnd, v);}    
   
    
  //*--------------*
  //* Feature: gender

  /** getter for gender - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGender() {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_gender == null)
      jcasType.jcas.throwFeatMissing("gender", "org.hucompute.publichistory.datastore.typesystem.Person");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Person_Type)jcasType).casFeatCode_gender);}
    
  /** setter for gender - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGender(String v) {
    if (Person_Type.featOkTst && ((Person_Type)jcasType).casFeat_gender == null)
      jcasType.jcas.throwFeatMissing("gender", "org.hucompute.publichistory.datastore.typesystem.Person");
    jcasType.ll_cas.ll_setStringValue(addr, ((Person_Type)jcasType).casFeatCode_gender, v);}    
  }

    