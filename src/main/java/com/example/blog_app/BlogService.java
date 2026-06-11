package com.example.blog_app;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class BlogService {
  private final BlogRepository blogRepository;

  public BlogService(BlogRepository bookRepository) {
    this.blogRepository = bookRepository;
  }

  public List<Blog> findAll() {
    return blogRepository.findAll();
  }

  public Optional<Blog> findById(Long id){
    return blogRepository.findById(id);
  }

  public void register(Blogform form) {
    blogRepository.save(new Blog(form.getTitle(), form.getText(), 0));
  }
}