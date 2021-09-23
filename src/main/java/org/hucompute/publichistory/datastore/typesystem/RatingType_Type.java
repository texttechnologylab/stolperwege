
/* First created by JCasGen Thu Sep 23 08:58:16 CEST 2021 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Thu Sep 23 09:36:56 CEST 2021
 * @generated */
public class RatingType_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = RatingType.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.RatingType");
 
  /** @generated */
  final Feature casFeat_key;
  /** @generated */
  final int     casFeatCode_key;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getKey(int addr) {
        if (featOkTst && casFeat_key == null)
      jcas.throwFeatMissing("key", "org.hucompute.publichistory.datastore.typesystem.RatingType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_key);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setKey(int addr, String v) {
        if (featOkTst && casFeat_key == null)
      jcas.throwFeatMissing("key", "org.hucompute.publichistory.datastore.typesystem.RatingType");
    ll_cas.ll_setStringValue(addr, casFeatCode_key, v);}
    
  
 
  /** @generated */
  final Feature casFeat_range;
  /** @generated */
  final int     casFeatCode_range;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRange(int addr) {
        if (featOkTst && casFeat_range == null)
      jcas.throwFeatMissing("range", "org.hucompute.publichistory.datastore.typesystem.RatingType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_range);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRange(int addr, String v) {
        if (featOkTst && casFeat_range == null)
      jcas.throwFeatMissing("range", "org.hucompute.publichistory.datastore.typesystem.RatingType");
    ll_cas.ll_setStringValue(addr, casFeatCode_range, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public RatingType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_key = jcas.getRequiredFeatureDE(casType, "key", "uima.cas.String", featOkTst);
    casFeatCode_key  = (null == casFeat_key) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_key).getCode();

 
    casFeat_range = jcas.getRequiredFeatureDE(casType, "range", "uima.cas.String", featOkTst);
    casFeatCode_range  = (null == casFeat_range) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_range).getCode();

  }
}



    