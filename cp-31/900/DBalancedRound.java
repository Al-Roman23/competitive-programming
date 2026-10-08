import java.util.*;

public class BalancedRound
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long[] problems = new long[(int) n];

            for (int i = 0; i < n; i++)
            {
                problems[i] = sc.nextLong();
            }

            Arrays.sort(problems);

            long currentLength = 1;
            long largestLength = 1;

            for (int i = 1; i < n; i++)
            {
                if (problems[i] - problems[i - 1] <= k)
                {
                    currentLength++;
                }
                else
                {
                    currentLength = 1;
                }

                largestLength = Math.max(largestLength, currentLength);
            }

            System.out.println(n - largestLength);
        }

        sc.close();
    }
}
