package Unit4;

import java.util.Scanner;
/**
 * Write a description of class ws44 here.
 * 
 * @author (Saumik Narayanan) 
 * @version (12-10-2014)
 */
public class ws44
{
    public static void main()
    {
        Scanner stdin = new Scanner(System.in);
        double a;
        //Problem 1
        for(int i = 0; i < 10; i++)
        {
            a = Math.random();
            System.out.println(a);
        }
        System.out.println();
        
        //Problem 2
        for(int i = 0; i < 10; i++)
        {
            a = (int)(Math.random() * 101);
            System.out.println(a);
        }
        System.out.println();
        
        //Problem 3
        System.out.println("Enter a string");
        String b = stdin.next();
        System.out.println(b);
        System.out.println();
        
        //Problem 4
        System.out.println("Enter a string");
        b = stdin.next();
        if(b.compareTo("goodbye") == 0)
            System.out.println("You say goodbye and I say hello!");
        else
            System.out.println("Hello, hello!");
        System.out.println();
        
        //Problem 5
        while(true)
        {
            a = (int)(Math.random() * 1000);
            System.out.println(a);
            System.out.println("Enter \"yes\" to see another random whole from 0 to 1000, or enter anything else to exit");
            String c = stdin.next();
            
            if(c.compareTo("yes") != 0)
                break;
            
            System.out.println();
        }

    }
}
