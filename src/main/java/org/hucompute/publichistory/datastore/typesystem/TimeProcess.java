

/* First created by JCasGen Tue Jan 25 16:26:50 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Tue Mar 08 13:41:20 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Time.xml
 * @generated */
public class TimeProcess extends Time {
  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeProcess.class);
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
  public TimeProcess(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected TimeProcess() {/* intentionally empty block */}

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public TimeProcess(JCas jcas) {
      super(jcas);
      readObject();
  }

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
  */
  public TimeProcess(JCas jcas, int begin, int end) {
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
    //* Feature: endDate

    /** getter for endDate - gets
     * @generated
     * @return value of the feature
   */
  public String getEndDate() {
    if (TimeProcess_Type.featOkTst && ((TimeProcess_Type)jcasType).casFeat_endDate == null)
      jcasType.jcas.throwFeatMissing("endDate", "org.hucompute.publichistory.datastore.typesystem.TimeProcess");
      return jcasType.ll_cas.ll_getStringValue(addr, ((TimeProcess_Type) jcasType).casFeatCode_endDate);
  }

    /** setter for endDate - sets
     * @generated
     * @param v value to set into the feature
   */
  public void setEndDate(String v) {
    if (TimeProcess_Type.featOkTst && ((TimeProcess_Type)jcasType).casFeat_endDate == null)
      jcasType.jcas.throwFeatMissing("endDate", "org.hucompute.publichistory.datastore.typesystem.TimeProcess");
      jcasType.ll_cas.ll_setStringValue(addr, ((TimeProcess_Type) jcasType).casFeatCode_endDate, v);
  }
  }

