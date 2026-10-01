import java.util.*;

public class AmbitiousKid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long minimumOperations = Long.MAX_VALUE;

        for (int i = 0; i < n; i++)
        {
            long x = sc.nextLong();
            minimumOperations = Math.min(minimumOperations, Math.abs(x));
        }

        System.out.println(minimumOperations);

        sc.close();
    }
}
