package org.hucompute.publichistory.exception;

public class InvalidUserDataException extends Exception {

    public InvalidUserDataException() {
    }

    public InvalidUserDataException(String pMessage) {
        super(pMessage);
    }

    public InvalidUserDataException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public InvalidUserDataException(Throwable pCause) {
        super(pCause);
    }

}

