
/* First created by JCasGen Tue Jul 09 12:17:00 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jul 09 12:17:00 CEST 2019
 * @generated */
public class Tour_Type extends UnityPosition_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Tour.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Tour");
 
  /** @generated */
  final Feature casFeat_previous;
  /** @generated */
  final int     casFeatCode_previous;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPrevious(int addr) {
        if (featOkTst && casFeat_previous == null)
      jcas.throwFeatMissing("previous", "org.hucompute.publichistory.datastore.typesystem.Tour");
    return ll_cas.ll_getRefValue(addr, casFeatCode_previous);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrevious(int addr, int v) {
        if (featOkTst && casFeat_previous == null)
      jcas.throwFeatMissing("previous", "org.hucompute.publichistory.datastore.typesystem.Tour");
    ll_cas.ll_setRefValue(addr, casFeatCode_previous, v);}
    
  
 
  /** @generated */
  final Feature casFeat_next;
  /** @generated */
  final int     casFeatCode_next;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNext(int addr) {
        if (featOkTst && casFeat_next == null)
      jcas.throwFeatMissing("next", "org.hucompute.publichistory.datastore.typesystem.Tour");
    return ll_cas.ll_getRefValue(addr, casFeatCode_next);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNext(int addr, int v) {
        if (featOkTst && casFeat_next == null)
      jcas.throwFeatMissing("next", "org.hucompute.publichistory.datastore.typesystem.Tour");
    ll_cas.ll_setRefValue(addr, casFeatCode_next, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Tour_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_previous = jcas.getRequiredFeatureDE(casType, "previous", "org.hucompute.publichistory.datastore.typesystem.Waypoint", featOkTst);
    casFeatCode_previous  = (null == casFeat_previous) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_previous).getCode();

 
    casFeat_next = jcas.getRequiredFeatureDE(casType, "next", "org.hucompute.publichistory.datastore.typesystem.Waypoint", featOkTst);
    casFeatCode_next  = (null == casFeat_next) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_next).getCode();

  }
}



    