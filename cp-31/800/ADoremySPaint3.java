import java.util.*;

public class ADoremyPaint
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int n = sc.nextInt();

            long[] a = new long[n];

            Map<Long, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextLong();
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            }

            if (freq.size() >= 3)
            {
                System.out.println("No");
                continue;
            }

            if (freq.size() == 1)
            {
                System.out.println("Yes");
                continue;
            }

            Iterator<Integer> it = freq.values().iterator();

            int f1 = it.next();
            int f2 = it.next();

            if (f1 == f2)
            {
                System.out.println("Yes");
            }
            else if (n % 2 == 1 && Math.abs(f1 - f2) == 1)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
