
/* First created by JCasGen Tue Jan 25 16:26:01 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

/**
 * Updated by JCasGen Tue Mar 08 09:10:00 CET 2022
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

    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public DiscourseReferent_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_equivalent = jcas.getRequiredFeatureDE(casType, "equivalent", "uima.cas.FSArray", featOkTst);
        casFeatCode_equivalent = (null == casFeat_equivalent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_equivalent).getCode();

    }
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


}



