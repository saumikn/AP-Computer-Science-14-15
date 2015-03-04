package Unit5;

/**
 * Rolls a pair of dice a number of times, and computes which roll sum was the most common.
 * 
 * @author Saumik Narayanan 
 * @version 1-30-2015
 */
public class Main55
{
    public static void main()
    {
        int rollNumber = 100;
        int maxRoll = 0;
        int maxCount = 0;

        TwoDice[] td = new TwoDice[rollNumber];
        int[] sumCount = new int[13];

        for(int i = 0; i < rollNumber; i++)
        {
            int a = randomInt();
            int b = randomInt();
            td[i] = new TwoDice(a,b);
            int sum = td[i].dieSum();
            sumCount[sum] = sumCount[sum] + 1;
        }

        for(int i = 2; i < sumCount.length; i++)
        {
            System.out.println("Number of " + i + " rolls: " + sumCount[i]);
            if(sumCount[i] > maxCount)
            {
                maxRoll = i;
            }
            maxCount = Math.max(sumCount[i],maxCount);
        }
        System.out.println();
        System.out.println(maxRoll + ": " + maxCount);
        System.out.println();
        System.out.println();

        for(int i = 0; i < 10; i++)
        {
            String summary = td[i].toString();
            System.out.println(summary);
        }
        
    }

    static int randomInt()
    {
        int random6 = (int)(6 * Math.random() + 1);
        return random6;
    }
}
