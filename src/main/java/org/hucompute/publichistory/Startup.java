package org.hucompute.publichistory;

import org.apache.uima.UIMAException;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.jcas.JCas;
import org.hucompute.publichistory.datastore.typesystem.Person;
import org.hucompute.publichistory.datastore.typesystem.Time;

public class Startup {

	public static void main(String[] args) {
		try {
			JCas cas = JCasFactory.createJCas();
//			System.out.println(cas.getCas());

            Person p = new Person(cas);

            Time timeGeburt = new Time(cas);
            timeGeburt.setValue("10.01.1862");
            Time timeTod = new Time(cas);
            timeTod.setValue("04.10.1942");

            p.setValue("Gustav Hoch");
            p.setFirstName("Gustav");
            p.setLastName("Hoch");
            p.setBirthDate(timeGeburt);
            p.setDeathDate(timeTod);

            p.addToIndexes();


        } catch (UIMAException e) {
			e.printStackTrace();
		}
    }

}
