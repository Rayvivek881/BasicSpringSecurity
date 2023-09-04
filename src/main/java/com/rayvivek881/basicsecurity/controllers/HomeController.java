package com.rayvivek881.basicsecurity.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

  @GetMapping
  public String Home() {
    System.out.println(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    return "Welcome to the Basic Security home page";
  }
}
