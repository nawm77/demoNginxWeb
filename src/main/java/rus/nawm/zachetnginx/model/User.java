package rus.nawm.zachetnginx.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private String id;
  private String name;
  private String lastname;
  private Integer age;
}
