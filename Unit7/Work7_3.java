package Unit7;

/**
 * This class creates two randomized arrays, 
 * and sorts them increasing and decreasing, respectively
 * 
 * @author Saumik Narayanan
 * @version 4-20-15
 */
public class Work7_3
{
    static int iteration = 0;
    /**
     * This method completes the worksheet on the
     * Eagan High School AP Computer Science website
     */

    public static void main()
    {
        int[] a = randomArray(16);
        printArray(a);

        a = sortInsertionUp(a);
        System.out.println("Insertion: " + iteration);
        iteration = 0;
        a = randomArray(16);

        a = sortSelectionUp(a);
        System.out.println("Selection: " + iteration);
        iteration = 0;
        a = randomArray(16);

        a = sortBubbleUp(a);
        System.out.println("Bubble: " + iteration);
        iteration = 0;
        a = randomArray(16);

        a = optimizedSortBubbleUp(a);
        System.out.println("Optimized Bubble: " + iteration);
        iteration = 0;
        a = randomArray(16);

        // Question 3 - They are different because the second for loop goes through 16-1=15 times, not 16, 
        // so we get 16*15=240

        System.out.println();
        a = randomArray(1024);


        a = sortInsertionUp(a);
        System.out.println("Insertion: " + iteration);
        iteration = 0;
        a = randomArray(1024);

        a = sortSelectionUp(a);
        System.out.println("Selection: " + iteration);
        iteration = 0;
        a = randomArray(1024);
        
        a = sortSelectionDown(a);
        System.out.println("Selection: " + iteration);
        iteration = 0;
        a = randomArray(1024);

        a = sortBubbleUp(a);
        System.out.println("Bubble: " + iteration);

        // Question 6 - They are different because the second for loop goes through 1024-1=1023 times, not 1024, 
        // so we get 1024*1023=1047552. This difference is much larger, as the numbers we are dealing with are higher
    }

    public static int[] optimizedSortBubbleUp(int[] a)
    {
        boolean isSorted = true;
        for(int j = 0; j < a.length; j++)
        {
            iteration++;
            for(int i = 0; i < a.length - 1; i++)
            {
                iteration++;
                if(a[i] > a[i+1])
                {
                    isSorted = false;
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }
            if(isSorted)
                break;
        }
        return a;
    }

    /**
     * This methods sorts an array descending using a insertion sort
     * @param a The array to be sorted
     * @return The sorted array
     */
    public static int[] sortInsertionUp(int[] a)
    {

        for(int j = 1; j < a.length; j ++)
        {
            iteration++;
            int i = j;
            int tmp = a[i];
            while( i > 0 && a[i-1] > tmp)
            {
                iteration++;
                a[i] = a[i-1];
                i--;                
            }
            a[i] = tmp;
        }
        return a;
    }

    /**
     * This methods sorts an array ascending using a insertion sort
     * @param a The array to be sorted
     * @return The sorted array
     */
    public static int[] sortSelectionUp(int[] a)
    {
        int tmp;
        int min;

        for(int j = 0; j < a.length; j++)
        {
            min = j;
            for(int i = 0; i < a.length - 1; i++)
            {
                if(a[i] < a[min])
                {
                    min = i;
                }
                iteration++;
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

        for(int j = 0; j < a.length; j++)
        {
            iteration++;
            max = j;
            for(int i = j + 1; i < a.length - 1; i++)
            {
                iteration++;
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
        for(int j = 0; j < a.length; j++)
        {
            iteration++;
            for(int i = 0; i < a.length - 1; i++)
            {
                iteration++;
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
        for(int j = 0; j < a.length; j++)
        {
            iteration++;
            for(int i = 0; i < a.length - 1; i++)
            {
                iteration++;
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
        System.out.println();
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
