import java.util.*;

public class BlankSpace
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

            int currentZeroes = 0;
            int maximumZeroes = 0;

            for (int i = 0; i < n; i++)
            {
                if (a[i] == 0)
                {
                    currentZeroes++;
                }
                else
                {
                    currentZeroes = 0;
                }

                maximumZeroes = Math.max(maximumZeroes, currentZeroes);
            }

            System.out.println(maximumZeroes);
        }

        sc.close();
    }
}
