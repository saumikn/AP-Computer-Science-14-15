package Unit5;

/**
 * Creates a triangle object with colors on each side
 * 
 * @author Saumik Narayanan 
 * @version 2/11/15
 */
public class Triangle
{
    private int leftColor;
    private int rightColor;
    private int bottomColor;

    /**
     * Constructor of triangle object
     * 
     * @param   left    The color of the left side
     * @param   right   The color of the right side
     * @param   bottom  The color of the bottom side
     */
    public Triangle(int left, int right, int bottom)
    {
        leftColor = left;
        rightColor = right;
        bottomColor = bottom;
    }

    /**
     * Gets the color of the left side
     * 
     * @return      The color of the left side
     */
    public int getLeft()
    {
        return leftColor;
    }

    /**
     * Gets the color of the right side
     * 
     * @return      The color of the right side
     */
    public int getRight()
    {
        return rightColor;
    }

    /**
     * Gets the color of the down side
     * 
     * @return      The color of the down side
     */
    public int getBottom()
    {
        return bottomColor;
    }

    /**
     * Determines the relationship between this triangle and another triangle
     * 
     * @param   tri     The triangle to be compared to
     * @return          -1 if triangles are never equal, 
     *                   0 if triangles are equal, 
     *                   1 if other triangle is 1 clockwise rotation past this triangle, 
     *                   2 if other triangle is 2 clockwise rotations past this triangle
     */
    public int equalTo(Triangle tri)
    {
        if( leftColor == tri.getLeft() && rightColor == tri.getRight() &&  bottomColor == tri.getBottom() )
            return 0;
        if(leftColor == tri.getRight() && rightColor == tri.getBottom() &&  bottomColor == tri.getLeft())
            return 1;
        if(leftColor == tri.getBottom() && rightColor == tri.getLeft() &&  bottomColor == tri.getRight())
            return 2;
        return -1;
    }
}
