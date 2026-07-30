import java.util.*;
import java.lang.*;
import java.io.*;

class ACoverInWater
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();

            boolean hasThreeConsecutiveDots = false;
            int dotCount = 0;

            for (int i = 0; i < n; i++)
            {
                if (s.charAt(i) == '.') {
                    dotCount++;
                }

                if (i + 2 < n &&
                    s.charAt(i) == '.' &&
                    s.charAt(i + 1) == '.' &&
                    s.charAt(i + 2) == '.') {
                    hasThreeConsecutiveDots = true;
                }
            }

            if (hasThreeConsecutiveDots) {
                System.out.println(2);
            } else {
                System.out.println(dotCount);
            }
        }

        sc.close();
    }
}
