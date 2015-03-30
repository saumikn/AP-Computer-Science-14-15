package Unit7;

/**
 * This class creates two randomized arrays, 
 * and sorts them increasing and decreasing, respectively
 * 
 * @author Saumik Narayanan
 * @version 3/29/15
 */
public class Work7_2
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
        sortBubbleUp(a);
        printArray(a);
        sortBubbleDown(a);
        printArray(a);
        

    }
    
    /**
     * This methods sorts an array descending
     * @param a The array to be sorted
     */
    public static int[] sortSelectionUp(int[] a)
    {
        int i;
        int tmp;
        int min;
        
        for(int j = 0; j < a.length - 1; j++)
        {
            min = j;
            for(int i = j + 1; i < a.length - 1; i++)
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
     * This methods sorts an array descending
     * @param a The array to be sorted
     */
    public static int[] sortSelectionDown(int[] a)
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
     * This methods sorts an array descending
     * @param a The array to be sorted
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
     * This methods sorts an array descending
     * @param a The array to be sorted
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
     */
    public static int randomInt(int number)
    {
        int random = (int)(number * Math.random());
        return random;
    }
}
