package com.michalkubiak;

import com.michalkubiak.pageEditor.History;
import com.michalkubiak.pageEditor.ItalicCommand;
import com.michalkubiak.pageEditor.Page;
import com.michalkubiak.pageEditor.UndoCommand;

public class Main {

    public static void main(String[] args) {

        var history = new History();
        var page = new Page();

        page.setBody("New Body");

        // Command object which would be
        // linked to a button perhaps
        var italicCommand = new ItalicCommand(page, history);
        italicCommand.execute();
        // Check the page body
        System.out.println(page.getBody());

        // Checks history and undoes the <i> italic command
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(page.getBody());

    }
}
