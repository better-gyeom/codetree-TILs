import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        String[][] arr = new String[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.next();
            }
        }

        System.out.println(success(R, C, arr));
    }

    public static int success(int r, int c, String[][] arr) {
        int ri = 0;
        int cj = 0;
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                if (!arr[i][j].equals(arr[0][0])) {
                    ri = i;
                    cj = j;
                    break;
                }
            }
        }
        int cnt = 0;
        for (int i = ri + 1; i < r - 1; i++) {
            for (int j = cj + 1; j < c - 1; j++) {
                if (!arr[i][j].equals(arr[ri][cj])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}