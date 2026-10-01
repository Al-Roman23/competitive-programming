import java.util.*;

public class AFindK
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();

            boolean found = false;

            for (int i = 0; i < n; i++)
            {
                long x = sc.nextLong();

                if (x == k)
                {
                    found = true;
                }
            }

            if (found)
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
}
