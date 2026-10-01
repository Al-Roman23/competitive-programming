import java.util.*;

public class AGameWithIntegers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            long n = sc.nextLong();

            if (n % 3 == 0)
            {
                System.out.println("Second");
            }
            else
            {
                System.out.println("First");
            }
        }

        sc.close();
    }
}
