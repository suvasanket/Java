package exceptions;

import java.beans.ExceptionListener;

public class ageexception extends Exception {
    String msg;

    ageexception(String msg) {
        this.msg= msg;
    }

    
}
