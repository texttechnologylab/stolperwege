
/* First created by JCasGen Tue Jan 25 16:36:30 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jan 25 16:36:30 CET 2022
 * @generated */
public class ToolChain_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ToolChain.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.ToolChain");
 
  /** @generated */
  final Feature casFeat_language;
  /** @generated */
  final int     casFeatCode_language;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "org.hucompute.publichistory.datastore.typesystem.ToolChain");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "org.hucompute.publichistory.datastore.typesystem.ToolChain");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tools;
  /** @generated */
  final int     casFeatCode_tools;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTools(int addr) {
        if (featOkTst && casFeat_tools == null)
      jcas.throwFeatMissing("tools", "org.hucompute.publichistory.datastore.typesystem.ToolChain");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tools);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTools(int addr, String v) {
        if (featOkTst && casFeat_tools == null)
      jcas.throwFeatMissing("tools", "org.hucompute.publichistory.datastore.typesystem.ToolChain");
    ll_cas.ll_setStringValue(addr, casFeatCode_tools, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ToolChain_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

 
    casFeat_tools = jcas.getRequiredFeatureDE(casType, "tools", "uima.cas.String", featOkTst);
    casFeatCode_tools  = (null == casFeat_tools) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tools).getCode();

  }
}



    