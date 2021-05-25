
/* First created by JCasGen Tue Jul 09 12:14:00 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue May 11 17:35:23 CEST 2021
 * @generated */
public class DiscourseReferent_Type extends Argument_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DiscourseReferent.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.DiscourseReferent");
 
  /** @generated */
  final Feature casFeat_equivalent;
  /** @generated */
  final int     casFeatCode_equivalent;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEquivalent(int addr) {
        if (featOkTst && casFeat_equivalent == null)
      jcas.throwFeatMissing("equivalent", "org.hucompute.publichistory.datastore.typesystem.DiscourseReferent");
    return ll_cas.ll_getRefValue(addr, casFeatCode_equivalent);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEquivalent(int addr, int v) {
        if (featOkTst && casFeat_equivalent == null)
      jcas.throwFeatMissing("equivalent", "org.hucompute.publichistory.datastore.typesystem.DiscourseReferent");
    ll_cas.ll_setRefValue(addr, casFeatCode_equivalent, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getEquivalent(int addr, int i) {
        if (featOkTst && casFeat_equivalent == null)
      jcas.throwFeatMissing("equivalent", "org.hucompute.publichistory.datastore.typesystem.DiscourseReferent");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_equivalent), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_equivalent), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_equivalent), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setEquivalent(int addr, int i, int v) {
        if (featOkTst && casFeat_equivalent == null)
      jcas.throwFeatMissing("equivalent", "org.hucompute.publichistory.datastore.typesystem.DiscourseReferent");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_equivalent), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_equivalent), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_equivalent), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DiscourseReferent_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_equivalent = jcas.getRequiredFeatureDE(casType, "equivalent", "uima.cas.FSArray", featOkTst);
    casFeatCode_equivalent  = (null == casFeat_equivalent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_equivalent).getCode();

  }
}



    