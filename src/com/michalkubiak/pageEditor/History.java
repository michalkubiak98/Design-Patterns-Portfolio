package com.michalkubiak.pageEditor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

  // Short for double que - it allows adding of objects
  // from both front and the end of the list
  private Deque<UndoableCommand> commands = new ArrayDeque<>();

  // Takes an undoable command and adds it to the list
  public void push(UndoableCommand command) {
    commands.add(command);
  }

  public UndoableCommand pop() {
    // Return the current pop
    return commands.pop();
  }

  public int size() {
    return commands.size();
  }
}
