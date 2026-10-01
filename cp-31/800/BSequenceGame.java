import java.util.*;

public class SequenceGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0)
        {
            int n = sc.nextInt();

            long[] b = new long[n];

            for (int i = 0; i < n; i++)
            {
                b[i] = sc.nextLong();
            }

            long[] a = new long[2 * n];
            int size = 0;

            a[size++] = b[0];

            for (int i = 1; i < n; i++)
            {
                a[size++] = b[i];

                if (b[i] < b[i - 1])
                {
                    a[size++] = b[i];
                }
            }

            System.out.println(size);

            for (int i = 0; i < size; i++)
            {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
