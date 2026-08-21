import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();

            int ans = n;

            int left = 0;
            int right = n - 1;

            while (left <= right)
            {
                if (s.charAt(left) != s.charAt(right))
                {
                    ans -= 2;
                }
                else
                {
                    break;
                }

                left++;
                right--;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
