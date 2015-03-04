package Unit4;

/**
 * Write a description of class ws47 here.
 * 
 * @author (Saumik Narayanan) 
 * @version (12-18-14)
 */
public class ws47
{
    public static void main()
    {
        int unknown = 20;

        int[] larry = new int[13];
        for(int i = 0; i < 13; i++)
            larry[i] = i;

        double[] curly = {-1.2, 3.14, 13, 1.75, -6};
        int[] moe = new int[16];
        for(int i = 0; i < 16; i++)
            moe[i] = 5 * i;

        int[] shemp = new int[unknown];
        for(int i = 0; i < unknown; i++)
        {
            if(i % 2 == 0)
                shemp[i] = i;
            else
                shemp[i] = -i;
        }
        
        showArray(larry);
        showArray(moe);
        showArray(shemp);
    }
    
    public static void showArray(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
