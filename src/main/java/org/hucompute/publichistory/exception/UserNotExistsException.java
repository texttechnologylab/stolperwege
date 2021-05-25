package org.hucompute.publichistory.exception;

public class UserNotExistsException extends Exception {

    public UserNotExistsException() {
    }

    public UserNotExistsException(String pMessage) {
        super(pMessage);
    }

    public UserNotExistsException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public UserNotExistsException(Throwable pCause) {
        super(pCause);
    }

}
