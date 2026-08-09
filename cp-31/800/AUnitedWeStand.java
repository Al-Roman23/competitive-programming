import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            long n = sc.nextLong();

            long[] a = new long[(int) n];

            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextLong();
            }

            long maximum = a[0];

            for (int i = 1; i < n; i++)
            {
                maximum = Math.max(maximum, a[i]);
            }

            ArrayList<Long> b = new ArrayList<>();
            ArrayList<Long> c = new ArrayList<>();

            for (int i = 0; i < n; i++)
            {
                if (a[i] != maximum)
                {
                    b.add(a[i]);
                }
                else
                {
                    c.add(a[i]);
                }
            }

            if (b.size() == 0)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(b.size() + " " + c.size());

                for (long value : b)
                {
                    System.out.print(value + " ");
                }

                System.out.println();

                for (long value : c)
                {
                    System.out.print(value + " ");
                }

                System.out.println();
            }
        }

        sc.close();
    }
}
