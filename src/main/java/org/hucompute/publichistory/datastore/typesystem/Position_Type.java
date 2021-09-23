
/* First created by JCasGen Tue Jul 09 12:14:17 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Sep 23 08:58:15 CEST 2021
 * @generated */
public class Position_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Position.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Position");
 
  /** @generated */
  final Feature casFeat_latitude;
  /** @generated */
  final int     casFeatCode_latitude;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getLatitude(int addr) {
        if (featOkTst && casFeat_latitude == null)
      jcas.throwFeatMissing("latitude", "org.hucompute.publichistory.datastore.typesystem.Position");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_latitude);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLatitude(int addr, double v) {
        if (featOkTst && casFeat_latitude == null)
      jcas.throwFeatMissing("latitude", "org.hucompute.publichistory.datastore.typesystem.Position");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_latitude, v);}
    
  
 
  /** @generated */
  final Feature casFeat_longitude;
  /** @generated */
  final int     casFeatCode_longitude;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getLongitude(int addr) {
        if (featOkTst && casFeat_longitude == null)
      jcas.throwFeatMissing("longitude", "org.hucompute.publichistory.datastore.typesystem.Position");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_longitude);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLongitude(int addr, double v) {
        if (featOkTst && casFeat_longitude == null)
      jcas.throwFeatMissing("longitude", "org.hucompute.publichistory.datastore.typesystem.Position");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_longitude, v);}
    
  
 
  /** @generated */
  final Feature casFeat_orientation;
  /** @generated */
  final int     casFeatCode_orientation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOrientation(int addr) {
        if (featOkTst && casFeat_orientation == null)
      jcas.throwFeatMissing("orientation", "org.hucompute.publichistory.datastore.typesystem.Position");
    return ll_cas.ll_getIntValue(addr, casFeatCode_orientation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrientation(int addr, int v) {
        if (featOkTst && casFeat_orientation == null)
      jcas.throwFeatMissing("orientation", "org.hucompute.publichistory.datastore.typesystem.Position");
    ll_cas.ll_setIntValue(addr, casFeatCode_orientation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Position_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_latitude = jcas.getRequiredFeatureDE(casType, "latitude", "uima.cas.Double", featOkTst);
    casFeatCode_latitude  = (null == casFeat_latitude) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_latitude).getCode();

 
    casFeat_longitude = jcas.getRequiredFeatureDE(casType, "longitude", "uima.cas.Double", featOkTst);
    casFeatCode_longitude  = (null == casFeat_longitude) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_longitude).getCode();

 
    casFeat_orientation = jcas.getRequiredFeatureDE(casType, "orientation", "uima.cas.Integer", featOkTst);
    casFeatCode_orientation  = (null == casFeat_orientation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_orientation).getCode();

  }
}



    