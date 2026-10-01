import java.util.*;

public class Desorting
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

            long minimumOperations = Long.MAX_VALUE;

            for (int i = 0; i < n - 1; i++)
            {
                if (a[i] > a[i + 1])
                {
                    minimumOperations = 0;
                    break;
                }

                long difference = a[i + 1] - a[i];
                long operations = difference / 2 + 1;

                minimumOperations = Math.min(minimumOperations, operations);
            }

            System.out.println(minimumOperations);
        }

        sc.close();
    }
}
