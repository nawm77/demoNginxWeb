package rus.nawm.zachetnginx.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rus.nawm.zachetnginx.model.Role;
import rus.nawm.zachetnginx.service.RoleService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/role")
@RequiredArgsConstructor
public class RoleController {
  private final RoleService roleService;
  @GetMapping("/all")
  public ResponseEntity<List<Role>> getAllRoles() {
    return ResponseEntity.ok(roleService.getRoles());
  }
}
