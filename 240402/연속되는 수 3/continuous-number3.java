import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 1;
        int maxV = 0;
        for (int i = 1; i < N; i++) {
            if (arr[i] * arr[i - 1] > 0) {
                cnt++;
            } else {
                cnt = 1;
            }

            maxV = Math.max(cnt, maxV);

        }

        System.out.println(maxV);
    }
}