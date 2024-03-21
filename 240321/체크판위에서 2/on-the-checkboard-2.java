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
        int cnt = 0;
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                for (int k = i + 1; k < r - 1; k++) {
                    for (int l = j + 1; l < c - 1; l++) {
                        if (!arr[0][0].equals(arr[i][j]) &&
                            !arr[i][j].equals(arr[k][l]) &&
                            !arr[k][l].equals(arr[r - 1][c - 1])) {
                                cnt++;
                            }
                    }
                }
            }
        }
        return cnt;
    }
}