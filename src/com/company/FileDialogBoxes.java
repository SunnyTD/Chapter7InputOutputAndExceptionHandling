package com.company;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDialogBoxes
{
    public void FileDialogBoxes() throws FileNotFoundException
    {
        JFileChooser chooser = new JFileChooser();
        Scanner in = null;
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = chooser.getSelectedFile();
            in = new Scanner(selectedFile);
            // Next lines are more specific code for UI
            int lineNumber = 1;
            final int MAX_LINES = 9;
            while (in.hasNextLine() && lineNumber <= MAX_LINES)
            {
                String line = in.nextLine();
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
            if (in.hasNextLine())
            {
                System.out.println("...");
            }

            in.close();
        }
    }
}
