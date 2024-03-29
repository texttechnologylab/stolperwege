
/* First created by JCasGen Tue Jan 25 16:26:01 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

/**
 * Updated by JCasGen Tue Mar 08 13:41:17 CET 2022
 * @generated */
public class Preference_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Preference.typeIndexID;
    /** @generated
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Preference");

  /** @generated */
  final Feature casFeat_key;
  /** @generated */
  final int     casFeatCode_key;

    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Preference_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_key = jcas.getRequiredFeatureDE(casType, "key", "uima.cas.String", featOkTst);
        casFeatCode_key = (null == casFeat_key) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_key).getCode();


        casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
        casFeatCode_value = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_value).getCode();

    }

  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value
   */
  public String getKey(int addr) {
      if (featOkTst && casFeat_key == null)
          jcas.throwFeatMissing("key", "org.hucompute.publichistory.datastore.typesystem.Preference");
      return ll_cas.ll_getStringValue(addr, casFeatCode_key);
  }


    /**
     * @generated
     */
    final Feature casFeat_value;
    /**
     * @generated
     */
    final int     casFeatCode_value;

  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set
   */
  public void setKey(int addr, String v) {
        if (featOkTst && casFeat_key == null)
      jcas.throwFeatMissing("key", "org.hucompute.publichistory.datastore.typesystem.Preference");
    ll_cas.ll_setStringValue(addr, casFeatCode_key, v);}

  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value
   */
  public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.hucompute.publichistory.datastore.typesystem.Preference");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }

  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set
   */
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.hucompute.publichistory.datastore.typesystem.Preference");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
}



