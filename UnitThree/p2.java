package UnitThree;
    
import java.util.Scanner;
/**
 * Write a description of class Project2 here.
 * 
 * @author (Saumik Narayanan) 
 * @version (11-12-14)
 */
public class p2
{

    public static void main() {
        //Define all variables
        double  height;
        double  weight;
        double  bmi;
        double  weightChange;
        double roundBmi;
        double roundWeightChange;

        final double LOW_NORMAL         = 18.5;
        final double LOW_OVERWEIGHT     = 25.0;
        final double LOW_OBESE          = 30.0;

        final double MIN_HEIGHT         = 20.0;
        final double MAX_HEIGHT         = 100.0;
        final double MIN_WEIGHT         = 20.0;
        final double MAX_WEIGHT         = 1250.0;

        final double METRIC_CONVERSION  = 703;

        Scanner stdin = new Scanner(System.in);
        
        System.out.println("Welcome to Ultimate BMI Calculator Plus, Mega Edition, brought to you by Saumik's Programming Studio!");
        System.out.println("At any time, you may enter 0 to close the program, or 1 to learn more about BMI");
        System.out.println("=====================================================================================================");
        while(true)
        {
            // Prompt for and read height (in)
            System.out.println("");
            System.out.print("Input your height in inches: ");
            height = stdin.nextDouble();
            //End program if 0 is entered
            if(height == 0.0)
            {
                break;
            }
            //print information about bmi if 1 is entered
            else if(height == 1)
            {
                System.out.println("\t|-------------------------------------------------------------------------------------------------------------|");
                System.out.println("\t| BMI, or Body-Mass Index, is a measure of relative height and weight that was developed in the 19th century  |");
                System.out.println("\t| There are four different categories of weight in the BMI system: Underweight, Normal, Overweight, and Obese |");
                System.out.println("\t|                                                                                                             |");
                System.out.println("\t|                                     Underweight: BMI between        0 - 18.4                                |");
                System.out.println("\t|                                     Normal:      BMI between     18.5 - 25.0                                |");
                System.out.println("\t|                                     Overweight:  BMI between     25.0 - 29.9                                |");
                System.out.println("\t|                                     Normal:      BMI between     30.0 +                                     |");
                System.out.println("\t|-------------------------------------------------------------------------------------------------------------|");
            }
            else
            {
                //Prompt for and read weight(lbs)
                System.out.print("Input your weight in pounds: ");
                weight = stdin.nextDouble();
                //End program if 0 is entered
                if(weight == 0.0)
                {
                    break;
                }
                //print information about bmi if 1 is entered
                else if(weight == 1)
                {
                    System.out.println("\t|-------------------------------------------------------------------------------------------------------------|");
                    System.out.println("\t| BMI, or Body-Mass Index, is a measure of relative height and weight that was developed in the 19th century  |");
                    System.out.println("\t| There are four different categories of weight in the BMI system: Underweight, Normal, Overweight, and Obese |");
                    System.out.println("\t|                                                                                                             |");
                    System.out.println("\t|                                     Underweight: BMI between        0 - 18.4                                |");
                    System.out.println("\t|                                     Normal:      BMI between     18.5 - 25.0                                |");
                    System.out.println("\t|                                     Overweight:  BMI between     25.0 - 29.9                                |");
                    System.out.println("\t|                                     Normal:      BMI between     30.0 +                                     |");
                    System.out.println("\t|-------------------------------------------------------------------------------------------------------------|");

                }

                // check if height and weight are reasonable, if not, print an error message
                else 
                {
                    if(height < MIN_HEIGHT)
                    {
                        System.out.println("Height entered is too low, please enter another height greater than 20.0 inches");
                    }
                    else if (height > MAX_HEIGHT)
                    {
                        System.out.println("Height entered is too high, please enter another height smaller than 100.0 inches");
                    }

                    if(weight < MIN_WEIGHT)
                    {
                        System.out.println("Weight entered is too low, please enter another weight greater than 20.0 pounds");
                    }
                    else if (weight > MAX_WEIGHT)
                    {
                        System.out.println("Weight entered is too high, please enter another weight smaller than 1250.0 pounds");
                    }
                }

                //if inputs are reasonable, calculate bmi and bmi category
                if (height >= MIN_HEIGHT && height <= MAX_HEIGHT && weight >= MIN_WEIGHT && weight <= MAX_WEIGHT)
                {
                    // calculate and print bmi
                    bmi         = weight * METRIC_CONVERSION / (height * height);
                    roundBmi    = (int)((bmi + 0.05) * 10.0) / 10.0;

                    System.out.print("According to the data entered, your BMI is " + roundBmi + " and ");

                    // if category is underweight, print category and amount of weight needed to be gained
                    if (roundBmi < LOW_NORMAL)
                    {
                        System.out.println("you are in the underweight category");
                        weightChange        = (LOW_NORMAL * height * height) / METRIC_CONVERSION - weight;
                        roundWeightChange   = (int)((weightChange + 0.05) * 10.0) / 10.0;

                        System.out.println("To go to the normal category, you must gain " + roundWeightChange + " pounds");
                    }
                    else 
                    {
                        // if category is normal, print category
                        if (roundBmi < LOW_OVERWEIGHT)
                        {
                            System.out.println("you are in the normal category.");
                        }
                        else 
                        {
                            // if overweight or obese, print category and amount of weight to be lost
                            if (roundBmi < LOW_OBESE)
                            {

                                System.out.println("you are in the overweight category");
                            }
                            else
                            {
                                System.out.println("you are in the obese category");
                            }
                            weightChange = weight - (LOW_OVERWEIGHT * height * height) / METRIC_CONVERSION;
                            roundWeightChange   = (int)((weightChange + 0.05) * 10.0) / 10.0;
                            System.out.println("To go to the normal category, you must lose " + roundWeightChange + " pounds");

                        }
                    }
                }
                System.out.println("-------------------------------------------------------------------------------------------------------");
            }
        }

        //ends program
        System.out.println("\n");
        System.out.println("Thanks for using our program to calculate your BMI!");
        System.out.println("Remember that BMI is not perfect, and may not be accurate for every person");
        System.out.println("To see where we got our information, visit http://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/index.html");
        return;

    }
}
