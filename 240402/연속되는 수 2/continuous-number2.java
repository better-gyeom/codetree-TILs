import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[1001];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxV = 0;
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                cnt++;
            }
            if (i == 0 || arr[i] != arr[i - 1]) {
                maxV = Math.max(cnt, maxV);
                cnt = 1;
            }
            
        }

        System.out.println(maxV);
    }
}