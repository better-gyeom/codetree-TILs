import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[2001];
        int[] x1 = new int[2001];
        int[] x2 = new int[2001];

        int cur = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String order = sc.next();

            if (order.equals("R")) {
                x1[i] = cur;
                x2[i] = cur += x;

                cur += x;
            } else if (order.equals("L")) {
                x1[i] = cur - x;
                x2[i] = cur;

                cur -= x;
            }

            x1[i] += 1000;
            x2[i] += 1000;
        }

        for (int i = 0; i < n; i++) {
            for (int j = x1[i]; j < x2[i]; j++) {
                arr[j]++;
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