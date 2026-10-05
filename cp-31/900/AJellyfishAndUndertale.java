import java.util.*;

public class Bomb
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();

            long[] x = new long[n];

            for (int i = 0; i < n; i++)
            {
                x[i] = sc.nextLong();
            }

            long maximumTime = b;

            for (int i = 0; i < n; i++)
            {
                maximumTime += Math.min(x[i], a - 1);
            }

            System.out.println(maximumTime);
        }

        sc.close();
    }
}
