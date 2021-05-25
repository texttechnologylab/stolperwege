package org.hucompute.publichistory.exception;

public class UserAlreadyLoggedInException extends Exception {

    public UserAlreadyLoggedInException() {
    }

    public UserAlreadyLoggedInException(String pMessage) {
        super(pMessage);
    }

    public UserAlreadyLoggedInException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public UserAlreadyLoggedInException(Throwable pCause) {
        super(pCause);
    }

}
