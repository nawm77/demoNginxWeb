package rus.nawm.zachetnginx.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rus.nawm.zachetnginx.model.Role;
import rus.nawm.zachetnginx.service.RoleService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role")
@RequiredArgsConstructor
@Slf4j
public class RoleThymeleafController {
  private final RoleService roleService;
  @Value("${spring.application.name}")
  private String instanceName;

  @GetMapping("/all")
  public String getAllRoles(Model model, HttpServletRequest request) {
    List<Role> roles = roleService.getAllRoles();
    Map<String, String> headers = new HashMap<>();
    headers.put("Host", request.getHeader("Host"));
    headers.put("X-Real-IP", request.getHeader("X-Real-IP"));
    headers.put("X-Forwarded-For", request.getHeader("X-Forwarded-For"));
    headers.put("X-Forwarded-Proto", request.getHeader("X-Forwarded-Proto"));
    model.addAttribute("roles", roles);
    model.addAttribute("instanceName", instanceName);
    model.addAttribute("headers", headers);
    return "roles";
  }
}
