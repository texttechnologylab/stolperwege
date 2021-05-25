package org.hucompute.publichistory.exception;

public class InvalidDataException extends Exception {

    public InvalidDataException() {
    }

    public InvalidDataException(String pMessage) {
        super(pMessage);
    }

    public InvalidDataException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public InvalidDataException(Throwable pCause) {
        super(pCause);
    }

}
