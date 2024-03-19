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

        System.out.println(maxV((n - 1), arr)); //인덱스 오류 나지 않게
    }

    public static int maxV(int i, int[] arr) {
        if (i == 0) {
            return arr[0];
        }

        return Math.max(maxV(i - 1, arr), arr[i]);
    }
}