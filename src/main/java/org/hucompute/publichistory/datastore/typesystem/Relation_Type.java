
/* First created by JCasGen Wed Jul 10 14:30:32 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Jul 10 14:31:07 CEST 2019
 * @generated */
public class Relation_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Relation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Relation");
 
  /** @generated */
  final Feature casFeat_Start;
  /** @generated */
  final int     casFeatCode_Start;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStart(int addr) {
        if (featOkTst && casFeat_Start == null)
      jcas.throwFeatMissing("Start", "org.hucompute.publichistory.datastore.typesystem.Relation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Start);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStart(int addr, int v) {
        if (featOkTst && casFeat_Start == null)
      jcas.throwFeatMissing("Start", "org.hucompute.publichistory.datastore.typesystem.Relation");
    ll_cas.ll_setRefValue(addr, casFeatCode_Start, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Target;
  /** @generated */
  final int     casFeatCode_Target;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTarget(int addr) {
        if (featOkTst && casFeat_Target == null)
      jcas.throwFeatMissing("Target", "org.hucompute.publichistory.datastore.typesystem.Relation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Target);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTarget(int addr, int v) {
        if (featOkTst && casFeat_Target == null)
      jcas.throwFeatMissing("Target", "org.hucompute.publichistory.datastore.typesystem.Relation");
    ll_cas.ll_setRefValue(addr, casFeatCode_Target, v);}
    
  
 
  /** @generated */
  final Feature casFeat_RType;
  /** @generated */
  final int     casFeatCode_RType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRType(int addr) {
        if (featOkTst && casFeat_RType == null)
      jcas.throwFeatMissing("RType", "org.hucompute.publichistory.datastore.typesystem.Relation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_RType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRType(int addr, int v) {
        if (featOkTst && casFeat_RType == null)
      jcas.throwFeatMissing("RType", "org.hucompute.publichistory.datastore.typesystem.Relation");
    ll_cas.ll_setRefValue(addr, casFeatCode_RType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Relation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Start = jcas.getRequiredFeatureDE(casType, "Start", "org.hucompute.publichistory.datastore.typesystem.StolperwegeElement", featOkTst);
    casFeatCode_Start  = (null == casFeat_Start) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Start).getCode();

 
    casFeat_Target = jcas.getRequiredFeatureDE(casType, "Target", "org.hucompute.publichistory.datastore.typesystem.StolperwegeElement", featOkTst);
    casFeatCode_Target  = (null == casFeat_Target) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Target).getCode();

 
    casFeat_RType = jcas.getRequiredFeatureDE(casType, "RType", "org.hucompute.publichistory.datastore.typesystem.RelationType", featOkTst);
    casFeatCode_RType  = (null == casFeat_RType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_RType).getCode();

  }
}



    