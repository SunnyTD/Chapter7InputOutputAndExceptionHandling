package com.company;

import java.util.Scanner;

public class ReadingCharacters
{
    public void ReadingCharacters()
    {
        // Reads characters one at a time.
        Scanner in = new Scanner(System.in);
        String input = in.next();
        in.useDelimiter("");
        // Kills the program if the user enters the text input: "end". (Without the quotations or period)
        if (input.contentEquals("end"))
        {
            in.close();
            return;
        }
        while (in.hasNext())
        {
            char ch = in.next().charAt(0);
//            Process ch.
            System.out.println(ch);
        }
    }
}
