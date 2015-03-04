package UnitThree;
 
/**
 * Write a description of class ws34 here.
 * 
 * @author (Saumik Narayanan) 
 * @version (11-13-2014)
 */
public class ws34
{
    public static void main()
    {
        int i;
        int squareI;
        int j;
        
        // Problem 1
        System.out.println("Problem 1");
        for(i = 1; i < 11; i++)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();
        
        // Problem 2
        System.out.println("Problem 2");
        for(i = 1; i < 100; i++)
            if(i % 7 == 0)
                System.out.print(i + " ");
        System.out.println();
        System.out.println();
        
        // Problem 3
        System.out.println("Problem 3");
        for(i = 7; i < 100; i = i + 7)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        for(i = 10; i >= 0; i--)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();

        // Problem 5
        System.out.println("Problem 5");
        for(i = 1; i < 13; i++)
        {
            squareI = i * i;
            System.out.println(i + " " + squareI);
        }        
        System.out.println();
        
        // Problem 6
        System.out.println("Problem 6");       
        for(i = 10; i >= 0; i--)
        {
            for(j = 0; j < i; j++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}