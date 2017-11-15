package com.company;

import java.io.FileNotFoundException;

public class ATableOfContents
{
    // The throws command makes sure to end the program if the FileNotFoundException happens anytime in the program.
    public static void main(String[] args) throws FileNotFoundException
    {
        // <editor-fold desc = "Array and Class Initialization"\

        // Initializing the classes into the main class
//        ReadingAndWritingTextFiles one = new ReadingAndWritingTextFiles();
//        FileDialogBoxes two = new FileDialogBoxes();
//        TextInputAndOutput three = new TextInputAndOutput();
//        ReadingCharacters four = new ReadingCharacters();
        ReadingLines five = new ReadingLines();
        ConvertingStringsToNumbers six = new ConvertingStringsToNumbers();

        // Calling the methods (notes) in the called classes above into this one. (to be ran/executed).
//        one.ReadingAndWritingTextFiles();
//        two.FileDialogBoxes();
//        three.TextInputAndOutput();
//        four.ReadingCharacters();
//        five.ReadingLines();
        six.ConvertingStringsToNumbers();

        // </editor-fold

        // <editor-fold desc = "Table of Contents"

        /*
        7.1: Reading and writing text files
        7.2 Special Topic: File dialog boxes
        7.2: Text input and output
        7.2.2: Reading characters
        7.2.4: Reading lines
        7.2.6: Converting strings to numbers
        ~7.2.7: Avoiding errors when reading numbers
        ~7.2.8: Mixing Number, word, and line input
        ~7.2.9: Formatting output
        ~ = Not listed
         */

        // </editor-fold
    }
}
