

/* First created by JCasGen Tue Jan 25 16:26:01 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Tue Mar 08 13:41:18 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Quiz.xml
 * @generated */
public class StolperwegeUser extends DiscourseReferent {
  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(StolperwegeUser.class);
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
  public StolperwegeUser(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

    /**
     * Never called.  Disable default constructor
     *
     * @generated
     */
    protected StolperwegeUser() {/* intentionally empty block */}

    /** @generated
     * @param jcas JCas to which this Feature Structure belongs
   */
  public StolperwegeUser(JCas jcas) {
      super(jcas);
      readObject();
  }

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
  */
  public StolperwegeUser(JCas jcas, int begin, int end) {
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
    //* Feature: mail

  /** getter for mail - gets
   * @generated
   * @return value of the feature
   */
  public String getMail() {
    if (StolperwegeUser_Type.featOkTst && ((StolperwegeUser_Type)jcasType).casFeat_mail == null)
      jcasType.jcas.throwFeatMissing("mail", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    return jcasType.ll_cas.ll_getStringValue(addr, ((StolperwegeUser_Type) jcasType).casFeatCode_mail);}

  /** setter for mail - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setMail(String v) {
    if (StolperwegeUser_Type.featOkTst && ((StolperwegeUser_Type)jcasType).casFeat_mail == null)
      jcasType.jcas.throwFeatMissing("mail", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
      jcasType.ll_cas.ll_setStringValue(addr, ((StolperwegeUser_Type)jcasType).casFeatCode_mail, v);}


  //*--------------*
    //* Feature: status

  /** getter for status - gets
   * @generated
   * @return value of the feature
   */
  public boolean getStatus() {
    if (StolperwegeUser_Type.featOkTst && ((StolperwegeUser_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((StolperwegeUser_Type) jcasType).casFeatCode_status);
  }

  /** setter for status - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setStatus(boolean v) {
    if (StolperwegeUser_Type.featOkTst && ((StolperwegeUser_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
      jcasType.ll_cas.ll_setBooleanValue(addr, ((StolperwegeUser_Type) jcasType).casFeatCode_status, v);}


  //*--------------*
    //* Feature: password

    /** getter for password - gets
     * @generated
     * @return value of the feature
   */
  public String getPassword() {
    if (StolperwegeUser_Type.featOkTst && ((StolperwegeUser_Type)jcasType).casFeat_password == null)
      jcasType.jcas.throwFeatMissing("password", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    return jcasType.ll_cas.ll_getStringValue(addr, ((StolperwegeUser_Type)jcasType).casFeatCode_password);
  }

    /** setter for password - sets
     * @generated
     * @param v value to set into the feature
   */
  public void setPassword(String v) {
    if (StolperwegeUser_Type.featOkTst && ((StolperwegeUser_Type)jcasType).casFeat_password == null)
      jcasType.jcas.throwFeatMissing("password", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
      jcasType.ll_cas.ll_setStringValue(addr, ((StolperwegeUser_Type) jcasType).casFeatCode_password, v);}


  //*--------------*
    //* Feature: preferences

    /** getter for preferences - gets
     * @generated
     * @return value of the feature
   */
  public FSArray getPreferences() {
    if (StolperwegeUser_Type.featOkTst && ((StolperwegeUser_Type)jcasType).casFeat_preferences == null)
      jcasType.jcas.throwFeatMissing("preferences", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((StolperwegeUser_Type)jcasType).casFeatCode_preferences)));
  }

    /** setter for preferences - sets
     * @generated
     * @param v value to set into the feature
   */
  public void setPreferences(FSArray v) {
    if (StolperwegeUser_Type.featOkTst && ((StolperwegeUser_Type)jcasType).casFeat_preferences == null)
      jcasType.jcas.throwFeatMissing("preferences", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
      jcasType.ll_cas.ll_setRefValue(addr, ((StolperwegeUser_Type) jcasType).casFeatCode_preferences, jcasType.ll_cas.ll_getFSRef(v));
  }

    /** indexed getter for preferences - gets an indexed value -
   * @generated
   * @param i index in the array to get
     * @return value of the element at index i
   */
  public Preference getPreferences(int i) {
    if (StolperwegeUser_Type.featOkTst && ((StolperwegeUser_Type)jcasType).casFeat_preferences == null)
      jcasType.jcas.throwFeatMissing("preferences", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((StolperwegeUser_Type)jcasType).casFeatCode_preferences), i);
    return (Preference)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((StolperwegeUser_Type)jcasType).casFeatCode_preferences), i)));
  }

    /** indexed setter for preferences - sets an indexed value -
   * @generated
   * @param i index in the array to set
     * @param v value to set into the array
     */
    public void setPreferences(int i, Preference v) {
    if (StolperwegeUser_Type.featOkTst && ((StolperwegeUser_Type)jcasType).casFeat_preferences == null)
      jcasType.jcas.throwFeatMissing("preferences", "org.hucompute.publichistory.datastore.typesystem.StolperwegeUser");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((StolperwegeUser_Type)jcasType).casFeatCode_preferences), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((StolperwegeUser_Type)jcasType).casFeatCode_preferences), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

