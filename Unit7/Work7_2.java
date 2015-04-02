package Unit7;

/**
 * This class creates two randomized arrays, 
 * and sorts them increasing and decreasing, respectively
 * 
 * @author Saumik Narayanan
 * @version 3/30/15
 */
public class Work7_2
{
    /**
     * This method completes the worksheet on the
     * Eagan High School AP Computer Science website
     */
    
    public static void main()
    {
        int length = 16;
        int[] a = randomArray(length);
        printArray(a);        
        sortBubbleUp(a);
        printArray(a);
        System.out.println();
        
        a = randomArray(length);
        printArray(a);
        sortBubbleDown(a);
        printArray(a);
        System.out.println();
        
        a = randomArray(length);
        printArray(a);
        sortSelectionUp(a);
        printArray(a);
        System.out.println();
        
        a = randomArray(length);
        printArray(a);
        sortSelectionDown(a);
        printArray(a);
        System.out.println();
        

    }
    
    /**
     * This methods sorts an array ascending using a selection sort
     * @param a The array to be sorted
     * @return The sorted array
     */
    public static int[] sortSelectionUp(int[] a)
    {
        int tmp;
        int min;
        
        for(int j = 0; j < a.length - 1; j++)
        {
            min = j;
            for(int i = j + 1; i < a.length; i++)
            {
                if(a[i] < a[min])
                {
                    min = i;
                }
            }
            tmp = a[min];
            a[min] = a[j];
            a[j] = tmp;
            
        }
        return a;
    }
    
    /**
     * This methods sorts an array descending using a selection sort
     * @param a The array to be sorted
     * @return The sorted array
     */
    public static int[] sortSelectionDown(int[] a)
    {
        int tmp;
        int max;
        
        for(int j = 0; j < a.length - 1; j++)
        {
            max = j;
            for(int i = j + 1; i < a.length; i++)
            {
                if(a[i] > a[max])
                {
                    max = i;
                }
            }
            tmp = a[max];
            a[max] = a[j];
            a[j] = tmp;
            
        }
        return a;
    }
    
    /**
     * This methods sorts an array ascending using a bubble sort
     * @param a The array to be sorted
     * @return The sorted array
     */
    public static int[] sortBubbleUp(int[] a)
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
     * This methods sorts an array descending using a bubble sort
     * @param a The array to be sorted
     * @return The sorted array
     */
    public static int[] sortBubbleDown(int[] a)
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
    public static void printArray(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * This methods creates a randomized array
     * @param size  The length of the randomized array
     * @return The randomized array
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
     * This methods creates a randomized number
     * @param a The number of possible values that the method can return
     * @return The random number
     */
    public static int randomInt(int number)
    {
        int random = (int)(number * Math.random());
        return random;
    }
}
