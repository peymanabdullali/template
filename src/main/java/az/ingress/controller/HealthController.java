package az.ingress.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/healthCheck")
    public ResponseEntity<String> checkHealthy() {
        return ResponseEntity.ok()
                .body("UP");
    }
}