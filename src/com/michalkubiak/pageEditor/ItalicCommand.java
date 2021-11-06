package com.michalkubiak.pageEditor;

// This is a command which can be undoable so it implements UndoableCommand
public class ItalicCommand implements UndoableCommand {

  private String previousBody;
  private Page page;
  private History history;

  public ItalicCommand(Page page, History history) {
    this.page = page;
    this.history = history;
  }

  @Override
  public void execute() {
    previousBody = page.getBody();
    page.makeItalic();
    history.push(this);
  }
  @Override
  public void unexecute() {
    page.setBody(previousBody);
  }


}
