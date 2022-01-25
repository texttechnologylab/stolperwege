
/* First created by JCasGen Tue Jan 25 16:36:33 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jan 25 16:36:54 CET 2022
 * @generated */
public class Waypoint_Type extends UnityPosition_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Waypoint.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Waypoint");
 
  /** @generated */
  final Feature casFeat_area;
  /** @generated */
  final int     casFeatCode_area;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getArea(int addr) {
        if (featOkTst && casFeat_area == null)
      jcas.throwFeatMissing("area", "org.hucompute.publichistory.datastore.typesystem.Waypoint");
    return ll_cas.ll_getStringValue(addr, casFeatCode_area);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setArea(int addr, String v) {
        if (featOkTst && casFeat_area == null)
      jcas.throwFeatMissing("area", "org.hucompute.publichistory.datastore.typesystem.Waypoint");
    ll_cas.ll_setStringValue(addr, casFeatCode_area, v);}
    
  
 
  /** @generated */
  final Feature casFeat_visible;
  /** @generated */
  final int     casFeatCode_visible;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getVisible(int addr) {
        if (featOkTst && casFeat_visible == null)
      jcas.throwFeatMissing("visible", "org.hucompute.publichistory.datastore.typesystem.Waypoint");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_visible);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVisible(int addr, boolean v) {
        if (featOkTst && casFeat_visible == null)
      jcas.throwFeatMissing("visible", "org.hucompute.publichistory.datastore.typesystem.Waypoint");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_visible, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Waypoint_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_area = jcas.getRequiredFeatureDE(casType, "area", "uima.cas.String", featOkTst);
    casFeatCode_area  = (null == casFeat_area) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_area).getCode();

 
    casFeat_visible = jcas.getRequiredFeatureDE(casType, "visible", "uima.cas.Boolean", featOkTst);
    casFeatCode_visible  = (null == casFeat_visible) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_visible).getCode();

  }
}



    