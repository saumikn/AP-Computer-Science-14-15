package Unit6;

import info.gridworld.actor.Bug;

/**
 * Creates a Bug that moves in a Z Shape
 * 
 * @author Saumik Narayanan
 * @version 3/3/15
 */
public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int sideNumber;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        sideNumber = 1;
        steps = 0;
        sideLength = length;
        turn();
        turn();
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if(sideNumber == 0) {}
        else if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else if (sideNumber == 1)
        {
            turn();
            turn();
            turn();
            steps = 0;
            sideNumber = 2;
        }
        else if (sideNumber == 2)
        {
            turn();
            turn();
            turn();
            turn();
            turn();
            steps = 0;
            sideNumber = 3;
        }
        else if(sideNumber == 3)
        {
            sideNumber = 0;
        }
    }
}
