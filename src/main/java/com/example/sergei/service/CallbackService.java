package com.example.sergei.service;

import com.example.sergei.dto.CallbackDto;

/**
 * Service designed to handle callback requests from VK API
 *
 * @author Sergei Kudryashov
 * @since 1.0
 */
public interface CallbackService {
    /**
     * Returns response needed by VK API
     *
     * @param callbackDto deserialized callback from request
     * @return string for {@code ResponseEntity}
     */
    String handleCallback(CallbackDto callbackDto);

}