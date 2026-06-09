package com.example.blog_app;

public class Blog {
  private final String title;
  private final boolean completed;

  public Blog(String title, boolean completed) {
    this.title = title;
    this.completed = completed;
  }

  public String getTitle() {
    return title;
  }
  public boolean GetCompleted(){
    return completed;
  }

}
