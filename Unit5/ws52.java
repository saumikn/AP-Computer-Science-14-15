package Unit5;

import java.util.Scanner;
/**
 * Write a description of class ws52 here.
 * 
 * @author Saumik Narayanan 
 * @version 1-21-15
 */
public class ws52
{
    public static void main()
    {
        String line = new String();
        String lineCopy = new String();
        String reverse = new String();
        String line2 = new String();
        String reverse2 = new String();

        Scanner stdin = new Scanner(System.in);

        //Problem 1
        System.out.println("Problem 1: Prints a copy of a line entered by a user.");
        System.out.print("Enter a word. ");
        line = stdin.nextLine();
        System.out.println(line + " has length " + line.length());
        System.out.println();
        System.out.println("====================");
        System.out.println();

        // Problem 2
        System.out.println("Problem 2: Puts Problem 1 in a while loop.");
        while(true)
        {
            System.out.print("Enter a word. Enter a null string to move on. ");
            line = stdin.nextLine();
            if(line.compareTo("") == 0)
            {
                break;
            }
            System.out.println(line + " has length " + line.length());
            System.out.println();
        }
        System.out.println();
        System.out.println("====================");
        System.out.println();

        // Problem 3
        System.out.println("Problem 3: Determines if word entered is a palindrome.");
        while(true)
        {
            System.out.print("Enter a word. Enter a null string to move on. ");
            line = stdin.nextLine();
            reverse = "";
            if(line.compareTo("") == 0)
            {
                break;
            }
            for(int i = line.length() - 1; i >= 0; i--)
            {
                reverse = reverse + line.charAt(i);
            }
            if(line.compareTo(reverse) == 0)
            {
                System.out.println(line + " is a palindrome");
            }
            else
            {
                System.out.println(line + " is not a palindrome");
            }
            System.out.println(line + " has length " + line.length());
            System.out.println();
        }
        System.out.println();
        System.out.println("====================");
        System.out.println();

        // Problem 4
        System.out.println("Problem 4: Determines is word is a palindrome. Not case sensitive.");
        while(true)
        {
            System.out.print("Enter a word. Enter a null string to move on. ");
            line = stdin.nextLine();
            reverse = "";
            if(line.compareTo("") == 0)
            {
                break;
            }
            lineCopy = line;
            line = line.toLowerCase();
            for(int i = line.length() - 1; i >= 0; i--)
            {
                reverse = reverse + line.charAt(i);
            }
            if(line.compareTo(reverse) == 0)
            {
                System.out.println(lineCopy + " is a palindrome");
            }
            else
            {
                System.out.println(lineCopy + " is not a palindrome");
            }
            System.out.println(lineCopy + " has length " + line.length());
            System.out.println();
        }
        System.out.println();
        System.out.println("====================");
        System.out.println();

        // Problem 5
        System.out.println("Problem 5: Determines if string entered is a palindrome. Non-alphabetical characters are ignored");
        while(true)
        {
            System.out.print("Enter a string. Enter a null string to move on. ");
            line = stdin.nextLine();
            line2 = "";
            reverse = "";
            if(line.compareTo("") == 0)
            {
                break;
            }
            lineCopy = line;
            line = line.toLowerCase();
            for(int i = 0; i < line.length(); i++)
            {
                if(line.charAt(i) >= 'a' && line.charAt(i) <= 'z')
                {
                    line2 = line2 + line.charAt(i);
                }
            }
            line = line2;
            for(int i = line.length() - 1; i >= 0; i--)
            {
                reverse = reverse + line.charAt(i);
            }
            if(line.compareTo(reverse) == 0)
            {
                System.out.println(lineCopy + " is a palindrome");
            }
            else
            {
                System.out.println(lineCopy + " is not a palindrome");
            }
            System.out.println(lineCopy + " which has length " + line.length());
            System.out.println();
        }
    }
}