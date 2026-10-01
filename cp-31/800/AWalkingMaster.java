import java.util.*;

public class WalkingMaster
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int sourceX = sc.nextInt();
            int sourceY = sc.nextInt();
            int destinationX = sc.nextInt();
            int destinationY = sc.nextInt();

            if (destinationY < sourceY)
            {
                System.out.println(-1);
                continue;
            }

            int moves = destinationY - sourceY;

            sourceX += moves;

            if (sourceX < destinationX)
            {
                System.out.println(-1);
                continue;
            }

            moves += sourceX - destinationX;

            System.out.println(moves);
        }

        sc.close();
    }
}
