package Unit7;


/**
 * This class sorts an array of MyFriend objects in various ways
 * 
 * @author Saumik Narayanan
 * @version 4/7/15
 */
public class Worksheet7_4
{
    /**
     * This method creates an array of MyFriend objects, and sorts it
     */
    public static void main()
    {
        MyFriend[] friend = new MyFriend[10];
        
        friend[0] = new MyFriend("An", 0, randomInt(100));
        friend[1] = new MyFriend("Ban", 1, randomInt(100));
        friend[2] = new MyFriend("Can", 2, randomInt(100));
        friend[3] = new MyFriend("Dan", 3, randomInt(100));
        friend[4] = new MyFriend("Ean", 4, randomInt(100));
        friend[5] = new MyFriend("Fan", 5, randomInt(100));
        friend[6] = new MyFriend("Gan", 6, randomInt(100));
        friend[7] = new MyFriend("Han", 7, randomInt(100));
        friend[8] = new MyFriend("Ian", 8, randomInt(100));
        friend[9] = new MyFriend("Jan", 9, randomInt(100));
        
        printArray(friend);
        sortLikability(friend);
        printArray(friend);
        sortSpeedDial(friend);
        printArray(friend);
        
    }
    
    /**
     * This methods sorts an array by speed dial
     * @param f The array to be sorted
     * @return The sorted array
     */
    public static MyFriend[] sortSpeedDial(MyFriend[] f)
    {
        for(int j = 0; j < f.length; j++)
        {
            for(int i = 0; i < f.length - 1; i++)
            {
                if(f[i].getSpeedDial() > f[i+1].getSpeedDial())
                {
                    MyFriend tmp = f[i];
                    f[i] = f[i+1];
                    f[i+1] = tmp;
                }
            }
        }
        return f;
    }
    
    /**
     * This methods sorts an array by likability
     * @param f The array to be sorted
     * @return The sorted array
     */
    public static MyFriend[] sortLikability(MyFriend[] f)
    {
        for(int j = 0; j < f.length; j++)
        {
            for(int i = 0; i < f.length - 1; i++)
            {
                if(f[i].getLikability() > f[i+1].getLikability())
                {
                    MyFriend tmp = f[i];
                    f[i] = f[i+1];
                    f[i+1] = tmp;
                }
            }
        }
        return f;
    }
    
    /**
     * This methods prints an array
     * @param f The array to be printed
     */
    public static void printArray(MyFriend[] f)
    {
        for(int i = 0; i < f.length; i++)
        {
            String string = f[i].toString();
            System.out.println(string);           
        }
        System.out.println();
    }
    
    public static int randomInt(int number)
    {
        int random = (int)(number * Math.random());
        return random;
    }
    
    
}
