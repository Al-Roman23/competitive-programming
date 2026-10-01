import java.util.*;

public class ExtremelyRound
{
    static boolean check(long x)
    {
        int countOfDigits = 0;
        int countOfZeroes = 0;

        while (x > 0)
        {
            if (x % 10 == 0)
            {
                countOfZeroes++;
            }

            countOfDigits++;
            x /= 10;
        }

        return countOfZeroes == countOfDigits - 1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Long> roundNumbers = new ArrayList<>();

        for (long i = 1; i <= 999999; i++)
        {
            if (check(i))
            {
                roundNumbers.add(i);
            }
        }

        int t = sc.nextInt();

        while (t-- > 0)
        {
            long n = sc.nextLong();

            int answer = 0;

            for (long roundNumber : roundNumbers)
            {
                if (roundNumber <= n)
                {
                    answer++;
                }
                else
                {
                    break;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}
