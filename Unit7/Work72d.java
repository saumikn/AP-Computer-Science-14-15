package Unit7;

/**
 * Write a description of class Work72d here.
 * 
 * @author Saumik Narayanan
 * @version 4/1/15
 */
public class Work72d
{
    public static void main()
    {
        int[][] a = random2dArray(8,8);
        print2dArray(a);
        System.out.println();
        System.out.println();
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i; j < a[i].length; j++)
            {
                int tmp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = tmp;
            }
        }
        print2dArray(a);
    }

    /**
     * This methods prints a 2d array
     * @param size  The array to be printed
     * @return The printed array
     */
    public static void print2dArray(int[][] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    /**
     * This methods creates a randomized array
     * @param size  The length of the randomized array
     * @return The randomized array
     */
    public static int[][] random2dArray(int row, int column)
    {
        int[][] array = new int[row][column];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                array[i][j] = randomInt(99) + 1;
            }
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
