package Unit7;


/**
 * Write a description of class MyFriend here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public String toString()
    {
        String string = name + " " + speedDial + " " + likability;
        return string;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getSpeedDial()
    {
        return speedDial;
    }
    
    public int getLikability()
    {
        return likability;
    }
}
