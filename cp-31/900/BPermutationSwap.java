import java.util.*;

public class BPermutationSwap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int n = sc.nextInt();

            int k = 0;

            for (int i = 1; i <= n; i++)
            {
                int a = sc.nextInt();

                k = gcd(k, Math.abs(a - i));
            }

            System.out.println(k);
        }

        sc.close();
    }

    static int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }

        return gcd(b, a % b);
    }
}
