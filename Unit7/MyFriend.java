package Unit7;

/**
 * Is a MyFriend object
 * 
 * @author Saumik Narayanan
 * @version 4/7/15
 */
public class MyFriend
{
    private String name;
    private int speedDial;
    private int likability;

    /**
     * Constructor for objects of class MyFriend
     */
    public MyFriend(String name, int speedDial, int likability)
    {
        this.name = name;
        this.speedDial = speedDial;
        this.likability = likability;
    }

    /**
     * This method returns a string that describes the MyFriend object
     * @return The string that describes the MyFriend object
     */
    public String toString()
    {
        String string = name + "\t" + speedDial + "\t" + likability;
        return string;
    }
    
    /**
     * Gets the name of the MyFriend object
     * @return The name of the MyFriend object
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the speedDial of the MyFriend object
     * @return The speedDialme of the MyFriend object
     */
    public int getSpeedDial()
    {
        return speedDial;
    }

    /**
     * Gets the likability of the MyFriend object
     * @return The likability of the MyFriend object
     */
    public int getLikability()
    {
        return likability;
    }
}
