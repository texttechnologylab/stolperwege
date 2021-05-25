package org.hucompute.publichistory.exception;

/**
 * Created by Lucho on 19.07.2016.
 */
public class StolpersteinExistsException extends Exception{

    public StolpersteinExistsException(){
    }
    public StolpersteinExistsException(String pMessage) {
        super(pMessage);
    }

    public StolpersteinExistsException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public StolpersteinExistsException(Throwable pCause) {
        super(pCause);
    }
}
