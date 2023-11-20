package org.example;

public class StorageIsFullexception extends RuntimeException {
    public StorageIsFullexception() {
    }

    public StorageIsFullexception(String message) {
        super(message);
    }

    public StorageIsFullexception(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsFullexception(Throwable cause) {
        super(cause);
    }

    public StorageIsFullexception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
