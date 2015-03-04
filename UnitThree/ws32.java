package UnitThree;

import java.util.Scanner;

/**
 * Write a description of class ws32 here.
 * 
 * @author Saumik Narayanan
 * @version 10-24-14
 */
public class ws32
{
   
    public static void main() {
        
        //Problem 1
        Scanner stdin = new Scanner(System.in);
        
        int intFarTemp;
        int intCelTemp;
        double douFarTemp;
        double douCelTemp;
        
        System.out.print("Enter a temperature in Fahrenheit -> ");
        intFarTemp = stdin.nextInt();
        
        intFarTemp = (intFarTemp - 32) * 5 / 9;
        System.out.println("Celcius = " + intFarTemp);
        
        //Problem 2
        System.out.print("Enter a temperature in Celcius -> ");
        intCelTemp = stdin.nextInt();
              
        intCelTemp = (intCelTemp * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + intCelTemp);
        
        //Problem 3
        System.out.print("Enter a temperature in Fahrenheit -> ");
        douFarTemp = stdin.nextDouble();
        
        douFarTemp = (douFarTemp - 32) * 5 / 9;
        System.out.println("Celcius = " + douFarTemp);
        
        //Problem 2
        System.out.print("Enter a temperature in Celcius -> ");
        douCelTemp = stdin.nextDouble();
              
        douCelTemp = (douCelTemp * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + douCelTemp);
                
        //Problem 5
        /*They produce different results because int and double are data types, so they compute arithmitic differently. 
        For integers, when computing math, if an operation returns a non-whole number, the number is truncated into a
        whole number which can possibly change the answer, but math with doubles don't truncate after operations, so the
        math is more accurate, but is gives a different answer.
        */
        
    }

}
