
/* First created by JCasGen Tue Jan 25 16:26:01 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jan 25 16:36:48 CET 2022
 * @generated */
public class StolperwegeUser_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = StolperwegeUser.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
 
  /** @generated */
  final Feature casFeat_mail;
  /** @generated */
  final int     casFeatCode_mail;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMail(int addr) {
        if (featOkTst && casFeat_mail == null)
      jcas.throwFeatMissing("mail", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mail);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMail(int addr, String v) {
        if (featOkTst && casFeat_mail == null)
      jcas.throwFeatMissing("mail", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    ll_cas.ll_setStringValue(addr, casFeatCode_mail, v);}
    
  
 
  /** @generated */
  final Feature casFeat_status;
  /** @generated */
  final int     casFeatCode_status;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getStatus(int addr) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_status);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStatus(int addr, boolean v) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_status, v);}
    
  
 
  /** @generated */
  final Feature casFeat_password;
  /** @generated */
  final int     casFeatCode_password;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPassword(int addr) {
        if (featOkTst && casFeat_password == null)
      jcas.throwFeatMissing("password", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    return ll_cas.ll_getStringValue(addr, casFeatCode_password);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPassword(int addr, String v) {
        if (featOkTst && casFeat_password == null)
      jcas.throwFeatMissing("password", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    ll_cas.ll_setStringValue(addr, casFeatCode_password, v);}
    
  
 
  /** @generated */
  final Feature casFeat_preferences;
  /** @generated */
  final int     casFeatCode_preferences;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPreferences(int addr) {
        if (featOkTst && casFeat_preferences == null)
      jcas.throwFeatMissing("preferences", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    return ll_cas.ll_getRefValue(addr, casFeatCode_preferences);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPreferences(int addr, int v) {
        if (featOkTst && casFeat_preferences == null)
      jcas.throwFeatMissing("preferences", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    ll_cas.ll_setRefValue(addr, casFeatCode_preferences, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getPreferences(int addr, int i) {
        if (featOkTst && casFeat_preferences == null)
      jcas.throwFeatMissing("preferences", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_preferences), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_preferences), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_preferences), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setPreferences(int addr, int i, int v) {
        if (featOkTst && casFeat_preferences == null)
      jcas.throwFeatMissing("preferences", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_preferences), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_preferences), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_preferences), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public StolperwegeUser_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_mail = jcas.getRequiredFeatureDE(casType, "mail", "uima.cas.String", featOkTst);
    casFeatCode_mail  = (null == casFeat_mail) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mail).getCode();

 
    casFeat_status = jcas.getRequiredFeatureDE(casType, "status", "uima.cas.Boolean", featOkTst);
    casFeatCode_status  = (null == casFeat_status) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_status).getCode();

 
    casFeat_password = jcas.getRequiredFeatureDE(casType, "password", "uima.cas.String", featOkTst);
    casFeatCode_password  = (null == casFeat_password) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_password).getCode();

 
    casFeat_preferences = jcas.getRequiredFeatureDE(casType, "preferences", "uima.cas.FSArray", featOkTst);
    casFeatCode_preferences  = (null == casFeat_preferences) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_preferences).getCode();

  }
}



    