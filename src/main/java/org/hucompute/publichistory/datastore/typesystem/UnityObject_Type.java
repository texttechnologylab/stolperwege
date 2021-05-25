
/* First created by JCasGen Tue Jul 09 12:14:39 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jul 09 12:16:21 CEST 2019
 * @generated */
public class UnityObject_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UnityObject.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.UnityObject");
 
  /** @generated */
  final Feature casFeat_version;
  /** @generated */
  final int     casFeatCode_version;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getVersion(int addr) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_version);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVersion(int addr, float v) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    ll_cas.ll_setFloatValue(addr, casFeatCode_version, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scale;
  /** @generated */
  final int     casFeatCode_scale;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getScale(int addr) {
        if (featOkTst && casFeat_scale == null)
      jcas.throwFeatMissing("scale", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_scale);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScale(int addr, float v) {
        if (featOkTst && casFeat_scale == null)
      jcas.throwFeatMissing("scale", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    ll_cas.ll_setFloatValue(addr, casFeatCode_scale, v);}
    
  
 
  /** @generated */
  final Feature casFeat_model;
  /** @generated */
  final int     casFeatCode_model;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModel(int addr) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    return ll_cas.ll_getStringValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, String v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    ll_cas.ll_setStringValue(addr, casFeatCode_model, v);}
    
  
 
  /** @generated */
  final Feature casFeat_preview;
  /** @generated */
  final int     casFeatCode_preview;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPreview(int addr) {
        if (featOkTst && casFeat_preview == null)
      jcas.throwFeatMissing("preview", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    return ll_cas.ll_getStringValue(addr, casFeatCode_preview);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPreview(int addr, String v) {
        if (featOkTst && casFeat_preview == null)
      jcas.throwFeatMissing("preview", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    ll_cas.ll_setStringValue(addr, casFeatCode_preview, v);}
    
  
 
  /** @generated */
  final Feature casFeat_children;
  /** @generated */
  final int     casFeatCode_children;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getChildren(int addr) {
        if (featOkTst && casFeat_children == null)
      jcas.throwFeatMissing("children", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    return ll_cas.ll_getRefValue(addr, casFeatCode_children);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setChildren(int addr, int v) {
        if (featOkTst && casFeat_children == null)
      jcas.throwFeatMissing("children", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    ll_cas.ll_setRefValue(addr, casFeatCode_children, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getChildren(int addr, int i) {
        if (featOkTst && casFeat_children == null)
      jcas.throwFeatMissing("children", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_children), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_children), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_children), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setChildren(int addr, int i, int v) {
        if (featOkTst && casFeat_children == null)
      jcas.throwFeatMissing("children", "org.hucompute.publichistory.datastore.typesystem.UnityObject");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_children), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_children), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_children), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public UnityObject_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_version = jcas.getRequiredFeatureDE(casType, "version", "uima.cas.Float", featOkTst);
    casFeatCode_version  = (null == casFeat_version) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_version).getCode();

 
    casFeat_scale = jcas.getRequiredFeatureDE(casType, "scale", "uima.cas.Float", featOkTst);
    casFeatCode_scale  = (null == casFeat_scale) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scale).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "uima.cas.String", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

 
    casFeat_preview = jcas.getRequiredFeatureDE(casType, "preview", "uima.cas.String", featOkTst);
    casFeatCode_preview  = (null == casFeat_preview) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_preview).getCode();

 
    casFeat_children = jcas.getRequiredFeatureDE(casType, "children", "uima.cas.FSArray", featOkTst);
    casFeatCode_children  = (null == casFeat_children) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_children).getCode();

  }
}



    