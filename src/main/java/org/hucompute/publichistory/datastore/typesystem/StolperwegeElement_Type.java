
/* First created by JCasGen Tue Jan 25 16:26:01 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation_Type;

/**
 * Updated by JCasGen Mon Apr 04 13:45:28 CEST 2022
 * @generated */
public class StolperwegeElement_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = StolperwegeElement.typeIndexID;
    /** @generated
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.StolperwegeElement");

  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;

    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public StolperwegeElement_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
        casFeatCode_value = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_value).getCode();


        casFeat_description = jcas.getRequiredFeatureDE(casType, "description", "uima.cas.String", featOkTst);
        casFeatCode_description = (null == casFeat_description) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_description).getCode();

    }
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value
   */
  public String getValue(int addr) {
      if (featOkTst && casFeat_value == null)
          jcas.throwFeatMissing("value", "org.hucompute.publichistory.datastore.typesystem.StolperwegeElement");
      return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
    /**
     * @generated
     */
    final Feature casFeat_description;
    /**
     * @generated
     */
    final int     casFeatCode_description;

  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set
   */
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.hucompute.publichistory.datastore.typesystem.StolperwegeElement");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}


    /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value
   */
  public String getDescription(int addr) {
        if (featOkTst && casFeat_description == null)
      jcas.throwFeatMissing("description", "org.hucompute.publichistory.datastore.typesystem.StolperwegeElement");
    return ll_cas.ll_getStringValue(addr, casFeatCode_description);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set
   */
  public void setDescription(int addr, String v) {
        if (featOkTst && casFeat_description == null)
      jcas.throwFeatMissing("description", "org.hucompute.publichistory.datastore.typesystem.StolperwegeElement");
    ll_cas.ll_setStringValue(addr, casFeatCode_description, v);}


}



