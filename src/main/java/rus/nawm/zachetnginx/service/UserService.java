package rus.nawm.zachetnginx.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import rus.nawm.zachetnginx.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
  private final List<User> users = new ArrayList<>();

  @PostConstruct
  private void init() {
    users.addAll(List.of(User.builder()
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
  public List<User> getAllUsers() {
    return users;
  }
}
