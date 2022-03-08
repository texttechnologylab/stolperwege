
/* First created by JCasGen Tue Jan 25 16:26:32 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

/**
 * Updated by JCasGen Tue Mar 08 11:34:43 CET 2022
 * @generated */
public class Comment_Type extends Text_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Comment.typeIndexID;
    /** @generated
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Comment");

  /** @generated */
  final Feature casFeat_timestamp;
  /** @generated */
  final int     casFeatCode_timestamp;
    /**
     * @generated
     */
    final Feature casFeat_deleted;
    /**
     * @generated
     */
    final int casFeatCode_deleted;


    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public Comment_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_timestamp = jcas.getRequiredFeatureDE(casType, "timestamp", "uima.cas.Long", featOkTst);
        casFeatCode_timestamp = (null == casFeat_timestamp) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_timestamp).getCode();


        casFeat_deleted = jcas.getRequiredFeatureDE(casType, "deleted", "uima.cas.Boolean", featOkTst);
        casFeatCode_deleted = (null == casFeat_deleted) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_deleted).getCode();

    }

  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value
   */
  public long getTimestamp(int addr) {
        if (featOkTst && casFeat_timestamp == null)
      jcas.throwFeatMissing("timestamp", "org.hucompute.publichistory.datastore.typesystem.Comment");
    return ll_cas.ll_getLongValue(addr, casFeatCode_timestamp);
  }

  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set
   */
  public void setTimestamp(int addr, long v) {
        if (featOkTst && casFeat_timestamp == null)
      jcas.throwFeatMissing("timestamp", "org.hucompute.publichistory.datastore.typesystem.Comment");
    ll_cas.ll_setLongValue(addr, casFeatCode_timestamp, v);
  }

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public boolean getDeleted(int addr) {
        if (featOkTst && casFeat_deleted == null)
            jcas.throwFeatMissing("deleted", "org.hucompute.publichistory.datastore.typesystem.Comment");
        return ll_cas.ll_getBooleanValue(addr, casFeatCode_deleted);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setDeleted(int addr, boolean v) {
        if (featOkTst && casFeat_deleted == null)
            jcas.throwFeatMissing("deleted", "org.hucompute.publichistory.datastore.typesystem.Comment");
        ll_cas.ll_setBooleanValue(addr, casFeatCode_deleted, v);}
}



