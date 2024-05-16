package rus.nawm.zachetnginx.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rus.nawm.zachetnginx.model.User;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
  @GetMapping("/all")
  public ResponseEntity<List<User>> getAllUsers() {
    return ResponseEntity.ok(List.of(User.builder()
                    .age(1)
                    .id(UUID.randomUUID().toString())
                    .name("Tom")
                    .lastname("Johnson")
                    .build(),
            User.builder()
                    .age(33)
                    .id(UUID.randomUUID().toString())
                    .name("Admin")
                    .lastname("Adminov")
                    .build()
    ));
  }
}
