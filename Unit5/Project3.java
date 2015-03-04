package Unit5;

/**
 * Determines which triangles match,and in which way
 * 
 * @author Saumik Narayanan
 * @version 2-11-15
 */
public class Project3
{
    /**
     * Instantiates all triangles, and runs for loops to determine which triangles match
     */
    public static void main()
    {
        // Set color values
        final int RED = 1;
        final int GREEN = 2;
        final int BLUE = 3;
        final int YELLOW = 4;
        
        int line;

        // Instantiate all triangles into an array
        Triangle[] tri = new Triangle[22];

        tri[1]  = new Triangle (BLUE,       YELLOW,     GREEN);
        tri[2]  = new Triangle (RED,        BLUE,       YELLOW);
        tri[3]  = new Triangle (GREEN,      RED,        YELLOW);
        tri[4]  = new Triangle (YELLOW,     BLUE,       GREEN);
        tri[5]  = new Triangle (BLUE,       GREEN,      RED);
        tri[6]  = new Triangle (GREEN,      BLUE,       RED);
        tri[7]  = new Triangle (YELLOW,     BLUE,       RED);
        tri[8]  = new Triangle (GREEN,      BLUE,       YELLOW);
        tri[9]  = new Triangle (RED,        BLUE,       GREEN);
        tri[10] = new Triangle (BLUE,       RED,        YELLOW);
        tri[11] = new Triangle (YELLOW,     GREEN,      BLUE);
        tri[12] = new Triangle (RED,        GREEN,      BLUE);
        tri[13] = new Triangle (GREEN,      RED,        YELLOW);
        tri[14] = new Triangle (YELLOW,     GREEN,      RED);
        tri[15] = new Triangle (GREEN,      RED,        BLUE);
        tri[16] = new Triangle (BLUE,       RED,        GREEN);
        tri[17] = new Triangle (RED,        YELLOW,     BLUE);
        tri[18] = new Triangle (YELLOW,     RED,        BLUE);
        tri[19] = new Triangle (GREEN,      YELLOW,     BLUE);
        tri[20] = new Triangle (BLUE,       GREEN,      YELLOW);
        tri[21] = new Triangle (YELLOW,     RED,        GREEN);

        // Go through each triangle to compare
        for(int i = 1; i < tri.length; i++)
        {
            // Compare each triangle to every other triangle    
            line = 0;
            for(int j = i + 1; j < tri.length; j++)
            {
                // Determines if and how the triangles match
                if(tri[i].equalTo(tri[j]) == 0)
                {
                    System.out.println("Triangle " + i + " is equal to Triangle " + j);
                }
                else if(tri[i].equalTo(tri[j]) == 1)
                {
                    System.out.println("Triangle " + i + " is equal to Triangle " + j + " rotated 120 degrees counterclockwise");
                }
                else if(tri[i].equalTo(tri[j]) == 2)
                {
                    System.out.println("Triangle " + i + " is equal to Triangle " + j + " rotated 240 degrees counterclockwise");
                }
                else
                {
                    line++;
                }
            }
            // Provides coherent whitespace for the user
            if(line < tri.length - 1 - i)
            {
                System.out.println();
            }
        }
    }

}

