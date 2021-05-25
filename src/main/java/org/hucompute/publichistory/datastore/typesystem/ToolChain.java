

/* First created by JCasGen Tue Jul 09 12:17:35 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Jul 09 12:17:35 CEST 2019
 * XML source: /home/staff_homes/abrami/Projects/stolperwege/stolperwege/src/main/resources/desc/type/ToolChain.xml
 * @generated */
public class ToolChain extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ToolChain.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ToolChain() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ToolChain(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ToolChain(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ToolChain(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
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
  //* Feature: language

  /** getter for language - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLanguage() {
    if (ToolChain_Type.featOkTst && ((ToolChain_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "org.hucompute.publichistory.datastore.typesystem.ToolChain");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ToolChain_Type)jcasType).casFeatCode_language);}
    
  /** setter for language - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguage(String v) {
    if (ToolChain_Type.featOkTst && ((ToolChain_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "org.hucompute.publichistory.datastore.typesystem.ToolChain");
    jcasType.ll_cas.ll_setStringValue(addr, ((ToolChain_Type)jcasType).casFeatCode_language, v);}    
   
    
  //*--------------*
  //* Feature: tools

  /** getter for tools - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTools() {
    if (ToolChain_Type.featOkTst && ((ToolChain_Type)jcasType).casFeat_tools == null)
      jcasType.jcas.throwFeatMissing("tools", "org.hucompute.publichistory.datastore.typesystem.ToolChain");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ToolChain_Type)jcasType).casFeatCode_tools);}
    
  /** setter for tools - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTools(String v) {
    if (ToolChain_Type.featOkTst && ((ToolChain_Type)jcasType).casFeat_tools == null)
      jcasType.jcas.throwFeatMissing("tools", "org.hucompute.publichistory.datastore.typesystem.ToolChain");
    jcasType.ll_cas.ll_setStringValue(addr, ((ToolChain_Type)jcasType).casFeatCode_tools, v);}    
  }

    