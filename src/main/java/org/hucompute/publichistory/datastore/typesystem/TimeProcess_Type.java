
/* First created by JCasGen Tue Jan 25 16:26:50 CET 2022 */
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
public class TimeProcess_Type extends Time_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TimeProcess.typeIndexID;
    /** @generated
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.TimeProcess");

  /** @generated */
  final Feature casFeat_endDate;
  /** @generated */
  final int     casFeatCode_endDate;

    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public TimeProcess_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_endDate = jcas.getRequiredFeatureDE(casType, "endDate", "uima.cas.String", featOkTst);
        casFeatCode_endDate = (null == casFeat_endDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_endDate).getCode();

    }
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value
   */
  public String getEndDate(int addr) {
        if (featOkTst && casFeat_endDate == null)
      jcas.throwFeatMissing("endDate", "org.hucompute.publichistory.datastore.typesystem.TimeProcess");
    return ll_cas.ll_getStringValue(addr, casFeatCode_endDate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set
   */
  public void setEndDate(int addr, String v) {
        if (featOkTst && casFeat_endDate == null)
      jcas.throwFeatMissing("endDate", "org.hucompute.publichistory.datastore.typesystem.TimeProcess");
    ll_cas.ll_setStringValue(addr, casFeatCode_endDate, v);}


}



