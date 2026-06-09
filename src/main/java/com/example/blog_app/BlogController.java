package com.example.blog_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class BlogController {
  @GetMapping("/blogs/post")
  public String sample(Model model) {
    model.addAttribute("title", "ポラノーイの広場");
    return "blogs/post";
  }
}