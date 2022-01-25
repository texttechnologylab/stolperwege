
/* First created by JCasGen Tue Jan 25 16:36:10 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jan 25 16:36:10 CET 2022
 * @generated */
public class StolperwegeSet_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = StolperwegeSet.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.StolperwegeSet");
 
  /** @generated */
  final Feature casFeat_contains;
  /** @generated */
  final int     casFeatCode_contains;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getContains(int addr) {
        if (featOkTst && casFeat_contains == null)
      jcas.throwFeatMissing("contains", "org.hucompute.publichistory.datastore.typesystem.StolperwegeSet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_contains);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContains(int addr, int v) {
        if (featOkTst && casFeat_contains == null)
      jcas.throwFeatMissing("contains", "org.hucompute.publichistory.datastore.typesystem.StolperwegeSet");
    ll_cas.ll_setRefValue(addr, casFeatCode_contains, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getContains(int addr, int i) {
        if (featOkTst && casFeat_contains == null)
      jcas.throwFeatMissing("contains", "org.hucompute.publichistory.datastore.typesystem.StolperwegeSet");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contains), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_contains), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contains), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setContains(int addr, int i, int v) {
        if (featOkTst && casFeat_contains == null)
      jcas.throwFeatMissing("contains", "org.hucompute.publichistory.datastore.typesystem.StolperwegeSet");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contains), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_contains), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contains), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public StolperwegeSet_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_contains = jcas.getRequiredFeatureDE(casType, "contains", "uima.cas.FSArray", featOkTst);
    casFeatCode_contains  = (null == casFeat_contains) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contains).getCode();

  }
}



    