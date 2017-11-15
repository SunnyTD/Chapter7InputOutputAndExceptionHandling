package com.company;

import java.util.Scanner;

public class TextInputAndOutput
{
    public void TextInputAndOutput()
    {
        // Reads only the letters in the given set of characters in the "" enclosure.
        Scanner in = new Scanner(System.in);
        // See: 7.4 Special Topic for the use delimiter character pattern.
        in.useDelimiter("[^A-Za-z]+");
        System.out.println(in.next());
    }
}
