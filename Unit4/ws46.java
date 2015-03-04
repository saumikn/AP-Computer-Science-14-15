package Unit4;

/**
 * Write a description of class ws46 here.
 * 
 * @author (Saumik Narayanan) 
 * @version (12-15-14)
 */
public class ws46
{

    public static void main()
    {
        final double SAMPLE_SIZE = 100000000;

        int[] b = new int[10];
        for(int i = 0; i < SAMPLE_SIZE; i++)
        {
            int a = oneDigit();
            b[a] = b[a] + 1;
        }
        System.out.println();
        for(int i = 0; i < 10; i++)
        {
            int c = b[i];
            System.out.println(i + ": " + c);
        }
        System.out.println();
        for(int i = 0; i < 10; i++)
        {
            double c = b[i] / SAMPLE_SIZE;
            c = Math.round(100 * c);
            int d = (int)c;
            System.out.println(i + ": " + d + "%");
        }       
    }

    public static int oneDigit()
    {
        int a = (int)(10 * Math.random());
        return a;
    }
}
