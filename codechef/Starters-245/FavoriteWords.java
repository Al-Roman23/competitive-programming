import java.util.*;
import java.lang.*;
import java.io.*;

class FavoriteWords
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if (s.charAt(0) == 'c' || s.charAt(3) == 'f') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
