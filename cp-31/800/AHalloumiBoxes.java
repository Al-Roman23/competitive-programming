import java.util.*;

public class AHalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] a = new long[n];
            long[] sorted = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sorted[i] = a[i];
            }

            Arrays.sort(sorted);

            boolean same = true;
            for (int i = 0; i < n; i++) {
                if (a[i] != sorted[i]) {
                    same = false;
                    break;
                }
            }

            if (same || k > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
