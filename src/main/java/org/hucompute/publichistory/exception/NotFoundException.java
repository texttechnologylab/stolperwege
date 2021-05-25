package org.hucompute.publichistory.exception;

public class NotFoundException extends Exception {

    public NotFoundException() {
    }

    public NotFoundException(String pMessage) {
        super(pMessage);
    }

    public NotFoundException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public NotFoundException(Throwable pCause) {
        super(pCause);
    }

}
