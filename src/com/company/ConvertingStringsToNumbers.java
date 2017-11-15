package com.company;

public class ConvertingStringsToNumbers
{
    public void ConvertingStringsToNumbers()
    {
//        ReadingLines ReadingLines = new ReadingLines();
//        ReadingLines.ReadLineCountryDigit();
        String population = String.valueOf(303824646);
        // The trim() is very important; no characters, including spaces, can be allowed in the called string with
        // int value.
        int populationValue = Integer.parseInt(population.trim());
        String input = String.valueOf(3.95);
        double price = Double.parseDouble(input.trim());
        System.out.println(populationValue);
        System.out.println(price);
    }
}
