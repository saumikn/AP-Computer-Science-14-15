package UnitThree;

import java.util.Scanner;
/**
 * Write a description of class ws33 here.
 * 
 * @author (Saumik Narayanan) 
 * @version (10-30-14)
 */
public class ws33
{

    public static void main() {
        //Problem 1
        Scanner stdin =  new Scanner(System.in);

        int input = 1;
        int output = 0;
        int numberNegative = 0;
        int numberPositive = 0;
        

        
        while (input != 0)
        {
            System.out.print("Input an integer ");
            input = stdin.nextInt();
        
            if (input > 0)
            {
                output = ((input + 5) / 10) * 10;
                numberPositive = numberPositive++;
            }
            else if (input < 0)
            {
                output = -input;
                numberNegative = numberNegative++;
            }
            else
            {
                System.out.println("The number of positives entered is: " + numberPositive + "The number of negatives entered is: " + numberNegative);
                return;
            }
            System.out.println( "Input is: " + input + ", Output is: " + output + "\n");
            
        
        }

    }
}
