import java.util.*;

public class TwinPermutations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++)
            {
                System.out.print((n + 1 - a[i]) + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
