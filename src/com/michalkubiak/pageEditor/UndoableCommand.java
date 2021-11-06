package com.michalkubiak.pageEditor;

public interface UndoableCommand extends Command {
  void unexecute();
}
