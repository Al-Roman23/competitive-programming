import java.util.*;

public class UnitArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int n = sc.nextInt();

            int positiveCount = 0;
            int negativeCount = 0;

            for (int i = 0; i < n; i++)
            {
                int x = sc.nextInt();

                if (x == 1)
                {
                    positiveCount++;
                }
                else
                {
                    negativeCount++;
                }
            }

            int operations = 0;

            while (positiveCount < negativeCount || negativeCount % 2 == 1)
            {
                operations++;
                positiveCount++;
                negativeCount--;
            }

            System.out.println(operations);
        }

        sc.close();
    }
}
