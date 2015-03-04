package Unit4;

import java.util.Scanner;
/**
 * Write a description of class ws45 here.
 * 
 * @author (Saumik Narayanan) 
 * @version (12-11-14)
 */
public class ws45
{
    public static void main()
    {
        while(true)
        {
            System.out.println("Enter the number of times you want to roll the die");
            Scanner stdin = new Scanner(System.in);
            int a = stdin.nextInt();

            if(a < 1)
            {
                System.out.println("Zero or negative number entered, this game is over");
                return;
            }

            for(int i = 0; i < a; i++)
            {
                int b = rollDie();
                System.out.print(b + " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static int rollDie()
    {
        int a = (int)(Math.random() * 6) + 1;
        return a;
    }
}
