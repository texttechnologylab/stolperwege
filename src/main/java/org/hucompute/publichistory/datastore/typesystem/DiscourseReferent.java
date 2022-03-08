

/* First created by JCasGen Tue Jan 25 16:26:01 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Tue Mar 08 09:10:00 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Time.xml
 * @generated */
public class DiscourseReferent extends Argument {
  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DiscourseReferent.class);
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
  public DiscourseReferent(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected DiscourseReferent() {/* intentionally empty block */}

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public DiscourseReferent(JCas jcas) {
      super(jcas);
      readObject();
  }

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
  */
  public DiscourseReferent(JCas jcas, int begin, int end) {
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
    //* Feature: equivalent

    /** getter for equivalent - gets
     * @generated
     * @return value of the feature
   */
  public FSArray getEquivalent() {
    if (DiscourseReferent_Type.featOkTst && ((DiscourseReferent_Type)jcasType).casFeat_equivalent == null)
      jcasType.jcas.throwFeatMissing("equivalent", "org.hucompute.publichistory.datastore.typesystem.DiscourseReferent");
      return (FSArray) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseReferent_Type) jcasType).casFeatCode_equivalent)));
  }

    /** setter for equivalent - sets
     * @generated
     * @param v value to set into the feature
   */
  public void setEquivalent(FSArray v) {
    if (DiscourseReferent_Type.featOkTst && ((DiscourseReferent_Type)jcasType).casFeat_equivalent == null)
      jcasType.jcas.throwFeatMissing("equivalent", "org.hucompute.publichistory.datastore.typesystem.DiscourseReferent");
      jcasType.ll_cas.ll_setRefValue(addr, ((DiscourseReferent_Type) jcasType).casFeatCode_equivalent, jcasType.ll_cas.ll_getFSRef(v));
  }

    /** indexed getter for equivalent - gets an indexed value -
   * @generated
   * @param i index in the array to get
     * @return value of the element at index i
   */
  public DiscourseReferent getEquivalent(int i) {
    if (DiscourseReferent_Type.featOkTst && ((DiscourseReferent_Type)jcasType).casFeat_equivalent == null)
      jcasType.jcas.throwFeatMissing("equivalent", "org.hucompute.publichistory.datastore.typesystem.DiscourseReferent");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseReferent_Type)jcasType).casFeatCode_equivalent), i);
      return (DiscourseReferent) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseReferent_Type) jcasType).casFeatCode_equivalent), i)));
  }

    /** indexed setter for equivalent - sets an indexed value -
   * @generated
   * @param i index in the array to set
     * @param v value to set into the array
     */
    public void setEquivalent(int i, DiscourseReferent v) {
    if (DiscourseReferent_Type.featOkTst && ((DiscourseReferent_Type)jcasType).casFeat_equivalent == null)
      jcasType.jcas.throwFeatMissing("equivalent", "org.hucompute.publichistory.datastore.typesystem.DiscourseReferent");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseReferent_Type)jcasType).casFeatCode_equivalent), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DiscourseReferent_Type)jcasType).casFeatCode_equivalent), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

