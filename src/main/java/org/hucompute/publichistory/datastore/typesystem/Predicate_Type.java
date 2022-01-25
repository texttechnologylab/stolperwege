
/* First created by JCasGen Tue Jan 25 16:26:16 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jan 25 16:36:22 CET 2022
 * @generated */
public class Predicate_Type extends StolperwegeElement_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Predicate.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Predicate");
 
  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mendatoryRole;
  /** @generated */
  final int     casFeatCode_mendatoryRole;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMendatoryRole(int addr) {
        if (featOkTst && casFeat_mendatoryRole == null)
      jcas.throwFeatMissing("mendatoryRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mendatoryRole);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMendatoryRole(int addr, int v) {
        if (featOkTst && casFeat_mendatoryRole == null)
      jcas.throwFeatMissing("mendatoryRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    ll_cas.ll_setRefValue(addr, casFeatCode_mendatoryRole, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getMendatoryRole(int addr, int i) {
        if (featOkTst && casFeat_mendatoryRole == null)
      jcas.throwFeatMissing("mendatoryRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mendatoryRole), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mendatoryRole), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mendatoryRole), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setMendatoryRole(int addr, int i, int v) {
        if (featOkTst && casFeat_mendatoryRole == null)
      jcas.throwFeatMissing("mendatoryRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mendatoryRole), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mendatoryRole), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mendatoryRole), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_optionalRole;
  /** @generated */
  final int     casFeatCode_optionalRole;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOptionalRole(int addr) {
        if (featOkTst && casFeat_optionalRole == null)
      jcas.throwFeatMissing("optionalRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    return ll_cas.ll_getRefValue(addr, casFeatCode_optionalRole);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOptionalRole(int addr, int v) {
        if (featOkTst && casFeat_optionalRole == null)
      jcas.throwFeatMissing("optionalRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    ll_cas.ll_setRefValue(addr, casFeatCode_optionalRole, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getOptionalRole(int addr, int i) {
        if (featOkTst && casFeat_optionalRole == null)
      jcas.throwFeatMissing("optionalRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_optionalRole), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_optionalRole), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_optionalRole), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setOptionalRole(int addr, int i, int v) {
        if (featOkTst && casFeat_optionalRole == null)
      jcas.throwFeatMissing("optionalRole", "org.hucompute.publichistory.datastore.typesystem.Predicate");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_optionalRole), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_optionalRole), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_optionalRole), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Predicate_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_mendatoryRole = jcas.getRequiredFeatureDE(casType, "mendatoryRole", "uima.cas.FSArray", featOkTst);
    casFeatCode_mendatoryRole  = (null == casFeat_mendatoryRole) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mendatoryRole).getCode();

 
    casFeat_optionalRole = jcas.getRequiredFeatureDE(casType, "optionalRole", "uima.cas.FSArray", featOkTst);
    casFeatCode_optionalRole  = (null == casFeat_optionalRole) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_optionalRole).getCode();

  }
}



    