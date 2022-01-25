
/* First created by JCasGen Tue Jan 25 16:26:50 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jan 25 16:35:46 CET 2022
 * @generated */
public class Person_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Person.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Person");
 
  /** @generated */
  final Feature casFeat_firstName;
  /** @generated */
  final int     casFeatCode_firstName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFirstName(int addr) {
        if (featOkTst && casFeat_firstName == null)
      jcas.throwFeatMissing("firstName", "org.hucompute.publichistory.datastore.typesystem.Person");
    return ll_cas.ll_getStringValue(addr, casFeatCode_firstName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFirstName(int addr, String v) {
        if (featOkTst && casFeat_firstName == null)
      jcas.throwFeatMissing("firstName", "org.hucompute.publichistory.datastore.typesystem.Person");
    ll_cas.ll_setStringValue(addr, casFeatCode_firstName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lastName;
  /** @generated */
  final int     casFeatCode_lastName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLastName(int addr) {
        if (featOkTst && casFeat_lastName == null)
      jcas.throwFeatMissing("lastName", "org.hucompute.publichistory.datastore.typesystem.Person");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lastName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLastName(int addr, String v) {
        if (featOkTst && casFeat_lastName == null)
      jcas.throwFeatMissing("lastName", "org.hucompute.publichistory.datastore.typesystem.Person");
    ll_cas.ll_setStringValue(addr, casFeatCode_lastName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_optionalName;
  /** @generated */
  final int     casFeatCode_optionalName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOptionalName(int addr) {
        if (featOkTst && casFeat_optionalName == null)
      jcas.throwFeatMissing("optionalName", "org.hucompute.publichistory.datastore.typesystem.Person");
    return ll_cas.ll_getRefValue(addr, casFeatCode_optionalName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOptionalName(int addr, int v) {
        if (featOkTst && casFeat_optionalName == null)
      jcas.throwFeatMissing("optionalName", "org.hucompute.publichistory.datastore.typesystem.Person");
    ll_cas.ll_setRefValue(addr, casFeatCode_optionalName, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getOptionalName(int addr, int i) {
        if (featOkTst && casFeat_optionalName == null)
      jcas.throwFeatMissing("optionalName", "org.hucompute.publichistory.datastore.typesystem.Person");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_optionalName), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_optionalName), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_optionalName), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setOptionalName(int addr, int i, String v) {
        if (featOkTst && casFeat_optionalName == null)
      jcas.throwFeatMissing("optionalName", "org.hucompute.publichistory.datastore.typesystem.Person");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_optionalName), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_optionalName), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_optionalName), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_birthDate;
  /** @generated */
  final int     casFeatCode_birthDate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBirthDate(int addr) {
        if (featOkTst && casFeat_birthDate == null)
      jcas.throwFeatMissing("birthDate", "org.hucompute.publichistory.datastore.typesystem.Person");
    return ll_cas.ll_getRefValue(addr, casFeatCode_birthDate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBirthDate(int addr, int v) {
        if (featOkTst && casFeat_birthDate == null)
      jcas.throwFeatMissing("birthDate", "org.hucompute.publichistory.datastore.typesystem.Person");
    ll_cas.ll_setRefValue(addr, casFeatCode_birthDate, v);}
    
  
 
  /** @generated */
  final Feature casFeat_deathDate;
  /** @generated */
  final int     casFeatCode_deathDate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDeathDate(int addr) {
        if (featOkTst && casFeat_deathDate == null)
      jcas.throwFeatMissing("deathDate", "org.hucompute.publichistory.datastore.typesystem.Person");
    return ll_cas.ll_getRefValue(addr, casFeatCode_deathDate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDeathDate(int addr, int v) {
        if (featOkTst && casFeat_deathDate == null)
      jcas.throwFeatMissing("deathDate", "org.hucompute.publichistory.datastore.typesystem.Person");
    ll_cas.ll_setRefValue(addr, casFeatCode_deathDate, v);}
    
  
 
  /** @generated */
  final Feature casFeat_father;
  /** @generated */
  final int     casFeatCode_father;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFather(int addr) {
        if (featOkTst && casFeat_father == null)
      jcas.throwFeatMissing("father", "org.hucompute.publichistory.datastore.typesystem.Person");
    return ll_cas.ll_getRefValue(addr, casFeatCode_father);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFather(int addr, int v) {
        if (featOkTst && casFeat_father == null)
      jcas.throwFeatMissing("father", "org.hucompute.publichistory.datastore.typesystem.Person");
    ll_cas.ll_setRefValue(addr, casFeatCode_father, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mother;
  /** @generated */
  final int     casFeatCode_mother;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMother(int addr) {
        if (featOkTst && casFeat_mother == null)
      jcas.throwFeatMissing("mother", "org.hucompute.publichistory.datastore.typesystem.Person");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mother);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMother(int addr, int v) {
        if (featOkTst && casFeat_mother == null)
      jcas.throwFeatMissing("mother", "org.hucompute.publichistory.datastore.typesystem.Person");
    ll_cas.ll_setRefValue(addr, casFeatCode_mother, v);}
    
  
 
  /** @generated */
  final Feature casFeat_gnd;
  /** @generated */
  final int     casFeatCode_gnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGnd(int addr) {
        if (featOkTst && casFeat_gnd == null)
      jcas.throwFeatMissing("gnd", "org.hucompute.publichistory.datastore.typesystem.Person");
    return ll_cas.ll_getStringValue(addr, casFeatCode_gnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGnd(int addr, String v) {
        if (featOkTst && casFeat_gnd == null)
      jcas.throwFeatMissing("gnd", "org.hucompute.publichistory.datastore.typesystem.Person");
    ll_cas.ll_setStringValue(addr, casFeatCode_gnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_gender;
  /** @generated */
  final int     casFeatCode_gender;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGender(int addr) {
        if (featOkTst && casFeat_gender == null)
      jcas.throwFeatMissing("gender", "org.hucompute.publichistory.datastore.typesystem.Person");
    return ll_cas.ll_getStringValue(addr, casFeatCode_gender);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGender(int addr, String v) {
        if (featOkTst && casFeat_gender == null)
      jcas.throwFeatMissing("gender", "org.hucompute.publichistory.datastore.typesystem.Person");
    ll_cas.ll_setStringValue(addr, casFeatCode_gender, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Person_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_firstName = jcas.getRequiredFeatureDE(casType, "firstName", "uima.cas.String", featOkTst);
    casFeatCode_firstName  = (null == casFeat_firstName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_firstName).getCode();

 
    casFeat_lastName = jcas.getRequiredFeatureDE(casType, "lastName", "uima.cas.String", featOkTst);
    casFeatCode_lastName  = (null == casFeat_lastName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lastName).getCode();

 
    casFeat_optionalName = jcas.getRequiredFeatureDE(casType, "optionalName", "uima.cas.StringArray", featOkTst);
    casFeatCode_optionalName  = (null == casFeat_optionalName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_optionalName).getCode();

 
    casFeat_birthDate = jcas.getRequiredFeatureDE(casType, "birthDate", "org.hucompute.publichistory.datastore.typesystem.Time", featOkTst);
    casFeatCode_birthDate  = (null == casFeat_birthDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_birthDate).getCode();

 
    casFeat_deathDate = jcas.getRequiredFeatureDE(casType, "deathDate", "org.hucompute.publichistory.datastore.typesystem.Time", featOkTst);
    casFeatCode_deathDate  = (null == casFeat_deathDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_deathDate).getCode();

 
    casFeat_father = jcas.getRequiredFeatureDE(casType, "father", "org.hucompute.publichistory.datastore.typesystem.Person", featOkTst);
    casFeatCode_father  = (null == casFeat_father) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_father).getCode();

 
    casFeat_mother = jcas.getRequiredFeatureDE(casType, "mother", "org.hucompute.publichistory.datastore.typesystem.Person", featOkTst);
    casFeatCode_mother  = (null == casFeat_mother) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mother).getCode();

 
    casFeat_gnd = jcas.getRequiredFeatureDE(casType, "gnd", "uima.cas.String", featOkTst);
    casFeatCode_gnd  = (null == casFeat_gnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gnd).getCode();

 
    casFeat_gender = jcas.getRequiredFeatureDE(casType, "gender", "uima.cas.String", featOkTst);
    casFeatCode_gender  = (null == casFeat_gender) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gender).getCode();

  }
}



    