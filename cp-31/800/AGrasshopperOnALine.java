import java.util.*;

public class A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            long x = sc.nextLong();
            long k = sc.nextLong();

            if (x % k == 0)
            {
                System.out.println(2);
                System.out.println(1 + " " + (x - 1));
            }
            else
            {
                System.out.println(1);
                System.out.println(x);
            }
        }

        sc.close();
    }
}
