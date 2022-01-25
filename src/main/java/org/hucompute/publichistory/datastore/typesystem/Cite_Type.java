
/* First created by JCasGen Tue Jan 25 16:26:28 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jan 25 16:26:28 CET 2022
 * @generated */
public class Cite_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Cite.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Cite");
 
  /** @generated */
  final Feature casFeat_licence;
  /** @generated */
  final int     casFeatCode_licence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLicence(int addr) {
        if (featOkTst && casFeat_licence == null)
      jcas.throwFeatMissing("licence", "org.hucompute.publichistory.datastore.typesystem.Cite");
    return ll_cas.ll_getStringValue(addr, casFeatCode_licence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLicence(int addr, String v) {
        if (featOkTst && casFeat_licence == null)
      jcas.throwFeatMissing("licence", "org.hucompute.publichistory.datastore.typesystem.Cite");
    ll_cas.ll_setStringValue(addr, casFeatCode_licence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_howtocite;
  /** @generated */
  final int     casFeatCode_howtocite;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHowtocite(int addr) {
        if (featOkTst && casFeat_howtocite == null)
      jcas.throwFeatMissing("howtocite", "org.hucompute.publichistory.datastore.typesystem.Cite");
    return ll_cas.ll_getStringValue(addr, casFeatCode_howtocite);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHowtocite(int addr, String v) {
        if (featOkTst && casFeat_howtocite == null)
      jcas.throwFeatMissing("howtocite", "org.hucompute.publichistory.datastore.typesystem.Cite");
    ll_cas.ll_setStringValue(addr, casFeatCode_howtocite, v);}
    
  
 
  /** @generated */
  final Feature casFeat_author;
  /** @generated */
  final int     casFeatCode_author;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAuthor(int addr) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "org.hucompute.publichistory.datastore.typesystem.Cite");
    return ll_cas.ll_getStringValue(addr, casFeatCode_author);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAuthor(int addr, String v) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "org.hucompute.publichistory.datastore.typesystem.Cite");
    ll_cas.ll_setStringValue(addr, casFeatCode_author, v);}
    
  
 
  /** @generated */
  final Feature casFeat_bibtex;
  /** @generated */
  final int     casFeatCode_bibtex;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getBibtex(int addr) {
        if (featOkTst && casFeat_bibtex == null)
      jcas.throwFeatMissing("bibtex", "org.hucompute.publichistory.datastore.typesystem.Cite");
    return ll_cas.ll_getStringValue(addr, casFeatCode_bibtex);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBibtex(int addr, String v) {
        if (featOkTst && casFeat_bibtex == null)
      jcas.throwFeatMissing("bibtex", "org.hucompute.publichistory.datastore.typesystem.Cite");
    ll_cas.ll_setStringValue(addr, casFeatCode_bibtex, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Cite_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_licence = jcas.getRequiredFeatureDE(casType, "licence", "uima.cas.String", featOkTst);
    casFeatCode_licence  = (null == casFeat_licence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_licence).getCode();

 
    casFeat_howtocite = jcas.getRequiredFeatureDE(casType, "howtocite", "uima.cas.String", featOkTst);
    casFeatCode_howtocite  = (null == casFeat_howtocite) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_howtocite).getCode();

 
    casFeat_author = jcas.getRequiredFeatureDE(casType, "author", "uima.cas.String", featOkTst);
    casFeatCode_author  = (null == casFeat_author) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_author).getCode();

 
    casFeat_bibtex = jcas.getRequiredFeatureDE(casType, "bibtex", "uima.cas.String", featOkTst);
    casFeatCode_bibtex  = (null == casFeat_bibtex) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_bibtex).getCode();

  }
}



    