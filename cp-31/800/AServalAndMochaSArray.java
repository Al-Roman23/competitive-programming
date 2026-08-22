import java.util.*;

public class BeautifulArray
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

            boolean isBeautiful = false;

            for (int i = 0; i < n; i++)
            {
                for (int j = i + 1; j < n; j++)
                {
                    if (gcd(a[i], a[j]) <= 2)
                    {
                        isBeautiful = true;
                        break;
                    }
                }

                if (isBeautiful)
                {
                    break;
                }
            }

            if (isBeautiful)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    private static long gcd(long a, long b)
    {
        while (b != 0)
        {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
