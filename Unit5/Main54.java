package Unit5;
/**
 * Write a description of class Main54 here.
 * 
 * @author Saumik Narayanan
 * @version 1-27-15
 */
public class Main54
{
    public static void main()
    {
        double length;
        double width;
        double area;
        double diagonal;

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle();

        length = randomInt();
        width = randomInt();
        Rectangle rect7 = new Rectangle(length, width);

        length = randomInt();
        width = randomInt();
        Rectangle rect8 = new Rectangle(length, width);

        //Problem 1
        System.out.println("Problem 1:");

        rect1.setLength(8);
        rect1.setWidth(6);
        length = rect1.getLength();
        width = rect1.getWidth();
        area = length * width;
        System.out.println("rect1 - Length: " + length + ", Width: " + width + ", Area: "+ area);

        System.out.println("================================================================");
        System.out.println();

        
        //Problem 2
        System.out.println("Problem 2:");
        length = randomInt();
        width = randomInt();
        rect2.setLength(length);
        rect2.setWidth(width);
        area = rect2.getArea();
        System.out.println("rect2 - Length: " + length + ", Width: " + width + ", Area: "+ area);

        System.out.println();
        System.out.println("================================================================");
        System.out.println();

        
        //Problem 3
        System.out.println("Problem 3:");
        length = randomInt();
        width = randomInt();
        rect3.setSides(length, width);
        area = rect3.getArea();
        System.out.println("rect3 - Length: " + length + ", Width: " + width + ", Area: "+ area);

        System.out.println();
        System.out.println("================================================================");
        System.out.println();

        
        //Problem 4
        System.out.println("Problem 4:");
        System.out.println("rect1 diagonal = " + rect1.getDiagonal() + ", rect2 diagonal = " + rect2.getDiagonal() + ", rect2 diagonal = " + rect2.getDiagonal());

        System.out.println();
        System.out.println("================================================================");
        System.out.println();

        
        //Problem 5
        System.out.println("Problem 5: N/A");

        System.out.println();
        System.out.println("================================================================");
        System.out.println();

        
        //Problem 6
        System.out.println("Problem 6:");

        length = rect7.getLength();
        width = rect7.getWidth();
        area = rect7.getArea();
        diagonal = rect7.getDiagonal();
        System.out.println("rect7 - Length: " + length + ", Width: " + width + ", Area: " + area + ", Diagonal: " + diagonal);

        length = rect8.getLength();
        width = rect8.getWidth();
        area = rect8.getArea();
        diagonal = rect8.getDiagonal();
        System.out.println("rect8 - Length: " + length + ", Width: " + width + ", Area: " + area + ", Diagonal: " + diagonal);

        System.out.println();
        System.out.println("================================================================");
        System.out.println();
    }

    /**
     * Determines a random integer from 1 to 0
     * 
     * @return   a random integer from 1 to 10
     */
    static int randomInt()
    {
        int x = (int)(Math.random() * 10) + 1;
        return x;        
    }
}
