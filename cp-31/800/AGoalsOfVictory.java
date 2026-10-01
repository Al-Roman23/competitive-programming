import java.util.*;
import java.lang.*;
import java.io.*;

public class AMissingTeam
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0)
        {
            int n = sc.nextInt();

            long sum = 0;

            for (int i = 0; i < n - 1; i++)
            {
                sum += sc.nextLong();
            }

            System.out.println(-sum);
        }

        sc.close();
    }
}
