package org.hucompute.publichistory.exception;

public class MoreThanOneRelationException extends Exception {

    public MoreThanOneRelationException() {
    }

    public MoreThanOneRelationException(String pMessage) {
        super(pMessage);
    }

    public MoreThanOneRelationException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public MoreThanOneRelationException(Throwable pCause) {
        super(pCause);
    }

}
