package rus.nawm.zachetnginx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/app/health")
public class HealthCheckController {
  @Value("${spring.application.name}")
  private String instanceName;

  @GetMapping("")
  public ResponseEntity<?> getHealthCheck() {
    return ResponseEntity.ok(Map.of("app", instanceName, "status", "UP"));
  }
}
