

/* First created by JCasGen Fri Mar 04 09:31:48 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Mon Apr 04 13:45:28 CEST 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Time.xml
 * @generated */
public class TimeLayer extends TimeProcess {
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int typeIndexID = JCasRegistry.register(TimeLayer.class);
    /**
     * @generated
     * @ordered
     */
    @SuppressWarnings("hiding")
    public final static int type = typeIndexID;

    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected TimeLayer() {/* intentionally empty block */}

    /**
     * Internal - constructor used by generator
     *
     * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
     * @generated
     */
    public TimeLayer(int addr, TOP_Type type) {
        super(addr, type);
        readObject();
    }

    /**
     * @param jcas JCas to which this Feature Structure belongs
     * @generated
     */
    public TimeLayer(JCas jcas) {
        super(jcas);
        readObject();
    }

    /**
     * @param jcas  JCas to which this Feature Structure belongs
     * @param begin offset to the begin spot in the SofA
     * @param end   offset to the end spot in the SofA
     * @generated
     */
    public TimeLayer(JCas jcas, int begin, int end) {
        super(jcas);
        setBegin(begin);
        setEnd(end);
        readObject();
    }

    /**
     * @return index of the type
     * @generated
     */
    @Override
    public int getTypeIndexID() {
        return typeIndexID;
    }

    /**
     * <!-- begin-user-doc -->
     * Write your own initialization here
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    private void readObject() {/*default - does nothing empty block */}


    //*--------------*
    //* Feature: elements

    /**
     * getter for elements - gets
     *
     * @return value of the feature
     * @generated
     */
    public StringArray getElements() {
        if (TimeLayer_Type.featOkTst && ((TimeLayer_Type) jcasType).casFeat_elements == null)
            jcasType.jcas.throwFeatMissing("elements", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        return (StringArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeLayer_Type) jcasType).casFeatCode_elements)));
    }

    /**
     * setter for elements - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setElements(StringArray v) {
        if (TimeLayer_Type.featOkTst && ((TimeLayer_Type) jcasType).casFeat_elements == null)
            jcasType.jcas.throwFeatMissing("elements", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        jcasType.ll_cas.ll_setRefValue(addr, ((TimeLayer_Type) jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));
    }

    /**
     * indexed getter for elements - gets an indexed value -
     *
     * @param i index in the array to get
     * @return value of the element at index i
     * @generated
     */
    public String getElements(int i) {
        if (TimeLayer_Type.featOkTst && ((TimeLayer_Type) jcasType).casFeat_elements == null)
            jcasType.jcas.throwFeatMissing("elements", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TimeLayer_Type) jcasType).casFeatCode_elements), i);
        return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TimeLayer_Type) jcasType).casFeatCode_elements), i);
    }

    /**
     * indexed setter for elements - sets an indexed value -
     *
     * @param i index in the array to set
     * @param v value to set into the array
     * @generated
     */
    public void setElements(int i, String v) {
        if (TimeLayer_Type.featOkTst && ((TimeLayer_Type) jcasType).casFeat_elements == null)
            jcasType.jcas.throwFeatMissing("elements", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TimeLayer_Type) jcasType).casFeatCode_elements), i);
        jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TimeLayer_Type) jcasType).casFeatCode_elements), i, v);
    }


    //*--------------*
    //* Feature: only

    /**
     * getter for only - gets
     *
     * @return value of the feature
     * @generated
     */
    public boolean getOnly() {
        if (TimeLayer_Type.featOkTst && ((TimeLayer_Type) jcasType).casFeat_only == null)
            jcasType.jcas.throwFeatMissing("only", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        return jcasType.ll_cas.ll_getBooleanValue(addr, ((TimeLayer_Type) jcasType).casFeatCode_only);
    }

    /**
     * setter for only - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setOnly(boolean v) {
        if (TimeLayer_Type.featOkTst && ((TimeLayer_Type) jcasType).casFeat_only == null)
            jcasType.jcas.throwFeatMissing("only", "org.hucompute.publichistory.datastore.typesystem.TimeLayer");
        jcasType.ll_cas.ll_setBooleanValue(addr, ((TimeLayer_Type) jcasType).casFeatCode_only, v);
    }
}

