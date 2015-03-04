package Unit6;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;
import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
        UnboundedGrid g = new UnboundedGrid();
        ActorWorld world = new ActorWorld(g);
        int[] a = randomArray(10);
        
        
        
        DancingBug alice = new DancingBug(a);
        alice.setColor(Color.ORANGE);
        world.add(new Location(7, 8), alice);
        world.show();
    }

    public static int[] randomArray(int length)
    {
        if(length < 1)
        {
            return new int[0];
        }
        else
        {        
            int[] a = new int[length];
            for(int i = 0; i < length; i++)
            {
                a[i] = random7();
            }
            return a;
        }
    }        

    public static int random7()
    {
        return (int)(7*Math.random() + 1);
    }
}