
/* First created by JCasGen Tue Jan 25 16:26:01 CET 2022 */
package org.hucompute.publichistory.datastore.typesystem;

import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

/**
 * Updated by JCasGen Tue Mar 08 09:10:00 CET 2022
 * @generated */
public class Argument_Type extends StolperwegeElement_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Argument.typeIndexID;
    /** @generated
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.hucompute.publichistory.datastore.typesystem.Argument");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
   * @param casType Type
	 */
  public Argument_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



