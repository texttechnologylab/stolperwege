
/* First created by JCasGen Tue Jan 25 16:35:56 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Jan 25 16:35:59 CET 2022
 * @generated */
public class RelationType_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = RelationType.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.RelationType");
 
  /** @generated */
  final Feature casFeat_RangeFrom;
  /** @generated */
  final int     casFeatCode_RangeFrom;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRangeFrom(int addr) {
        if (featOkTst && casFeat_RangeFrom == null)
      jcas.throwFeatMissing("RangeFrom", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_RangeFrom);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRangeFrom(int addr, String v) {
        if (featOkTst && casFeat_RangeFrom == null)
      jcas.throwFeatMissing("RangeFrom", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_RangeFrom, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Name;
  /** @generated */
  final int     casFeatCode_Name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_Name == null)
      jcas.throwFeatMissing("Name", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_Name == null)
      jcas.throwFeatMissing("Name", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_Name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_RangeTo;
  /** @generated */
  final int     casFeatCode_RangeTo;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRangeTo(int addr) {
        if (featOkTst && casFeat_RangeTo == null)
      jcas.throwFeatMissing("RangeTo", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_RangeTo);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRangeTo(int addr, String v) {
        if (featOkTst && casFeat_RangeTo == null)
      jcas.throwFeatMissing("RangeTo", "org.hucompute.publichistory.datastore.typesystem.RelationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_RangeTo, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public RelationType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_RangeFrom = jcas.getRequiredFeatureDE(casType, "RangeFrom", "uima.cas.String", featOkTst);
    casFeatCode_RangeFrom  = (null == casFeat_RangeFrom) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_RangeFrom).getCode();

 
    casFeat_Name = jcas.getRequiredFeatureDE(casType, "Name", "uima.cas.String", featOkTst);
    casFeatCode_Name  = (null == casFeat_Name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Name).getCode();

 
    casFeat_RangeTo = jcas.getRequiredFeatureDE(casType, "RangeTo", "uima.cas.String", featOkTst);
    casFeatCode_RangeTo  = (null == casFeat_RangeTo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_RangeTo).getCode();

  }
}



    