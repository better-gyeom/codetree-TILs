import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(move(n, arr));
    }

    public static int move(int n, int[] arr) {
        int minV = Integer.MAX_VALUE;
        int diff = 0;
        for (int i = 0; i < n; i++) {
            diff = 0;
            for (int j = 0; j < n; j++) {
                diff += (Math.abs(i - j) * arr[j]);
            }

            if (diff < minV) {
                minV = diff;
                // System.out.println(diff);
            }
        }
        return minV;
    }
}