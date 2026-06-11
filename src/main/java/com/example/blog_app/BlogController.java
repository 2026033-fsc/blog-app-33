package com.example.blog_app;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BlogController {
  private final BlogService blogService;

  BlogController(BlogService blogService) {
    this.blogService = blogService;
  }

  @GetMapping("/blogs")
  public String blogs(Model model) {
    List<Blog> blogs = blogService.findAll();
    model.addAttribute("blogs", blogs);
    return "blogs";
  }

  @GetMapping("/blogs/post")
     public String sample(@RequestParam String title, Model model) {
    model.addAttribute("title", title);
    return "blogs/post";
  }
  @GetMapping("/blog/ditail{id}")
  public String detail(@PathVariable Long id, Model model){
    Optional<Blog> blogOpt = blogService.findById(id);
    if (blogOpt.isEmpty()) {
    return "redirect:/blogs";
  }
  model.addAttribute("blog", blogOpt.get());
  return "blogs/detail";
  }
  @PostMapping("/blogs/post")
  public String postMethodName(@ModelAttribute Blogform form) {
      //TODO: process POST request
      blogService.register(form);
      return "blogs";
  }
  
}