package org.example;

public class ElementNotFoundExceptios extends RuntimeException {
    public ElementNotFoundExceptios() {
    }

    public ElementNotFoundExceptios(String message) {
        super(message);
    }

    public ElementNotFoundExceptios(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotFoundExceptios(Throwable cause) {
        super(cause);
    }

    public ElementNotFoundExceptios(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
