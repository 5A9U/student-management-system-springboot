package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {
  // handler method to handle list students and return mode and view
  @GetMapping("/hello")
  public String getHello(Model model) {
    model.addAttribute("hello", "Hello @TimeFormat !");
    return "hello";
  }
}
