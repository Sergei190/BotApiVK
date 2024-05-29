package com.example.sergei.service;

/**
 * Simple message sender service which allow send messages
 *
 * @param <T> message data transfer object
 * @author Sergei Kudryashov
 * @since 1.0
 */
public interface MessageSenderService<T> {
    /**
     * Send message
     *
     * @param message data transfer object contains message
     */
    void send(T message);

}