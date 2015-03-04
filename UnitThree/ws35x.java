package UnitThree;
/**
 * Write a description of class ws35x here.
 * 
 * @author (Saumik Narayanan) 
 * @version (11-19-14)
 */
public class ws35x
{
    public static void main()
    {
        int i;
        int j;
        int k;

        for(i = 1; i < 6; i++)
        {
            for(j = 0; j < i - 1; j++)
            {
                System.out.print(" ");
            }
            for(k = 10; k >= i * 2; k--)
            {
                System.out.print("X");
            }
            System.out.println();
        }
        for(i = 4; i > 0; i--)
        {
            for(j = 0; j < i - 1; j++)
            {
                System.out.print(" ");
            }
            for(k = 10; k >= i * 2; k--)
            {
                System.out.print("X");
            }
            System.out.println();
        }

    }
}
