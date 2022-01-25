

/* First created by JCasGen Tue Jan 25 16:26:28 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Jan 25 16:26:28 CET 2022
 * XML source: /home/gabrami/Projects/GitHub/stolperwege/src/main/resources/desc/type/Cite.xml
 * @generated */
public class Cite extends DiscourseReferent {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Cite.class);
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
  protected Cite() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Cite(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Cite(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Cite(JCas jcas, int begin, int end) {
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
  //* Feature: licence

  /** getter for licence - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLicence() {
    if (Cite_Type.featOkTst && ((Cite_Type)jcasType).casFeat_licence == null)
      jcasType.jcas.throwFeatMissing("licence", "org.hucompute.publichistory.datastore.typesystem.Cite");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Cite_Type)jcasType).casFeatCode_licence);}
    
  /** setter for licence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLicence(String v) {
    if (Cite_Type.featOkTst && ((Cite_Type)jcasType).casFeat_licence == null)
      jcasType.jcas.throwFeatMissing("licence", "org.hucompute.publichistory.datastore.typesystem.Cite");
    jcasType.ll_cas.ll_setStringValue(addr, ((Cite_Type)jcasType).casFeatCode_licence, v);}    
   
    
  //*--------------*
  //* Feature: howtocite

  /** getter for howtocite - gets 
   * @generated
   * @return value of the feature 
   */
  public String getHowtocite() {
    if (Cite_Type.featOkTst && ((Cite_Type)jcasType).casFeat_howtocite == null)
      jcasType.jcas.throwFeatMissing("howtocite", "org.hucompute.publichistory.datastore.typesystem.Cite");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Cite_Type)jcasType).casFeatCode_howtocite);}
    
  /** setter for howtocite - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHowtocite(String v) {
    if (Cite_Type.featOkTst && ((Cite_Type)jcasType).casFeat_howtocite == null)
      jcasType.jcas.throwFeatMissing("howtocite", "org.hucompute.publichistory.datastore.typesystem.Cite");
    jcasType.ll_cas.ll_setStringValue(addr, ((Cite_Type)jcasType).casFeatCode_howtocite, v);}    
   
    
  //*--------------*
  //* Feature: author

  /** getter for author - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAuthor() {
    if (Cite_Type.featOkTst && ((Cite_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "org.hucompute.publichistory.datastore.typesystem.Cite");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Cite_Type)jcasType).casFeatCode_author);}
    
  /** setter for author - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthor(String v) {
    if (Cite_Type.featOkTst && ((Cite_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "org.hucompute.publichistory.datastore.typesystem.Cite");
    jcasType.ll_cas.ll_setStringValue(addr, ((Cite_Type)jcasType).casFeatCode_author, v);}    
   
    
  //*--------------*
  //* Feature: bibtex

  /** getter for bibtex - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBibtex() {
    if (Cite_Type.featOkTst && ((Cite_Type)jcasType).casFeat_bibtex == null)
      jcasType.jcas.throwFeatMissing("bibtex", "org.hucompute.publichistory.datastore.typesystem.Cite");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Cite_Type)jcasType).casFeatCode_bibtex);}
    
  /** setter for bibtex - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBibtex(String v) {
    if (Cite_Type.featOkTst && ((Cite_Type)jcasType).casFeat_bibtex == null)
      jcasType.jcas.throwFeatMissing("bibtex", "org.hucompute.publichistory.datastore.typesystem.Cite");
    jcasType.ll_cas.ll_setStringValue(addr, ((Cite_Type)jcasType).casFeatCode_bibtex, v);}    
  }

    