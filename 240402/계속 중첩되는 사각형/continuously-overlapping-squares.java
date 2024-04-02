import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[201][201];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;

            if (i % 2 == 0) { //이 코드 대신에 삼항연산자를 이용하여 arr[x][y] = i % 2 ? 1 : 2 가능
                //red
                for (int x = x1; x < x2; x++) {
                    for (int y = y1; y < y2; y++) {
                        arr[x][y] = 1;
                    }
                }
            } else {
                //blue
                for (int x = x1; x < x2; x++) {
                    for (int y = y1; y < y2; y++) {
                        arr[x][y] = 2;
                    }
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 2) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}