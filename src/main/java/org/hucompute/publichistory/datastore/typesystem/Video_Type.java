
/* First created by JCasGen Tue Jul 09 12:15:35 CEST 2019 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Tue Jul 09 12:15:35 CEST 2019
 * @generated */
public class Video_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Video.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Video");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Video_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    