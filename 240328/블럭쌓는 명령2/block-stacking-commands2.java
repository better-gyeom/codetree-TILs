import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a; j <= b; j++) {
                arr[j] += 1;
            }
        }

        int maxV = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxV) {
                maxV = arr[i];
            }
        }

        System.out.println(maxV);
    }
}