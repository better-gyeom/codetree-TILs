import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2001][2001];
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                int mx1 = sc.nextInt() + 1000;
                int my1 = sc.nextInt() + 1000;
                int mx2 = sc.nextInt() + 1000;
                int my2 = sc.nextInt() + 1000;

                for (int x = mx1; x < mx2; x++) {
                    for (int y = my1; y < my2; y++) {
                        arr[x][y] = 2;
                    }
                }
            } else {
                int x1 = sc.nextInt() + 1000;
                int y1 = sc.nextInt() + 1000;
                int x2 = sc.nextInt() + 1000;
                int y2 = sc.nextInt() + 1000;

                for (int x = x1; x < x2; x++) {
                    for (int y = y1; y < y2; y++) {
                        arr[x][y] = 1;
                    }
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