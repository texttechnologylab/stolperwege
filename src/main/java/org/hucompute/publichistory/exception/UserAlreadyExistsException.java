package org.hucompute.publichistory.exception;

public class UserAlreadyExistsException extends Exception {

    public UserAlreadyExistsException() {
    }

    public UserAlreadyExistsException(String pMessage) {
        super(pMessage);
    }

    public UserAlreadyExistsException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public UserAlreadyExistsException(Throwable pCause) {
        super(pCause);
    }

}
