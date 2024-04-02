import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[201][201];
        for (int i = 0; i < n; i++) {
            int lx = sc.nextInt() + 100;
            int ly = sc.nextInt() + 100;

            for (int x = lx; x < lx + 8; x++) {
                for (int y = ly; y < ly + 8; y++) {
                    arr[x][y] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}