import java.util.*;

public class ComparisonString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            long n = sc.nextLong();
            String s = sc.next();

            long longestLength = 1;
            long currentLength = 1;

            for (int i = 1; i < n; i++)
            {
                if (s.charAt(i) == s.charAt(i - 1))
                {
                    currentLength++;
                }
                else
                {
                    longestLength = Math.max(longestLength, currentLength);
                    currentLength = 1;
                }
            }

            longestLength = Math.max(longestLength, currentLength);

            System.out.println(longestLength + 1);
        }

        sc.close();
    }
}
