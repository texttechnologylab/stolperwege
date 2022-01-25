
/* First created by JCasGen Tue Jan 25 16:35:20 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jan 25 16:35:24 CET 2022
 * @generated */
public class Photogrammetrie_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Photogrammetrie.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Photogrammetrie");
 
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
      jcas.throwFeatMissing("model", "org.hucompute.publichistory.datastore.typesystem.Photogrammetrie");
    return ll_cas.ll_getStringValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, String v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.hucompute.publichistory.datastore.typesystem.Photogrammetrie");
    ll_cas.ll_setStringValue(addr, casFeatCode_model, v);}
    
  
 
  /** @generated */
  final Feature casFeat_materials;
  /** @generated */
  final int     casFeatCode_materials;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMaterials(int addr) {
        if (featOkTst && casFeat_materials == null)
      jcas.throwFeatMissing("materials", "org.hucompute.publichistory.datastore.typesystem.Photogrammetrie");
    return ll_cas.ll_getStringValue(addr, casFeatCode_materials);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMaterials(int addr, String v) {
        if (featOkTst && casFeat_materials == null)
      jcas.throwFeatMissing("materials", "org.hucompute.publichistory.datastore.typesystem.Photogrammetrie");
    ll_cas.ll_setStringValue(addr, casFeatCode_materials, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Photogrammetrie_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "uima.cas.String", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

 
    casFeat_materials = jcas.getRequiredFeatureDE(casType, "materials", "uima.cas.String", featOkTst);
    casFeatCode_materials  = (null == casFeat_materials) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_materials).getCode();

  }
}



    