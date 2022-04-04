

/* First created by JCasGen Tue Jan 25 16:26:01 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Mon Apr 04 13:45:28 CEST 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Time.xml
 * @generated */
public class StolperwegeElement extends Annotation {
  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(StolperwegeElement.class);
  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;

    /** Internal - constructor used by generator
   * @generated
   * @param addr low level Feature Structure reference
     * @param type the type of this Feature Structure
   */
  public StolperwegeElement(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected StolperwegeElement() {/* intentionally empty block */}

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public StolperwegeElement(JCas jcas) {
      super(jcas);
      readObject();
  }

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
  */
  public StolperwegeElement(JCas jcas, int begin, int end) {
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
    //* Feature: value

    /** getter for value - gets
   * @generated
     * @return value of the feature
   */
  public String getValue() {
    if (StolperwegeElement_Type.featOkTst && ((StolperwegeElement_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.hucompute.publichistory.datastore.typesystem.StolperwegeElement");
      return jcasType.ll_cas.ll_getStringValue(addr, ((StolperwegeElement_Type) jcasType).casFeatCode_value);
  }

    /** setter for value - sets
   * @generated
     * @param v value to set into the feature
   */
  public void setValue(String v) {
    if (StolperwegeElement_Type.featOkTst && ((StolperwegeElement_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.hucompute.publichistory.datastore.typesystem.StolperwegeElement");
      jcasType.ll_cas.ll_setStringValue(addr, ((StolperwegeElement_Type) jcasType).casFeatCode_value, v);
  }


  //*--------------*
    //* Feature: description

    /** getter for description - gets
     * @generated
     * @return value of the feature
   */
  public String getDescription() {
    if (StolperwegeElement_Type.featOkTst && ((StolperwegeElement_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.hucompute.publichistory.datastore.typesystem.StolperwegeElement");
      return jcasType.ll_cas.ll_getStringValue(addr, ((StolperwegeElement_Type) jcasType).casFeatCode_description);
  }

    /** setter for description - sets
     * @generated
     * @param v value to set into the feature
   */
  public void setDescription(String v) {
    if (StolperwegeElement_Type.featOkTst && ((StolperwegeElement_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.hucompute.publichistory.datastore.typesystem.StolperwegeElement");
      jcasType.ll_cas.ll_setStringValue(addr, ((StolperwegeElement_Type) jcasType).casFeatCode_description, v);
  }
  }

