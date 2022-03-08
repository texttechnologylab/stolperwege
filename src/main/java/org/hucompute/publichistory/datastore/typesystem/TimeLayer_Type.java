
/* First created by JCasGen Fri Mar 04 09:31:48 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.cas.Feature;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

/**
 * Updated by JCasGen Tue Mar 08 09:10:00 CET 2022
 *
 * @generated
 */
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
     * initialize variables to correspond with Cas Type and Features
     *
     * @param jcas    JCas
     * @param casType Type
     * @generated
     */
    public TimeLayer_Type(JCas jcas, Type casType) {
        super(jcas, casType);
        casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl) this.casType, getFSGenerator());


        casFeat_elements = jcas.getRequiredFeatureDE(casType, "elements", "uima.cas.StringList", featOkTst);
        casFeatCode_elements = (null == casFeat_elements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl) casFeat_elements).getCode();

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
}



