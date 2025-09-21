package com.gantognoli.service.notification;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody NotificationRequest request) {
        System.out.println(request.message() + " to " + request.email());
        return ResponseEntity.ok().build();
    }
}
