
/* First created by JCasGen Tue Jul 09 12:18:06 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jul 09 12:18:06 CEST 2019
 * @generated */
public class Visualization_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Visualization.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Visualization");
 
  /** @generated */
  final Feature casFeat_unityObjectIdentifier;
  /** @generated */
  final int     casFeatCode_unityObjectIdentifier;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUnityObjectIdentifier(int addr) {
        if (featOkTst && casFeat_unityObjectIdentifier == null)
      jcas.throwFeatMissing("unityObjectIdentifier", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    return ll_cas.ll_getStringValue(addr, casFeatCode_unityObjectIdentifier);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUnityObjectIdentifier(int addr, String v) {
        if (featOkTst && casFeat_unityObjectIdentifier == null)
      jcas.throwFeatMissing("unityObjectIdentifier", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    ll_cas.ll_setStringValue(addr, casFeatCode_unityObjectIdentifier, v);}
    
  
 
  /** @generated */
  final Feature casFeat_requiredAnnotations;
  /** @generated */
  final int     casFeatCode_requiredAnnotations;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRequiredAnnotations(int addr) {
        if (featOkTst && casFeat_requiredAnnotations == null)
      jcas.throwFeatMissing("requiredAnnotations", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    return ll_cas.ll_getRefValue(addr, casFeatCode_requiredAnnotations);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRequiredAnnotations(int addr, int v) {
        if (featOkTst && casFeat_requiredAnnotations == null)
      jcas.throwFeatMissing("requiredAnnotations", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    ll_cas.ll_setRefValue(addr, casFeatCode_requiredAnnotations, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getRequiredAnnotations(int addr, int i) {
        if (featOkTst && casFeat_requiredAnnotations == null)
      jcas.throwFeatMissing("requiredAnnotations", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_requiredAnnotations), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_requiredAnnotations), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_requiredAnnotations), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setRequiredAnnotations(int addr, int i, String v) {
        if (featOkTst && casFeat_requiredAnnotations == null)
      jcas.throwFeatMissing("requiredAnnotations", "org.hucompute.publichistory.datastore.typesystem.Visualization");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_requiredAnnotations), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_requiredAnnotations), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_requiredAnnotations), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Visualization_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_unityObjectIdentifier = jcas.getRequiredFeatureDE(casType, "unityObjectIdentifier", "uima.cas.String", featOkTst);
    casFeatCode_unityObjectIdentifier  = (null == casFeat_unityObjectIdentifier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unityObjectIdentifier).getCode();

 
    casFeat_requiredAnnotations = jcas.getRequiredFeatureDE(casType, "requiredAnnotations", "uima.cas.StringArray", featOkTst);
    casFeatCode_requiredAnnotations  = (null == casFeat_requiredAnnotations) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_requiredAnnotations).getCode();

  }
}



    