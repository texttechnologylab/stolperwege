
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
public class Quiz_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Quiz.typeIndexID;
    /** @generated
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Quiz");

  /** @generated */
  final Feature casFeat_answers;
  /** @generated */
  final int     casFeatCode_answers;
    /**
     * @generated
     */
    final Feature casFeat_correct;
    /**
     * @generated
     */
    final int casFeatCode_correct;

    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Quiz_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_answers = jcas.getRequiredFeatureDE(casType, "answers", "uima.cas.FSArray", featOkTst);
        casFeatCode_answers = (null == casFeat_answers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_answers).getCode();


        casFeat_correct = jcas.getRequiredFeatureDE(casType, "correct", "org.hucompute.publichistory.datastore.typesystem.Text", featOkTst);
        casFeatCode_correct = (null == casFeat_correct) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_correct).getCode();

    }

  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value
   */
  public int getAnswers(int addr) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answers);
  }

  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set
   */
  public void setAnswers(int addr, int v) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    ll_cas.ll_setRefValue(addr, casFeatCode_answers, v);}

   /** @generated
   * @param addr low level Feature Structure reference
    * @param i index of item in the array
    * @return value at index i in the array
   */
  public int getAnswers(int addr, int i) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i);
  }

  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */
  public void setAnswers(int addr, int i, int v) {
        if (featOkTst && casFeat_answers == null)
      jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_answers), i, v);
  }

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getCorrect(int addr) {
        if (featOkTst && casFeat_correct == null)
            jcas.throwFeatMissing("correct", "org.hucompute.publichistory.datastore.typesystem.Quiz");
        return ll_cas.ll_getRefValue(addr, casFeatCode_correct);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setCorrect(int addr, int v) {
        if (featOkTst && casFeat_correct == null)
            jcas.throwFeatMissing("correct", "org.hucompute.publichistory.datastore.typesystem.Quiz");
        ll_cas.ll_setRefValue(addr, casFeatCode_correct, v);}
}



