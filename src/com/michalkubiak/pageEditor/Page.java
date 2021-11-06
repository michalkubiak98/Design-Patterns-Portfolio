package com.michalkubiak.pageEditor;

public class Page {
  private String body;

  // Business Logic - Making some page content italic
  public void makeItalic() {
    body = "<i>" + body + "</i>";
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

}
