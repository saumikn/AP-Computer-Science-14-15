package Unit7;


/**
 * Write a description of class Worksheet7_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worksheet7_4
{
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
        
        
        
    }
    
    public void sortLikability(MyFriend[] f)
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
    
    public void printArray(MyFriend[] f)
    {
        for(int i = 0; i < f.length; i++)
        {
            String string = f[i].toString();
            System.out.println(string);
        }
    }
    
    public static int randomInt(int number)
    {
        int random = (int)(number * Math.random());
        return random;
    }
    
    
}
