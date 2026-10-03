import java.util.*;

public class Chemistry
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            String s = sc.next();

            int[] frequency = new int[26];

            for (int i = 0; i < n; i++)
            {
                frequency[s.charAt(i) - 'a']++;
            }

            int oddFrequency = 0;

            for (int i = 0; i < 26; i++)
            {
                if (frequency[i] % 2 == 1)
                {
                    oddFrequency++;
                }
            }

            if (oddFrequency <= k + 1)
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
