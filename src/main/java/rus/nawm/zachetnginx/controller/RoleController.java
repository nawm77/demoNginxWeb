package rus.nawm.zachetnginx.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rus.nawm.zachetnginx.model.Role;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
  @GetMapping("/all")
  public ResponseEntity<List<Role>> getAllRoles() {
    return ResponseEntity.ok(List.of(
            Role.builder()
                    .name("Admin")
                    .description("Admin4ik serva4ka")
                    .id(UUID.randomUUID().toString())
                    .build(),
            Role.builder()
                    .name("User")
                    .description("Default user")
                    .id(UUID.randomUUID().toString())
                    .build()));
  }
}
