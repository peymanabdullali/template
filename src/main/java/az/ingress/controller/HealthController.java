package az.ingress.controller;

import az.ingress.beans.B;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthController {
    private final B b;

    @GetMapping("/healthCheck")
    public ResponseEntity<String> checkHealthy() {
        return ResponseEntity.ok()
                .body("UP");
    }

    @GetMapping("/getBean")
    public ResponseEntity<String> getBean() {
        return ResponseEntity.ok()
                .body(b.print());
    }
}