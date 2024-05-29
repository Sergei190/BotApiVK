package com.example.sergei.exeption;

/**
 * Thrown to indicate exception in {@code MessageSenderService}
 *
 * @author Sergei Kudryashov
 * @since 1.0
 */
public class MessageSenderException extends RuntimeException {
    public MessageSenderException(String message) {
        super(message);
    }

    public MessageSenderException(Throwable cause) {
        super(cause);
    }

}