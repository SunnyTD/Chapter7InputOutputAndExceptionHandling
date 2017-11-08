package com.company;

import java.io.FileNotFoundException;

public class ATableOfContents
{
    // The throws command makes sure to end the program if the FileNotFoundException happens anytime in the program.
    public static void main(String[] args) throws FileNotFoundException
    {
        // <editor-fold desc = "Array and Class Initialization"\

        // Initializing the classes into the main class
        ReadingAndWritingTextFiles one = new ReadingAndWritingTextFiles();

        // Calling the methods (notes) in the called classes above into this one. (to be ran/executed).
        one.Readingandwritingtextfiles();

        // </editor-fold

        // <editor-fold desc = "Table of Contents"

        /*
        7.1: Reading and writing text files
         */

        // </editor-fold
    }
}
