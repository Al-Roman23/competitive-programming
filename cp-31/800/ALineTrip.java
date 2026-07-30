import java.util.*;

public class ALineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();

            ArrayList<Long> points = new ArrayList<>();

            points.add(0L);

            for (int i = 0; i < n; i++) {
                points.add(sc.nextLong());
            }

            points.add(x);

            long maxDist = Long.MIN_VALUE;

            for (int i = 1; i < points.size(); i++) {
                long diff = points.get(i) - points.get(i - 1);

                if (i == points.size() - 1) {
                    diff *= 2;
                }

                maxDist = Math.max(maxDist, diff);
            }

            System.out.println(maxDist);
        }

        sc.close();
    }
}
