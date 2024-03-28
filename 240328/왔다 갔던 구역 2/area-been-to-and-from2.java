import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[2001];

        int now = 1000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String order = sc.next();

            if (order.equals("R")) {
                for (int j = now; j < now + x; j++) {
                    arr[j] += 1;
                }
                now = now + x;
                // System.out.println(now);
            } else if (order.equals("L")) {
                for (int j = now; j > now - x; j--) {
                    arr[j] += 1;
                }
                now = now - x;
                // System.out.println(now);

            }
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}