package org.hucompute.publichistory.exception;

/**
 * Created by Lucho on 19.07.2016.
 */
public class PersonExistsException extends Exception{

    public PersonExistsException(){
    }
    public PersonExistsException(String pMessage) {
        super(pMessage);
    }

    public PersonExistsException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public PersonExistsException(Throwable pCause) {
        super(pCause);
    }
}
