package Unit7;


/**
 * Write a description of class Work7_1 here.
 * 
 * @author Saumik Narayanan
 * @version 3/17/15
 */
public class Work7_1
{
    public static void main()
    {
        int length = 16;
        
        int[] a = randomArray(length);
        
        for(int i = 0; i < length - 1; i++)
        {
            if(
        }
        
    }
    
    public static int[] randomArray(int size)
    {
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = randomInt(100);
        }
        return array;
    }
    
    public static int randomInt(int number)
    {
        int random = (int)(number * Math.random());
        return random;
    }
}
