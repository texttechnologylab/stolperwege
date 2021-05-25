
/* First created by JCasGen Tue Jul 09 12:14:17 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jul 09 12:14:26 CEST 2019
 * @generated */
public class Event_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Event.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Event");
 
  /** @generated */
  final Feature casFeat_startsWith;
  /** @generated */
  final int     casFeatCode_startsWith;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStartsWith(int addr) {
        if (featOkTst && casFeat_startsWith == null)
      jcas.throwFeatMissing("startsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    return ll_cas.ll_getRefValue(addr, casFeatCode_startsWith);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartsWith(int addr, int v) {
        if (featOkTst && casFeat_startsWith == null)
      jcas.throwFeatMissing("startsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    ll_cas.ll_setRefValue(addr, casFeatCode_startsWith, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getStartsWith(int addr, int i) {
        if (featOkTst && casFeat_startsWith == null)
      jcas.throwFeatMissing("startsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_startsWith), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_startsWith), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_startsWith), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setStartsWith(int addr, int i, int v) {
        if (featOkTst && casFeat_startsWith == null)
      jcas.throwFeatMissing("startsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_startsWith), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_startsWith), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_startsWith), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_endsWith;
  /** @generated */
  final int     casFeatCode_endsWith;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndsWith(int addr) {
        if (featOkTst && casFeat_endsWith == null)
      jcas.throwFeatMissing("endsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endsWith);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndsWith(int addr, int v) {
        if (featOkTst && casFeat_endsWith == null)
      jcas.throwFeatMissing("endsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    ll_cas.ll_setRefValue(addr, casFeatCode_endsWith, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getEndsWith(int addr, int i) {
        if (featOkTst && casFeat_endsWith == null)
      jcas.throwFeatMissing("endsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_endsWith), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_endsWith), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_endsWith), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setEndsWith(int addr, int i, int v) {
        if (featOkTst && casFeat_endsWith == null)
      jcas.throwFeatMissing("endsWith", "org.hucompute.publichistory.datastore.typesystem.Event");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_endsWith), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_endsWith), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_endsWith), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_startTime;
  /** @generated */
  final int     casFeatCode_startTime;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStartTime(int addr) {
        if (featOkTst && casFeat_startTime == null)
      jcas.throwFeatMissing("startTime", "org.hucompute.publichistory.datastore.typesystem.Event");
    return ll_cas.ll_getRefValue(addr, casFeatCode_startTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartTime(int addr, int v) {
        if (featOkTst && casFeat_startTime == null)
      jcas.throwFeatMissing("startTime", "org.hucompute.publichistory.datastore.typesystem.Event");
    ll_cas.ll_setRefValue(addr, casFeatCode_startTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endTime;
  /** @generated */
  final int     casFeatCode_endTime;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndTime(int addr) {
        if (featOkTst && casFeat_endTime == null)
      jcas.throwFeatMissing("endTime", "org.hucompute.publichistory.datastore.typesystem.Event");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endTime);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndTime(int addr, int v) {
        if (featOkTst && casFeat_endTime == null)
      jcas.throwFeatMissing("endTime", "org.hucompute.publichistory.datastore.typesystem.Event");
    ll_cas.ll_setRefValue(addr, casFeatCode_endTime, v);}
    
  
 
  /** @generated */
  final Feature casFeat_propositions;
  /** @generated */
  final int     casFeatCode_propositions;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPropositions(int addr) {
        if (featOkTst && casFeat_propositions == null)
      jcas.throwFeatMissing("propositions", "org.hucompute.publichistory.datastore.typesystem.Event");
    return ll_cas.ll_getRefValue(addr, casFeatCode_propositions);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPropositions(int addr, int v) {
        if (featOkTst && casFeat_propositions == null)
      jcas.throwFeatMissing("propositions", "org.hucompute.publichistory.datastore.typesystem.Event");
    ll_cas.ll_setRefValue(addr, casFeatCode_propositions, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getPropositions(int addr, int i) {
        if (featOkTst && casFeat_propositions == null)
      jcas.throwFeatMissing("propositions", "org.hucompute.publichistory.datastore.typesystem.Event");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_propositions), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_propositions), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_propositions), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setPropositions(int addr, int i, int v) {
        if (featOkTst && casFeat_propositions == null)
      jcas.throwFeatMissing("propositions", "org.hucompute.publichistory.datastore.typesystem.Event");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_propositions), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_propositions), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_propositions), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Event_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_startsWith = jcas.getRequiredFeatureDE(casType, "startsWith", "uima.cas.FSArray", featOkTst);
    casFeatCode_startsWith  = (null == casFeat_startsWith) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startsWith).getCode();

 
    casFeat_endsWith = jcas.getRequiredFeatureDE(casType, "endsWith", "uima.cas.FSArray", featOkTst);
    casFeatCode_endsWith  = (null == casFeat_endsWith) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endsWith).getCode();

 
    casFeat_startTime = jcas.getRequiredFeatureDE(casType, "startTime", "org.hucompute.publichistory.datastore.typesystem.Time", featOkTst);
    casFeatCode_startTime  = (null == casFeat_startTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startTime).getCode();

 
    casFeat_endTime = jcas.getRequiredFeatureDE(casType, "endTime", "org.hucompute.publichistory.datastore.typesystem.Time", featOkTst);
    casFeatCode_endTime  = (null == casFeat_endTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endTime).getCode();

 
    casFeat_propositions = jcas.getRequiredFeatureDE(casType, "propositions", "uima.cas.FSArray", featOkTst);
    casFeatCode_propositions  = (null == casFeat_propositions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_propositions).getCode();

  }
}



    