package Unit5;


/**
 * ws56 tests students on how to use for loops and for-each loops
 * 
 * @author Saumik Narayanan 
 * @version 2-20-15
 */
public class ws56
{
    /**
     * This method solves the problems defined in worksheet 5-6
     *
     */
    public static void main()
    {
        // Problem 2        
        final int INT_SIZE = 53;
        final double DBL_SIZE = 99;
        int intCount = 0;
        int dblCount = 0;
        int[] intArray = new int[INT_SIZE];
        double[] dblArray = new double[(int)DBL_SIZE];
        
        // Problem 3
        for(int i = 0; i < intArray.length; i++)
        {
            intArray[i] = randomInt();
        }
        for(int i = 0; i < dblArray.length; i++)
        {
            dblArray[i] = randomDouble();
        }
        
        for(int i = 0; i < intArray.length; i++)
        {
            if(intArray[i] % 2 == 0)
            {
                intCount++;
            }
        }
        System.out.println(intCount);
        intCount = 0;
        for(int i : intArray)
        {
            if(i % 2 == 0)
            {
                intCount++;
            }
        }
        System.out.println(intCount);
        System.out.println();
        // Problem 5
        for(int i = 0; i < dblArray.length; i++)
        {
            if(dblArray[i] >= 500 && dblArray[i] <= 600)
            {
                dblCount++;
            }
        }
        System.out.println(dblCount);
        dblCount = 0;
        for(double i : dblArray)
        {
            if(i >= 500 && i <= 600)
            {
                dblCount++;
            }
        }
        System.out.println(dblCount);
        System.out.println();
        
        for(int i : intArray)
        {
            i = randomInt();
        }
        
        for(int i : intArray)
        {
            System.out.println(i);
        }
    }
    
    // Problem 1
    /**
     * This method calculates a random integer between 0 and 99
     * 
     * @return  An integer between 0 and 99
     */
    static int randomInt()
    {
        int random6 = (int)(99 * Math.random() + 1);
        return random6;
    }
    
    /**
     * This method calculates a random double between 0 and 1000
     * 
     * @return  An double between 0 and 1000
     */
    static double randomDouble()
    {
        double random1000 = ((int)(10000 * Math.random() + 1)) / 10.;
        return random1000;
    }
}
