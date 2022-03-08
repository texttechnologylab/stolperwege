

/* First created by JCasGen Tue Jan 25 16:26:01 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Tue Mar 08 13:41:17 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Quiz.xml
 * @generated */
public class Quiz extends DiscourseReferent {
  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Quiz.class);
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
  public Quiz(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected Quiz() {/* intentionally empty block */}

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public Quiz(JCas jcas) {
      super(jcas);
      readObject();
  }

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
  */
  public Quiz(JCas jcas, int begin, int end) {
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
        return typeIndexID;}

  /**
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable
   */
  private void readObject() {/*default - does nothing empty block */}



  //*--------------*
    //* Feature: answers

    /** getter for answers - gets
     * @generated
     * @return value of the feature
   */
  public FSArray getAnswers() {
    if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_answers)));
  }

    /** setter for answers - sets
     * @generated
     * @param v value to set into the feature
   */
  public void setAnswers(FSArray v) {
    if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
      jcasType.ll_cas.ll_setRefValue(addr, ((Quiz_Type) jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));
  }

    /** indexed getter for answers - gets an indexed value -
   * @generated
   * @param i index in the array to get
     * @return value of the element at index i
   */
  public Text getAnswers(int i) {
    if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_answers), i);
    return (Text)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_answers), i)));
  }

    /** indexed setter for answers - sets an indexed value -
   * @generated
   * @param i index in the array to set
     * @param v value to set into the array
     */
    public void setAnswers(int i, Text v) {
        if (Quiz_Type.featOkTst && ((Quiz_Type)jcasType).casFeat_answers == null)
            jcasType.jcas.throwFeatMissing("answers", "org.hucompute.publichistory.datastore.typesystem.Quiz");
        jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_answers), i);
        jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type)jcasType).casFeatCode_answers), i, jcasType.ll_cas.ll_getFSRef(v));
    }


    //*--------------*
    //* Feature: correct

    /**
     * getter for correct - gets
     *
     * @return value of the feature
     * @generated
     */
    public Text getCorrect() {
        if (Quiz_Type.featOkTst && ((Quiz_Type) jcasType).casFeat_correct == null)
            jcasType.jcas.throwFeatMissing("correct", "org.hucompute.publichistory.datastore.typesystem.Quiz");
        return (Text) (jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Quiz_Type) jcasType).casFeatCode_correct)));
    }

    /**
     * setter for correct - sets
     *
     * @param v value to set into the feature
     * @generated
     */
    public void setCorrect(Text v) {
        if (Quiz_Type.featOkTst && ((Quiz_Type) jcasType).casFeat_correct == null)
            jcasType.jcas.throwFeatMissing("correct", "org.hucompute.publichistory.datastore.typesystem.Quiz");
        jcasType.ll_cas.ll_setRefValue(addr, ((Quiz_Type) jcasType).casFeatCode_correct, jcasType.ll_cas.ll_getFSRef(v));}
  }

