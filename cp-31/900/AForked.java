import java.util.*;

public class Forked
{
    static int[] dx = {-1, 1, -1, 1};
    static int[] dy = {-1, -1, 1, 1};

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long xKing = sc.nextLong();
            long yKing = sc.nextLong();

            long xQueen = sc.nextLong();
            long yQueen = sc.nextLong();

            Set<Pair> kingPositions = new HashSet<>();
            Set<Pair> queenPositions = new HashSet<>();

            for (int i = 0; i < 4; i++)
            {
                kingPositions.add(new Pair(
                    xKing + dx[i] * a,
                    yKing + dy[i] * b
                ));

                kingPositions.add(new Pair(
                    xKing + dx[i] * b,
                    yKing + dy[i] * a
                ));

                queenPositions.add(new Pair(
                    xQueen + dx[i] * a,
                    yQueen + dy[i] * b
                ));

                queenPositions.add(new Pair(
                    xQueen + dx[i] * b,
                    yQueen + dy[i] * a
                ));
            }

            int answer = 0;

            for (Pair position : kingPositions)
            {
                if (queenPositions.contains(position))
                {
                    answer++;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }

    static class Pair
    {
        long x;
        long y;

        Pair(long x, long y)
        {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }

            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }

            Pair pair = (Pair) obj;

            return x == pair.x && y == pair.y;
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(x, y);
        }
    }
}
