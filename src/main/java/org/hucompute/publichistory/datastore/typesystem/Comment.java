

/* First created by JCasGen Tue Jan 25 16:26:32 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/**
 * Updated by JCasGen Tue Mar 08 11:34:43 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Comment.xml
 * @generated */
public class Comment extends Text {
  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Comment.class);
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
  public Comment(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }

  /**
   * Never called.  Disable default constructor
   *
   * @generated
   */
  protected Comment() {/* intentionally empty block */}

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   */
  public Comment(JCas jcas) {
    super(jcas);
    readObject();
  }

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA
  */
  public Comment(JCas jcas, int begin, int end) {
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
  //* Feature: timestamp

  /** getter for timestamp - gets
   * @generated
   * @return value of the feature
   */
  public long getTimestamp() {
    if (Comment_Type.featOkTst && ((Comment_Type)jcasType).casFeat_timestamp == null)
      jcasType.jcas.throwFeatMissing("timestamp", "org.hucompute.publichistory.datastore.typesystem.Comment");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Comment_Type)jcasType).casFeatCode_timestamp);
  }

  /** setter for timestamp - sets
   * @generated
   * @param v value to set into the feature
   */
  public void setTimestamp(long v) {
    if (Comment_Type.featOkTst && ((Comment_Type)jcasType).casFeat_timestamp == null)
      jcasType.jcas.throwFeatMissing("timestamp", "org.hucompute.publichistory.datastore.typesystem.Comment");
    jcasType.ll_cas.ll_setLongValue(addr, ((Comment_Type) jcasType).casFeatCode_timestamp, v);
  }


  //*--------------*
  //* Feature: deleted

  /**
   * getter for deleted - gets
   *
   * @return value of the feature
   * @generated
   */
  public boolean getDeleted() {
    if (Comment_Type.featOkTst && ((Comment_Type) jcasType).casFeat_deleted == null)
      jcasType.jcas.throwFeatMissing("deleted", "org.hucompute.publichistory.datastore.typesystem.Comment");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Comment_Type) jcasType).casFeatCode_deleted);
  }

  /**
   * setter for deleted - sets
   *
   * @param v value to set into the feature
   * @generated
   */
  public void setDeleted(boolean v) {
    if (Comment_Type.featOkTst && ((Comment_Type) jcasType).casFeat_deleted == null)
      jcasType.jcas.throwFeatMissing("deleted", "org.hucompute.publichistory.datastore.typesystem.Comment");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Comment_Type) jcasType).casFeatCode_deleted, v);}
  }

