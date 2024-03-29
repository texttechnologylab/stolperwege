
/* First created by JCasGen Fri Mar 04 09:31:48 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

/**
 * Updated by JCasGen Mon Apr 04 13:45:28 CEST 2022
 * @generated */
public class TimeLayer_Type extends TimeProcess_Type {
    /**
     * @generated
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = TimeLayer.typeIndexID;
    /**
     * @generated
     * @modifiable
     */
    @SuppressWarnings("hiding")
    public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.TimeLayer");

    /**
     * @generated
     */
    final Feature casFeat_elements;
    /**
     * @generated
     */
    final int casFeatCode_elements;

    /**
     * @generated
     */
    final Feature casFeat_only;
    /**
     * @generated
     */
    final int casFeatCode_only;
    /**
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public TimeLayer_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_elements = jcas.getRequiredFeatureDE(casType, "elements", "uima.cas.StringArray", featOkTst);
        casFeatCode_elements = (null == casFeat_elements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_elements).getCode();


        casFeat_only = jcas.getRequiredFeatureDE(casType, "only", "uima.cas.Boolean", featOkTst);
        casFeatCode_only = (null == casFeat_only) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_only).getCode();

    }

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public int getElements(int addr) {
        if (featOkTst && casFeat_elements == null)
            jcas.throwFeatMissing("elements", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        return ll_cas.ll_getRefValue(addr, casFeatCode_elements);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setElements(int addr, int v) {
        if (featOkTst && casFeat_elements == null)
            jcas.throwFeatMissing("elements", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        ll_cas.ll_setRefValue(addr, casFeatCode_elements, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @return value at index i in the array
     * @generated
     */
    public String getElements(int addr, int i) {
        if (featOkTst && casFeat_elements == null)
            jcas.throwFeatMissing("elements", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        if (lowLevelTypeChecks)
            return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
        return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param i    index of item in the array
     * @param v    value to set
     * @generated
     */
    public void setElements(int addr, int i, String v) {
        if (featOkTst && casFeat_elements == null)
            jcas.throwFeatMissing("elements", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        if (lowLevelTypeChecks)
            ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v, true);
        jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
        ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v);
    }

    /**
     * @param addr low level Feature Structure reference
     * @return the feature value
     * @generated
     */
    public boolean getOnly(int addr) {
        if (featOkTst && casFeat_only == null)
            jcas.throwFeatMissing("only", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        return ll_cas.ll_getBooleanValue(addr, casFeatCode_only);
    }

    /**
     * @param addr low level Feature Structure reference
     * @param v    value to set
     * @generated
     */
    public void setOnly(int addr, boolean v) {
        if (featOkTst && casFeat_only == null)
            jcas.throwFeatMissing("only", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        ll_cas.ll_setBooleanValue(addr, casFeatCode_only, v);
    }





}



