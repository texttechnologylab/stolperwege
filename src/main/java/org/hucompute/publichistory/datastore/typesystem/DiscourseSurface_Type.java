
/* First created by JCasGen Tue Jan 25 16:26:46 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jan 25 16:26:46 CET 2022
 * @generated */
public class DiscourseSurface_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DiscourseSurface.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
 
  /** @generated */
  final Feature casFeat_vertices;
  /** @generated */
  final int     casFeatCode_vertices;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getVertices(int addr) {
        if (featOkTst && casFeat_vertices == null)
      jcas.throwFeatMissing("vertices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    return ll_cas.ll_getRefValue(addr, casFeatCode_vertices);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVertices(int addr, int v) {
        if (featOkTst && casFeat_vertices == null)
      jcas.throwFeatMissing("vertices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    ll_cas.ll_setRefValue(addr, casFeatCode_vertices, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getVertices(int addr, int i) {
        if (featOkTst && casFeat_vertices == null)
      jcas.throwFeatMissing("vertices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vertices), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_vertices), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vertices), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setVertices(int addr, int i, String v) {
        if (featOkTst && casFeat_vertices == null)
      jcas.throwFeatMissing("vertices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vertices), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_vertices), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vertices), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_indices;
  /** @generated */
  final int     casFeatCode_indices;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getIndices(int addr) {
        if (featOkTst && casFeat_indices == null)
      jcas.throwFeatMissing("indices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    return ll_cas.ll_getRefValue(addr, casFeatCode_indices);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIndices(int addr, int v) {
        if (featOkTst && casFeat_indices == null)
      jcas.throwFeatMissing("indices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    ll_cas.ll_setRefValue(addr, casFeatCode_indices, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getIndices(int addr, int i) {
        if (featOkTst && casFeat_indices == null)
      jcas.throwFeatMissing("indices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indices), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_indices), i);
	return ll_cas.ll_getIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indices), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setIndices(int addr, int i, int v) {
        if (featOkTst && casFeat_indices == null)
      jcas.throwFeatMissing("indices", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    if (lowLevelTypeChecks)
      ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indices), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_indices), i);
    ll_cas.ll_setIntArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indices), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_uv;
  /** @generated */
  final int     casFeatCode_uv;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUv(int addr) {
        if (featOkTst && casFeat_uv == null)
      jcas.throwFeatMissing("uv", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    return ll_cas.ll_getStringValue(addr, casFeatCode_uv);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUv(int addr, String v) {
        if (featOkTst && casFeat_uv == null)
      jcas.throwFeatMissing("uv", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    ll_cas.ll_setStringValue(addr, casFeatCode_uv, v);}
    
  
 
  /** @generated */
  final Feature casFeat_normal;
  /** @generated */
  final int     casFeatCode_normal;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getNormal(int addr) {
        if (featOkTst && casFeat_normal == null)
      jcas.throwFeatMissing("normal", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    return ll_cas.ll_getStringValue(addr, casFeatCode_normal);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNormal(int addr, String v) {
        if (featOkTst && casFeat_normal == null)
      jcas.throwFeatMissing("normal", "org.hucompute.publichistory.datastore.typesystem.DiscourseSurface");
    ll_cas.ll_setStringValue(addr, casFeatCode_normal, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DiscourseSurface_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_vertices = jcas.getRequiredFeatureDE(casType, "vertices", "uima.cas.StringArray", featOkTst);
    casFeatCode_vertices  = (null == casFeat_vertices) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_vertices).getCode();

 
    casFeat_indices = jcas.getRequiredFeatureDE(casType, "indices", "uima.cas.IntegerArray", featOkTst);
    casFeatCode_indices  = (null == casFeat_indices) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_indices).getCode();

 
    casFeat_uv = jcas.getRequiredFeatureDE(casType, "uv", "uima.cas.String", featOkTst);
    casFeatCode_uv  = (null == casFeat_uv) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uv).getCode();

 
    casFeat_normal = jcas.getRequiredFeatureDE(casType, "normal", "uima.cas.String", featOkTst);
    casFeatCode_normal  = (null == casFeat_normal) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_normal).getCode();

  }
}



    