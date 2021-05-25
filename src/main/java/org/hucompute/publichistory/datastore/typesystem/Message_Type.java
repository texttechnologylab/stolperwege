
/* First created by JCasGen Tue Jul 09 12:15:56 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Jul 09 12:15:56 CEST 2019
 * @generated */
public class Message_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Message.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Message");
 
  /** @generated */
  final Feature casFeat_receiver;
  /** @generated */
  final int     casFeatCode_receiver;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReceiver(int addr) {
        if (featOkTst && casFeat_receiver == null)
      jcas.throwFeatMissing("receiver", "org.hucompute.publichistory.datastore.typesystem.Message");
    return ll_cas.ll_getRefValue(addr, casFeatCode_receiver);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReceiver(int addr, int v) {
        if (featOkTst && casFeat_receiver == null)
      jcas.throwFeatMissing("receiver", "org.hucompute.publichistory.datastore.typesystem.Message");
    ll_cas.ll_setRefValue(addr, casFeatCode_receiver, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getReceiver(int addr, int i) {
        if (featOkTst && casFeat_receiver == null)
      jcas.throwFeatMissing("receiver", "org.hucompute.publichistory.datastore.typesystem.Message");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_receiver), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_receiver), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_receiver), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setReceiver(int addr, int i, int v) {
        if (featOkTst && casFeat_receiver == null)
      jcas.throwFeatMissing("receiver", "org.hucompute.publichistory.datastore.typesystem.Message");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_receiver), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_receiver), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_receiver), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_sender;
  /** @generated */
  final int     casFeatCode_sender;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSender(int addr) {
        if (featOkTst && casFeat_sender == null)
      jcas.throwFeatMissing("sender", "org.hucompute.publichistory.datastore.typesystem.Message");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sender);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSender(int addr, int v) {
        if (featOkTst && casFeat_sender == null)
      jcas.throwFeatMissing("sender", "org.hucompute.publichistory.datastore.typesystem.Message");
    ll_cas.ll_setRefValue(addr, casFeatCode_sender, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Message_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_receiver = jcas.getRequiredFeatureDE(casType, "receiver", "uima.cas.FSArray", featOkTst);
    casFeatCode_receiver  = (null == casFeat_receiver) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_receiver).getCode();

 
    casFeat_sender = jcas.getRequiredFeatureDE(casType, "sender", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser", featOkTst);
    casFeatCode_sender  = (null == casFeat_sender) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sender).getCode();

  }
}



    