
/* First created by JCasGen Tue Jul 09 12:17:17 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jul 09 12:17:17 CEST 2019
 * @generated */
public class VirtualRoom_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = VirtualRoom.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
 
  /** @generated */
  final Feature casFeat_public;
  /** @generated */
  final int     casFeatCode_public;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getPublic(int addr) {
        if (featOkTst && casFeat_public == null)
      jcas.throwFeatMissing("public", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_public);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPublic(int addr, boolean v) {
        if (featOkTst && casFeat_public == null)
      jcas.throwFeatMissing("public", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_public, v);}
    
  
 
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
      jcas.throwFeatMissing("visible", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_visible);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVisible(int addr, boolean v) {
        if (featOkTst && casFeat_visible == null)
      jcas.throwFeatMissing("visible", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_visible, v);}
    
  
 
  /** @generated */
  final Feature casFeat_host;
  /** @generated */
  final int     casFeatCode_host;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getHost(int addr) {
        if (featOkTst && casFeat_host == null)
      jcas.throwFeatMissing("host", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    return ll_cas.ll_getRefValue(addr, casFeatCode_host);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHost(int addr, int v) {
        if (featOkTst && casFeat_host == null)
      jcas.throwFeatMissing("host", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    ll_cas.ll_setRefValue(addr, casFeatCode_host, v);}
    
  
 
  /** @generated */
  final Feature casFeat_port;
  /** @generated */
  final int     casFeatCode_port;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPort(int addr) {
        if (featOkTst && casFeat_port == null)
      jcas.throwFeatMissing("port", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    return ll_cas.ll_getIntValue(addr, casFeatCode_port);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPort(int addr, int v) {
        if (featOkTst && casFeat_port == null)
      jcas.throwFeatMissing("port", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    ll_cas.ll_setIntValue(addr, casFeatCode_port, v);}
    
  
 
  /** @generated */
  final Feature casFeat_clients;
  /** @generated */
  final int     casFeatCode_clients;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getClients(int addr) {
        if (featOkTst && casFeat_clients == null)
      jcas.throwFeatMissing("clients", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    return ll_cas.ll_getRefValue(addr, casFeatCode_clients);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClients(int addr, int v) {
        if (featOkTst && casFeat_clients == null)
      jcas.throwFeatMissing("clients", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    ll_cas.ll_setRefValue(addr, casFeatCode_clients, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getClients(int addr, int i) {
        if (featOkTst && casFeat_clients == null)
      jcas.throwFeatMissing("clients", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_clients), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_clients), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_clients), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setClients(int addr, int i, int v) {
        if (featOkTst && casFeat_clients == null)
      jcas.throwFeatMissing("clients", "org.hucompute.publichistory.datastore.typesystem.VirtualRoom");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_clients), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_clients), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_clients), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public VirtualRoom_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_public = jcas.getRequiredFeatureDE(casType, "public", "uima.cas.Boolean", featOkTst);
    casFeatCode_public  = (null == casFeat_public) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_public).getCode();

 
    casFeat_visible = jcas.getRequiredFeatureDE(casType, "visible", "uima.cas.Boolean", featOkTst);
    casFeatCode_visible  = (null == casFeat_visible) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_visible).getCode();

 
    casFeat_host = jcas.getRequiredFeatureDE(casType, "host", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser", featOkTst);
    casFeatCode_host  = (null == casFeat_host) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_host).getCode();

 
    casFeat_port = jcas.getRequiredFeatureDE(casType, "port", "uima.cas.Integer", featOkTst);
    casFeatCode_port  = (null == casFeat_port) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_port).getCode();

 
    casFeat_clients = jcas.getRequiredFeatureDE(casType, "clients", "uima.cas.FSArray", featOkTst);
    casFeatCode_clients  = (null == casFeat_clients) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_clients).getCode();

  }
}



    