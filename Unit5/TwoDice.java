package Unit5;

/**
 * Creates a roll of two dice
 * 
 * @author Saumik Narayanan
 * @version 1-30-2015
 */
public class TwoDice
{
    private int die1;
    private int die2;
    
    public TwoDice(int die1, int die2)
    {
        this.die1 = die1;
        this.die2 = die2;
    }
    
    /**
     * Set the length side of the Rectangle.
     * 
     * @param   which dice is the value taken from
     * @return  the value of the dice
     */
    public int value(int die)
    {
        if(die == 1)
            return die1;
        return die2;
    }
    
    /**
     * Finds the sum of the dice roll
     * 
     * @return  the value of the dice roll sum
     */
    public int dieSum()
    {
        int sum = die1 + die2;
        return sum;
    }
    
    /**
     * Creates a summary of the dice
     * 
     * @return  A string that summarizes the dice roll
     */
    public String toString()
    {
        String summary = "Die 1: " + die1 + "\tDie 2: "  + die2;
        return summary;
    }
}
