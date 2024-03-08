import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int maxV = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sumV = 0;
            for (int j = 0; j < n; j++) {
                sumV += arr[j] * Math.abs(i - j);
            }

            if (sumV < maxV) {
                maxV = sumV;
            }
        }

        System.out.println(maxV);
    }
}