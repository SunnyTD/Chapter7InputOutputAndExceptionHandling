package com.company;

import java.util.Scanner;

public class ReadingLines
{
    public void ReadingLines()
    {
        // reads entire lines, instead of stopping when a white space happens.
//        Scanner in = new Scanner(System.in);
//
//        while (in.hasNextLine())
//        {
//            String line = in.nextLine();
//            int i = 0;
//            // Finds the start of the first digit in the example in the book.(Format example: United States 303824646)
//            while (!Character.isDigit(line.charAt(i)))
//            {
//                i++;
//            }
//            // Prints from the first char to just before i. (i = first #)
//            String countryName = line.substring(0, i);
//            // Prints from i until white space.
//            String population = line.substring(i);
//            countryName = countryName.trim();
//            System.out.println(countryName);
//            System.out.println(population);
//            return;
//        }
        // Alternate method: Read characters from a string. (7.2.5: Scanning a String)
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Scanner lineScanner = new Scanner(line);
        // Reads the first word
        String countryName = lineScanner.next();

        // Adds more words to countryName until a number is encountered.
        while (!lineScanner.hasNextInt())
        {
            countryName = countryName + " " + lineScanner.next();
        }
        int populationValue = lineScanner.nextInt();
        System.out.println(countryName);
        System.out.println(populationValue);
    }

    // Used in 7.2.6: Converting strings to numbers
    // Does not work; can't return an answer for some reason.
    public void ReadLineCountryDigit()
    {
        System.out.println("Enter the Country name and #: ");
        Scanner in = new Scanner(System.in);
        String countryName = "";
        String population = "";

        while (in.hasNextLine())
        {
            String line = in.nextLine();
            int i = 0;
            // Finds the start of the first digit in the example in the book. (Format example: United States 303824646)
            while (!Character.isDigit(line.charAt(i)))
            {
                i++;
            }
            // Prints from the first char to just before i. (i = first #)
            countryName = line.substring(0, i);
            // Prints from i until white space.
            population = line.substring(i);
            countryName = countryName.trim();
//            System.out.println(countryName);
//            System.out.println(population);
        }
    }
}
