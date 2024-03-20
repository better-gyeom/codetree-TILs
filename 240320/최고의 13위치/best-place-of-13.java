import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(best13(n, arr));
    }

    public static int best13(int n, int[][] arr) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            int coin = 0;
            for (int j = 0; j < n - 2; j++) {
                coin = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                if (coin > max) {
                    max = coin;     
                }
            }


        }
        return max;
    }
}