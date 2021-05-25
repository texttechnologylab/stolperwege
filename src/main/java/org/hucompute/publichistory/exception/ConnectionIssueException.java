package org.hucompute.publichistory.exception;

/**
 * Created by Lucho on 19.07.2016.
 */
public class ConnectionIssueException extends Exception {

    public ConnectionIssueException() {
    }

    public ConnectionIssueException(String pMessage) {
        super(pMessage);
    }

    public ConnectionIssueException(String pMessage, Throwable pCause) {
        super(pMessage, pCause);
    }

    public ConnectionIssueException(Throwable pCause) {
        super(pCause);
    }

}