package Unit6;

import info.gridworld.actor.Bug;

/**
 * Creates a Bug that moves in a Octogon Shape
 * 
 * @author Saumik Narayanan
 * @version 3/3/15
 */
public class OctoBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public OctoBug(int length)
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
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
            turn();
            steps = 0;
        }
    }
}
