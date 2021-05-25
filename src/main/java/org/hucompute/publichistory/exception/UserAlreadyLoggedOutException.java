package org.hucompute.publichistory.exception;

public class UserAlreadyLoggedOutException extends Exception {

    public UserAlreadyLoggedOutException() {
    }

    public UserAlreadyLoggedOutException(String pMessage) {
        super(pMessage);
    }

    public UserAlreadyLoggedOutException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public UserAlreadyLoggedOutException(Throwable pCause) {
        super(pCause);
    }

}
