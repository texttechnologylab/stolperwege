
/* First created by JCasGen Tue Jan 25 16:35:12 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Tue Jan 25 16:35:12 CET 2022
 * @generated */
public class Permission_Type extends DiscourseReferent_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Permission.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Permission");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Permission_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    