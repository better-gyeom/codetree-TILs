import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[201][201];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int x = x1 + 100; x < x2 + 100; x++) {
                for (int y = y1 + 100; y < y2 + 100; y++) {
                    arr[x][y] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}