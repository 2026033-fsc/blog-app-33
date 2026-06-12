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

  public Optional<Blog> findById(Long id) {
    return blogRepository.findById(id);
  }

  public void register(Blogform form) {
    blogRepository.save(new Blog(null, form.getTitle(), form.getText()));
  }

  public void add(Blogform form) {
    if (form.getTitle() == null) {
      throw new IllegalArgumentException("タイトルが空です");
    }
    if (form.getText() == null) {
      throw new IllegalArgumentException("本文が空です");
    }
    blogRepository.save(new Blog(null, form.getTitle(), form.getText()));
  }
}