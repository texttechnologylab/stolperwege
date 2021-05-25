
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
public class Proposition_Type extends StolperwegeElement_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Proposition.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Proposition");
 
  /** @generated */
  final Feature casFeat_events;
  /** @generated */
  final int     casFeatCode_events;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEvents(int addr) {
        if (featOkTst && casFeat_events == null)
      jcas.throwFeatMissing("events", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    return ll_cas.ll_getRefValue(addr, casFeatCode_events);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEvents(int addr, int v) {
        if (featOkTst && casFeat_events == null)
      jcas.throwFeatMissing("events", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    ll_cas.ll_setRefValue(addr, casFeatCode_events, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getEvents(int addr, int i) {
        if (featOkTst && casFeat_events == null)
      jcas.throwFeatMissing("events", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_events), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_events), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_events), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setEvents(int addr, int i, int v) {
        if (featOkTst && casFeat_events == null)
      jcas.throwFeatMissing("events", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_events), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_events), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_events), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_termconnectors;
  /** @generated */
  final int     casFeatCode_termconnectors;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTermconnectors(int addr) {
        if (featOkTst && casFeat_termconnectors == null)
      jcas.throwFeatMissing("termconnectors", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    return ll_cas.ll_getRefValue(addr, casFeatCode_termconnectors);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTermconnectors(int addr, int v) {
        if (featOkTst && casFeat_termconnectors == null)
      jcas.throwFeatMissing("termconnectors", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    ll_cas.ll_setRefValue(addr, casFeatCode_termconnectors, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getTermconnectors(int addr, int i) {
        if (featOkTst && casFeat_termconnectors == null)
      jcas.throwFeatMissing("termconnectors", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_termconnectors), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_termconnectors), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_termconnectors), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setTermconnectors(int addr, int i, int v) {
        if (featOkTst && casFeat_termconnectors == null)
      jcas.throwFeatMissing("termconnectors", "org.hucompute.publichistory.datastore.typesystem.Proposition");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_termconnectors), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_termconnectors), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_termconnectors), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Proposition_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_events = jcas.getRequiredFeatureDE(casType, "events", "uima.cas.FSArray", featOkTst);
    casFeatCode_events  = (null == casFeat_events) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_events).getCode();

 
    casFeat_termconnectors = jcas.getRequiredFeatureDE(casType, "termconnectors", "uima.cas.FSArray", featOkTst);
    casFeatCode_termconnectors  = (null == casFeat_termconnectors) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_termconnectors).getCode();

  }
}



    