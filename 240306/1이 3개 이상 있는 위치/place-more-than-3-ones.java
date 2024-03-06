import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int ans = 0;
        int n = input.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = i;
                int y = j;
                int cnt = 0;
                for (int dirNum = 0; dirNum < 4; dirNum++) {
                    int nx = x + dx[dirNum], ny = y + dy[dirNum];
                    if (0 <= nx && nx < n && 0 <= ny && ny < n && arr[nx][ny] == 1) {
                        cnt++;
                    }
                }
                if (cnt >= 3) {
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }
}