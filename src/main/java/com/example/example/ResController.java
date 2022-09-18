package com.example.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResController {

    @GetMapping("/")
    public ResponseEntity<?> todo(){
        String message = "Hello";

        return ResponseEntity.ok(message);
    }
}
