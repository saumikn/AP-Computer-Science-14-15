package Unit6;

import info.gridworld.actor.Bug;

/**
 * Creates a Bug that dances
 * 
 * @author Saumik Narayanan
 * @version 3/3/15
 */
public class DancingBug extends Bug
{
    private int steps;
    private int sideLength;
    private int[] dance;
    private int index = 0;

    /**
     * Constructs a dancing bug that traces a square of a given side length
     * @param dance the array which tells the bug how to dance
     */
    public DancingBug(int[] dance)
    {
        steps = 0;
        this.dance = dance;
        index = 0;
        sideLength = 1;
    }

    /**
     * Moves according to the array
     */
    public void act()
    {
        if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
            steps = 0;
            for(int i = 0; i < dance[index]; i++)
            {
                turn();
            }
            if(index + 1 == dance.length)
            {
                index = 0;
            }
            else
            {
                index++;
            }
        }
    }
}
