package com.rayvivek881.basicsecurity.controllers;

import com.rayvivek881.basicsecurity.documents.User;
import com.rayvivek881.basicsecurity.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

  private final UserServices userServices;

  @GetMapping
  public String Home() {
    return "Welcome to the Basic Security home page";
  }

  @PostMapping
  public User create(@RequestBody User user) {
    return userServices.save(user);
  }

  @GetMapping("/all")
  public List<User> findAll() {
    return userServices.findAll();
  }
}
