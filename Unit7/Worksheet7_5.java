package Unit7;
import java.util.ArrayList;

/**
 * Write a description of class Worksheet7_5 here.
 * 
 * @author Saumik Narayanan
 * @version (a version number or a date)
 */
public class Worksheet7_5
{
    public static void main()
    {
        ArrayList<MyFriend> l= new ArrayList<MyFriend>();

        l.add(new MyFriend("An", 0, randomInt(100)));
        l.add(new MyFriend("Ban", 1, randomInt(100)));
        l.add(new MyFriend("Can", 2, randomInt(100)));
        l.add(new MyFriend("Dan", 3, randomInt(100)));
        l.add(new MyFriend("Ean", 4, randomInt(100)));
        l.add(new MyFriend("Fan", 5, randomInt(100)));
        l.add(new MyFriend("Gan", 6, randomInt(100)));
        l.add(new MyFriend("Han", 7, randomInt(100)));
        l.add(new MyFriend("Ian", 8, randomInt(100)));
        l.add(new MyFriend("Jan", 9, randomInt(100)));
    }

    public static int randomInt(int number)
    {
        int random = (int)(number * Math.random());
        return random;
    }
}
