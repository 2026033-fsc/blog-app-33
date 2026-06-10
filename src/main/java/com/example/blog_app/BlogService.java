package com.example.BlogService;

import java.util.List;
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

  public void register(BlogForm form) {
    blogRepository.save(new Blog(form.getTitle(), form.getPrice(), 0));
  }
}