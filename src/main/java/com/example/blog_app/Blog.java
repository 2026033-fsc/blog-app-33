package com.example.blog_app;

public class Blog {
  private final String title;
  private final String notes;
  private final long id;

  public Blog(String title, String notes, long id) {
    this.title = title;
    this.notes = notes;
    this.id = id;
  }

  public String getTitle() {
    return title;
  }
  public String getNotes(){
    return notes;
  }
  public long getId() {
      return id;
  }
}
