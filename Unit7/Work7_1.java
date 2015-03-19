package Unit7;

/**
 * This class creates two randomized arrays, 
 * and sorts them increasing and decreasing, respectively
 * 
 * @author Saumik Narayanan
 * @version 3/17/15
 */
public class Work7_1
{
    /**
     * This method creates a randomized array, sorts it ascending,
     * re-randomizes the array, and sorts it descending
     */
    
    public static void main()
    {
        int length = 16;
        int[] a = randomArray(length);
        
        printArray(a);
        sortArrayUp(a);
        printArray(a);
        System.out.println();
        
        a = randomArray(length);
        printArray(a);
        sortArrayDown(a);
        printArray(a);
        System.out.println();
        
        

    }
    
    /**
     * This methods prints an array
     * @param a The array to be printed
     */
    public static void printArray(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * This methods prints an array
     * @param a The array to be printed
     */
    public static int[] sortArrayUp(int[] a)
    {
        for(int pass = 0; pass < a.length; pass++)
        {
            for(int i = 0; i < a.length - 1; i++)
            {
                if(a[i] > a[i+1])
                {
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }
        }
        return a;
    }
    
    /**
     * This methods prints an array
     * @param a The array to be printed
     */
    public static int[] sortArrayDown(int[] a)
    {
        for(int pass = 0; pass < a.length; pass++)
        {
            for(int i = 0; i < a.length - 1; i++)
            {
                if(a[i] < a[i+1])
                {
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }
        }
        return a;
    }

    /**
     * This methods prints an array
     * @param a The array to be printed
     */
    public static int[] randomArray(int size)
    {
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = randomInt(100);
        }
        return array;
    }

    /**
     * This methods prints an array
     * @param a The array to be printed
     */
    public static int randomInt(int number)
    {
        int random = (int)(number * Math.random());
        return random;
    }
}
