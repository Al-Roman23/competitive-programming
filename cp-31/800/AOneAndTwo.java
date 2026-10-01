import java.util.*;

public class OneAndTwo
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

            int totalTwos = 0;

            for (int i = 0; i < n; i++)
            {
                if (a[i] == 2)
                {
                    totalTwos++;
                }
            }

            int prefixTwos = 0;
            int answer = -1;

            for (int i = 0; i < n; i++)
            {
                if (a[i] == 2)
                {
                    prefixTwos++;
                }

                int suffixTwos = totalTwos - prefixTwos;

                if (prefixTwos == suffixTwos)
                {
                    answer = i + 1;
                    break;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}
