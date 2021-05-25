
/* First created by JCasGen Tue Jul 09 12:16:21 CEST 2019 */
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
public class UnityBuilding_Type extends UnityObject_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UnityBuilding.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
 
  /** @generated */
  final Feature casFeat_prefab;
  /** @generated */
  final int     casFeatCode_prefab;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPrefab(int addr) {
        if (featOkTst && casFeat_prefab == null)
      jcas.throwFeatMissing("prefab", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    return ll_cas.ll_getStringValue(addr, casFeatCode_prefab);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrefab(int addr, String v) {
        if (featOkTst && casFeat_prefab == null)
      jcas.throwFeatMissing("prefab", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    ll_cas.ll_setStringValue(addr, casFeatCode_prefab, v);}
    
  
 
  /** @generated */
  final Feature casFeat_angle;
  /** @generated */
  final int     casFeatCode_angle;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAngle(int addr) {
        if (featOkTst && casFeat_angle == null)
      jcas.throwFeatMissing("angle", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    return ll_cas.ll_getIntValue(addr, casFeatCode_angle);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAngle(int addr, int v) {
        if (featOkTst && casFeat_angle == null)
      jcas.throwFeatMissing("angle", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    ll_cas.ll_setIntValue(addr, casFeatCode_angle, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scene;
  /** @generated */
  final int     casFeatCode_scene;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getScene(int addr) {
        if (featOkTst && casFeat_scene == null)
      jcas.throwFeatMissing("scene", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    return ll_cas.ll_getStringValue(addr, casFeatCode_scene);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScene(int addr, String v) {
        if (featOkTst && casFeat_scene == null)
      jcas.throwFeatMissing("scene", "org.hucompute.publichistory.datastore.typesystem.UnityBuilding");
    ll_cas.ll_setStringValue(addr, casFeatCode_scene, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public UnityBuilding_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_prefab = jcas.getRequiredFeatureDE(casType, "prefab", "uima.cas.String", featOkTst);
    casFeatCode_prefab  = (null == casFeat_prefab) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_prefab).getCode();

 
    casFeat_angle = jcas.getRequiredFeatureDE(casType, "angle", "uima.cas.Integer", featOkTst);
    casFeatCode_angle  = (null == casFeat_angle) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_angle).getCode();

 
    casFeat_scene = jcas.getRequiredFeatureDE(casType, "scene", "uima.cas.String", featOkTst);
    casFeatCode_scene  = (null == casFeat_scene) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scene).getCode();

  }
}



    