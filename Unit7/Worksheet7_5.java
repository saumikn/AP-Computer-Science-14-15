package Unit7;
import java.util.ArrayList;

/**
 * This class sorts and modifies an ArrayList of MyFriend objects in different ways
 * 
 * @author Saumik Narayanan
 * @version 4-13-15
 */
public class Worksheet7_5
{
    /**
     * This method creates an array of MyFriend objects, and sorts it
     */
    public static void main()
    {
        ArrayList<MyFriend> l= new ArrayList<MyFriend>();

        l.add(new MyFriend("Qan", 0, randomInt(100)));
        l.add(new MyFriend("Ban", 1, randomInt(100)));
        l.add(new MyFriend("Dan", 2, randomInt(100)));
        l.add(new MyFriend("Fan", 3, randomInt(100)));
        l.add(new MyFriend("Ean", 4, randomInt(100)));
        l.add(new MyFriend("San", 5, randomInt(100)));
        l.add(new MyFriend("Wan", 6, randomInt(100)));
        l.add(new MyFriend("Tan", 7, randomInt(100)));
        l.add(new MyFriend("Han", 8, randomInt(100)));
        l.add(new MyFriend("Jan", 9, randomInt(100)));

        printArrayList(l);
        l = sortLikability(l);
        printArrayList(l);
        l = sortName(l);
        printArrayList(l);
        l = removeLeastLikable(l);
        printArrayList(l);
        printMostLikable(l);
    }

    /**
     * This methods prints the most likable MyFriend objects
     * @param l The array to be looked through
     */
    public static void printMostLikable(ArrayList<MyFriend> l)
    {
        int max0 = 0;
        int max1 = 0;
        for(int i = 0; i < l.size(); i++)
        {
            if(l.get(i).getLikability() > l.get(max0).getLikability())
            {
                max0 = i;
            }
            else if(l.get(i).getLikability() > l.get(max1).getLikability())
            {
                max1 = i;
            }
        }
        System.out.println("The highest is " + l.get(max0).getName());
        System.out.println("The second highest is " + l.get(max1).getName());
    }

    /**
     * This methods removes the least likable MyFriend object
     * @param l The ArrayList to be modified
     */
    public static ArrayList<MyFriend> removeLeastLikable(ArrayList<MyFriend> l)
    {
        int min = 0;
        for(int i = 0; i < l.size(); i++)
        {
            if(l.get(i).getLikability() < l.get(min).getLikability())
            {
                min = i;
            }
        }
        l.remove(min);
        return l;
    }

    /**
     * This methods sorts the ArrayList by name
     * @param l The ArrayList to be sorted
     */
    public static ArrayList<MyFriend> sortName(ArrayList<MyFriend> l)
    {
        for(int j = 0; j < l.size(); j++)
        {
            for(int i = 0; i < l.size() - 1; i++)
            {
                if(l.get(i).getName().compareTo(l.get(i+1).getName()) > 0)
                {
                    MyFriend tmp = l.get(i);
                    l.set(i,l.get(i+1)) ;
                    l.set(i+1, tmp);
                }
            }
        }
        return l;
    }

    /**
     * This methods sorts the ArrayList by likabiliy
     * @param l The ArrayList to be sorted
     */
    public static ArrayList<MyFriend> sortLikability(ArrayList<MyFriend> l)
    {
        for(int j = 0; j < l.size(); j++)
        {
            for(int i = 0; i < l.size() - 1; i++)
            {
                if(l.get(i).getLikability() > l.get(i+1).getLikability())
                {
                    MyFriend tmp = l.get(i);
                    l.set(i,l.get(i+1)) ;
                    l.set(i+1, tmp);
                }
            }
        }
        return l;
    }

    /**
     * This methods prints the ArrayList of MyFriend objects
     * @param l The ArrayList to be printed
     */
    public static void printArrayList(ArrayList<MyFriend> l)
    {
        for(int i = 0; i < l.size(); i++)
        {
            System.out.println(l.get(i).toString());
        }
        System.out.println();
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
