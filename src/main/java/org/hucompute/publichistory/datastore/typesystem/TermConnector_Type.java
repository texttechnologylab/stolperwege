
/* First created by JCasGen Tue Jul 09 12:14:17 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jul 09 12:14:27 CEST 2019
 * @generated */
public class TermConnector_Type extends StolperwegeElement_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TermConnector.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.TermConnector");
 
  /** @generated */
  final Feature casFeat_connector;
  /** @generated */
  final int     casFeatCode_connector;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getConnector(int addr) {
        if (featOkTst && casFeat_connector == null)
      jcas.throwFeatMissing("connector", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    return ll_cas.ll_getRefValue(addr, casFeatCode_connector);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConnector(int addr, int v) {
        if (featOkTst && casFeat_connector == null)
      jcas.throwFeatMissing("connector", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    ll_cas.ll_setRefValue(addr, casFeatCode_connector, v);}
    
  
 
  /** @generated */
  final Feature casFeat_terms;
  /** @generated */
  final int     casFeatCode_terms;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTerms(int addr) {
        if (featOkTst && casFeat_terms == null)
      jcas.throwFeatMissing("terms", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    return ll_cas.ll_getRefValue(addr, casFeatCode_terms);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTerms(int addr, int v) {
        if (featOkTst && casFeat_terms == null)
      jcas.throwFeatMissing("terms", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    ll_cas.ll_setRefValue(addr, casFeatCode_terms, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getTerms(int addr, int i) {
        if (featOkTst && casFeat_terms == null)
      jcas.throwFeatMissing("terms", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_terms), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_terms), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_terms), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setTerms(int addr, int i, int v) {
        if (featOkTst && casFeat_terms == null)
      jcas.throwFeatMissing("terms", "org.hucompute.publichistory.datastore.typesystem.TermConnector");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_terms), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_terms), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_terms), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TermConnector_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_connector = jcas.getRequiredFeatureDE(casType, "connector", "org.hucompute.publichistory.datastore.typesystem.Connector", featOkTst);
    casFeatCode_connector  = (null == casFeat_connector) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_connector).getCode();

 
    casFeat_terms = jcas.getRequiredFeatureDE(casType, "terms", "uima.cas.FSArray", featOkTst);
    casFeatCode_terms  = (null == casFeat_terms) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_terms).getCode();

  }
}



    