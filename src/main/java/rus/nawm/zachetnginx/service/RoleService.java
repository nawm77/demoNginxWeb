package rus.nawm.zachetnginx.service;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Service;
import rus.nawm.zachetnginx.model.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Data
public class RoleService {
  private final List<Role> roles = new ArrayList<>();

  @PostConstruct
  private void init() {
    roles.addAll(List.of(
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

  public List<Role> getAllRoles(){
    return this.roles;
  }
}
