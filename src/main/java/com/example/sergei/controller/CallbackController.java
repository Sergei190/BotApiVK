package com.example.sergei.controller;

import com.example.sergei.dto.CallbackDto;
import com.example.sergei.service.CallbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller for VK API requests
 *
 * @author Sergei Kudryashov
 * @since 1.0
 */
@Controller
@RequestMapping(value = "/callbacks")
@RequiredArgsConstructor
public class CallbackController {

    private final CallbackService callbackService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> handleCallback(@RequestBody CallbackDto callbackDto) {
        return new ResponseEntity<>(callbackService.handleCallback(callbackDto), HttpStatus.OK);
    }

}