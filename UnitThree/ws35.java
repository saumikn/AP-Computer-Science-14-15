package UnitThree;

import java.util.Scanner;
/**
 * Write a description of class ws35 here.
 * 
 * @author (Saumik Narayanan) 
 * @version (11-17-14)
 */
public class ws35
{
    public static void main()
    {
        int     a;
        int     b;
        int     lowNum;
        int     hiNum;
        int     i;
        int     j;
        int     k;
        int     row;
        int     numRows = 10; 
        int     ex;
        int     space;
        
        long     c;
        long     l;

        Scanner stdin = new Scanner(System.in);

        // Problem 1
        System.out.println("Problem 1");
        System.out.println("Enter number 1");
        a = stdin.nextInt();
        System.out.println("Enter number 2");
        b = stdin.nextInt();
        if(a - b > 0)
        {
            lowNum  =   b;
            hiNum   =   a;
        }
        else if(a - b < 0)
        {
            lowNum  =   a;
            hiNum   =   b;
        }
        else
        {
            lowNum = a;
            hiNum = b;
        }
        System.out.println("The answer is: ");
        for( i = lowNum; i <= hiNum; i++)
        {
            if(i % 2 == 0)
                System.out.print(i + " ");
        }

        // Problem 2
        System.out.println();
        System.out.println();
        System.out.println("Problem 2");

        for(row = 1; row <= numRows; row++)
        {
            for(space = 0; space < row; space++)
            {
                System.out.print("O");
            }
            for(ex = numRows; ex >= row; ex--)
            {
                System.out.print("X");
            }
            System.out.println();
        }

        // Problem 3,4
        System.out.println();
        System.out.println("Problem 3");
        c = 1;
        while(c > 0)
        {
            c = stdin.nextInt();
            if(c > 0)
            {
                for(l = c - 1; l > 0; l--)
                    c = c * l;
                System.out.println(c);
                System.out.println();
                c = 1;
            }
            
        }

        // Problem 5
        // It starts being wrong at 13, and I can tell because the answer should be divisible by 100, but the number instead ends with a 04. I can change it by switching from an int to a long
        
    }
}
