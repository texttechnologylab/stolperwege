
/* First created by JCasGen Tue Jan 25 16:35:52 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jan 25 16:35:52 CET 2022
 * @generated */
public class Rating_Type extends UnityPosition_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Rating.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Rating");
 
  /** @generated */
  final Feature casFeat_scale;
  /** @generated */
  final int     casFeatCode_scale;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getScale(int addr) {
        if (featOkTst && casFeat_scale == null)
      jcas.throwFeatMissing("scale", "org.hucompute.publichistory.datastore.typesystem.Rating");
    return ll_cas.ll_getStringValue(addr, casFeatCode_scale);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScale(int addr, String v) {
        if (featOkTst && casFeat_scale == null)
      jcas.throwFeatMissing("scale", "org.hucompute.publichistory.datastore.typesystem.Rating");
    ll_cas.ll_setStringValue(addr, casFeatCode_scale, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ratingType;
  /** @generated */
  final int     casFeatCode_ratingType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRatingType(int addr) {
        if (featOkTst && casFeat_ratingType == null)
      jcas.throwFeatMissing("ratingType", "org.hucompute.publichistory.datastore.typesystem.Rating");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ratingType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRatingType(int addr, int v) {
        if (featOkTst && casFeat_ratingType == null)
      jcas.throwFeatMissing("ratingType", "org.hucompute.publichistory.datastore.typesystem.Rating");
    ll_cas.ll_setRefValue(addr, casFeatCode_ratingType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ratingValue;
  /** @generated */
  final int     casFeatCode_ratingValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRatingValue(int addr) {
        if (featOkTst && casFeat_ratingValue == null)
      jcas.throwFeatMissing("ratingValue", "org.hucompute.publichistory.datastore.typesystem.Rating");
    return ll_cas.ll_getIntValue(addr, casFeatCode_ratingValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRatingValue(int addr, int v) {
        if (featOkTst && casFeat_ratingValue == null)
      jcas.throwFeatMissing("ratingValue", "org.hucompute.publichistory.datastore.typesystem.Rating");
    ll_cas.ll_setIntValue(addr, casFeatCode_ratingValue, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Rating_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_scale = jcas.getRequiredFeatureDE(casType, "scale", "uima.cas.String", featOkTst);
    casFeatCode_scale  = (null == casFeat_scale) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scale).getCode();

 
    casFeat_ratingType = jcas.getRequiredFeatureDE(casType, "ratingType", "org.hucompute.publichistory.datastore.typesystem.RatingType", featOkTst);
    casFeatCode_ratingType  = (null == casFeat_ratingType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ratingType).getCode();

 
    casFeat_ratingValue = jcas.getRequiredFeatureDE(casType, "ratingValue", "uima.cas.Integer", featOkTst);
    casFeatCode_ratingValue  = (null == casFeat_ratingValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ratingValue).getCode();

  }
}



    