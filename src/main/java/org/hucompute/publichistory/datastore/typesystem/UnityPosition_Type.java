
/* First created by JCasGen Tue Jul 09 12:16:34 CEST 2019 */
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
public class UnityPosition_Type extends Position_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UnityPosition.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.UnityPosition");
 
  /** @generated */
  final Feature casFeat_posvector3;
  /** @generated */
  final int     casFeatCode_posvector3;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPosvector3(int addr) {
        if (featOkTst && casFeat_posvector3 == null)
      jcas.throwFeatMissing("posvector3", "org.hucompute.publichistory.datastore.typesystem.UnityPosition");
    return ll_cas.ll_getStringValue(addr, casFeatCode_posvector3);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPosvector3(int addr, String v) {
        if (featOkTst && casFeat_posvector3 == null)
      jcas.throwFeatMissing("posvector3", "org.hucompute.publichistory.datastore.typesystem.UnityPosition");
    ll_cas.ll_setStringValue(addr, casFeatCode_posvector3, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rotation;
  /** @generated */
  final int     casFeatCode_rotation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRotation(int addr) {
        if (featOkTst && casFeat_rotation == null)
      jcas.throwFeatMissing("rotation", "org.hucompute.publichistory.datastore.typesystem.UnityPosition");
    return ll_cas.ll_getStringValue(addr, casFeatCode_rotation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRotation(int addr, String v) {
        if (featOkTst && casFeat_rotation == null)
      jcas.throwFeatMissing("rotation", "org.hucompute.publichistory.datastore.typesystem.UnityPosition");
    ll_cas.ll_setStringValue(addr, casFeatCode_rotation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public UnityPosition_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_posvector3 = jcas.getRequiredFeatureDE(casType, "posvector3", "uima.cas.String", featOkTst);
    casFeatCode_posvector3  = (null == casFeat_posvector3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_posvector3).getCode();

 
    casFeat_rotation = jcas.getRequiredFeatureDE(casType, "rotation", "uima.cas.String", featOkTst);
    casFeatCode_rotation  = (null == casFeat_rotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rotation).getCode();

  }
}



    