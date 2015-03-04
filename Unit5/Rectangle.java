package Unit5;
/**
 * This is the definition of the Rectangle class for use in AP Computer Science 2014-15.
 * Class is used and enhanced in Worksheet 5-4.
 * 
 * @author Saumik Narayanan
 * @version 1-23-15
 */
public class Rectangle
{
    // instance variables     
    private double length;
    private double width;
    private double area;
    private double perimeter;
    private double diagonal;
    
    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle()
    {
        // initialize instance variables
        length = 0;
        width = 0;
        area = 0;
        perimeter = 0;
    }
    
    /**
     * Constructor for objects of class Rectangle
     * 
     * @param   length  The value of length to be assigned to the rectangle
     * @param   width   The value of width to be assigned to the rectangle
     */
    public Rectangle(double length, double width)
    {
        // initialize instance variables
        this.length = length;
        this.width = width;
    }

    /**
     * Set the length side of the Rectangle.
     * 
     * @param  y   The value to assign to the length of the Rectangle
     * @return     true if the value of the side is legal, otherwise false 
     */
    public boolean setLength(double y)
    {
        if (y <= 0)
            return false;
        length = y;
        return true;
    }    

    /**
     * Set the width side of the Rectangle.
     * 
     * @param  y   The value to assign to the width of the Rectangle
     * @return     true if the value of the side is legal, otherwise false 
     */
    public boolean setWidth(double y)
    {
        if (y <= 0)
            return false;
        width = y;
        return true;
    }

    /**
     * Get the size of the length side of the Rectangle.
     *
     * @return     the area of the length side of the Rectangle
     */
    public double getLength()
    {
        return length;
    }
    
    /**
     * Get the size of the width side of the Rectangle.
     *
     * @return     the area of the width side of the Rectangle
     */
    public double getWidth()
    {
        return width;
    }

    /**
     * Get the area of the Rectangle, 0 if either side not yet initialized.
     *
     * @return The area of the Rectangle, 0 if either side not initialized.
     */
    public double getArea()
    {
        double area = length * width;
        return area;
    }
    
    /**
     * Sets the side of a rectangle
     * 
     * @param   length  The length that the rectangle will be set to
     * @param   width   The width that the rectangle will be set to
     * 
     * @return          True if both parameters are legal, false otherwise
     */
    public boolean setSides(double length, double width)
    {
        if(length <= 0 || width <= 0)
            return false;
        setLength(length);
        setWidth(width);
        return true;
    }
    
    /**
     * Get the value of the diagonal of the rectangle
     *
     * @return The area of the rectangle, 0 if either side not initialized.
     */
    public double getDiagonal()
    {
        diagonal = length * length + width * width;
        diagonal = Math.sqrt(diagonal);
        return diagonal;
    }
}

