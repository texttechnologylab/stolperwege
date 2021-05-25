package org.hucompute.publichistory.exception;

public class ParamNotExistException extends Exception {

    public ParamNotExistException() {
    }

    public ParamNotExistException(String pMessage) {
        super(pMessage);
    }

    public ParamNotExistException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public ParamNotExistException(Throwable pCause) {
        super(pCause);
    }

}
