package org.hucompute.publichistory.exception;

public class LoginNotValidDataException extends Exception {

    public LoginNotValidDataException() {
    }

    public LoginNotValidDataException(String pMessage) {
        super(pMessage);
    }

    public LoginNotValidDataException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public LoginNotValidDataException(Throwable pCause) {
        super(pCause);
    }

}
