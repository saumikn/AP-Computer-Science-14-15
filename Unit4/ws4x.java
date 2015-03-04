package Unit4;

import java.util.Scanner;
/**
 * Write a description of class ws4x here.
 * 
 * @author Saumik Narayanan 
 * @version 1-5-15
 */
public class ws4x
{
    public static void main()
    {
        Scanner stdin = new Scanner(System.in);
        
        int x;
        while(true)
        {
            System.out.println("Enter a year");
            x = stdin.nextInt();
            if(x == 0)
            {
                System.out.println("Exiting...");
                return;
            }
            if(leapyear(x))
            {
                System.out.println(x + " is a leap year");
            }
            else
            {
                System.out.println(x + " is not a leap year");
            }
            System.out.println("---------------------------------");
        }
    }

    public static boolean leapyear(int a)
    {
        return a % 4 == 0;
    }
}