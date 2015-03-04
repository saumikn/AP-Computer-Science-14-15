package Unit5;

import java.util.Scanner;

/**
 * Write a description of class ws51 here.
 * 
 * @author Saumik Narayanan
 * @version 1-9-2015
 */
public class ws51
{
    public static void main()
    {
        Integer kobj = new Integer(83);
        Integer jobj = new Integer(61);

        System.out.println(kobj);
        System.out.println(jobj);
        System.out.println("-----------------------------");
        System.out.println();

        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int k = stdin.nextInt();
        kobj = k;
        System.out.println(k);
        System.out.println(kobj);
        System.out.println("-----------------------------");
        System.out.println();

        while(true)
        {
            System.out.print("Enter an integer: ");
            k = stdin.nextInt();

            if(k == 0)
            {
                break;
            }

            kobj = k;

            System.out.println(k);
            System.out.println(kobj);
            System.out.println();
        }
        System.out.println("-----------------------------");
        System.out.println();
        while(true)
        {
            System.out.print("Enter an integer: ");
            k = stdin.nextInt();

            if(k == 0)
            {
                break;
            }

            kobj = k;
            String kstr = new String(kobj.toString());

            System.out.println(k);
            System.out.println(kobj);
            System.out.println();
        }
        System.out.println("-----------------------------");
        System.out.println();

        while(true)
        {
            System.out.print("Enter an integer: ");
            k = stdin.nextInt();

            if(k == 0)
            {
                break;
            }

            kobj = k;
            String kstr = new String(kobj.toString());
            String kreverse = new String();
            for(int i = kstr.length() - 1; i >= 0; i--)
            {
                kreverse = kreverse + kstr.charAt(i);
            }

            System.out.println(k);
            System.out.println(kreverse);
            System.out.println();
        }
        System.out.println("-----------------------------");
        System.out.println();

        while(true)
        {
            System.out.print("Enter an double: ");
            double l = stdin.nextDouble();

            if(l == 0)
            {
                break;
            }

            Double ldobj = new Double(l);
            String lstr = new String(ldobj.toString());
            String lreverse = new String();
            System.out.println(l);
            for(int i = lstr.length() - 1; i >= 0; i--)
            {
                lreverse = lreverse + lstr.charAt(i);
            }
            System.out.println(lreverse);
            System.out.println();
        }
        System.out.println("-----------------------------");
        System.out.println();
    }
}
