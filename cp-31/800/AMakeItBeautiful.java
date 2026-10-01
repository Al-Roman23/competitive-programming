import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            long maximum = a[n - 1];
            long minimum = a[0];

            if (maximum == minimum)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");

                System.out.print(maximum + " ");

                for (int i = 0; i < n - 1; i++)
                {
                    System.out.print(a[i] + " ");
                }

                System.out.println();
            }
        }

        sc.close();
    }
}
