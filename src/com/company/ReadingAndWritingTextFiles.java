package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadingAndWritingTextFiles
{
    // The throws command makes sure to end the program if the FileNotFoundException happens anytime in the program.
    public void ReadingAndWritingTextFiles() throws FileNotFoundException
    {
        // Has set in/out file destinations.
        String inputFileName = "E:\\exampleinput.txt";
        String outputFileName = "E:\\exampleoutput.txt";

        // Prompts user for the input and output file names.
//        Scanner console = new Scanner(System.in);
//        System.out.println("input file: ");
//        String inputFileName = console.next();
//        System.out.println("output file: ");
//        String outputFileName = console.next();

        // Construct the scanner and PrintWriter objects for reading and writing.
        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);

        // Reads the input and writes the output
        double total = 0;

        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            out.printf("%8.2f%n", value);
            total = total + value;
        }
        out.printf("Total: %8.2f%n", total);

        // Remember to close the scanner and printwriter, otherwise some output may be missing.
        in.close();
        out.close();
    }
}
