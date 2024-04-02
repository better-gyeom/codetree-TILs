import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2001][2001];

        int fx1 = sc.nextInt() + 1000;
        int fy1 = sc.nextInt() + 1000;
        int fx2 = sc.nextInt() + 1000;
        int fy2 = sc.nextInt() + 1000;

        for (int x = fx1; x < fx2; x++) {
            for (int y = fy1; y < fy2; y++) {
                arr[x][y] = 1;
            }
        }

        int sx1 = sc.nextInt() + 1000;
        int sy1 = sc.nextInt() + 1000;
        int sx2 = sc.nextInt() + 1000;
        int sy2 = sc.nextInt() + 1000;

        for (int x = sx1; x < sx2; x++) {
            for (int y = sy1; y < sy2; y++) {
                arr[x][y] = 2;
            }
        }

        int minX = 2002;
        int minY = 2002;
        int maxX = 0;
        int maxY = 0;

        boolean area = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    area = true;
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        // System.out.println(minX + " " + minY);
        // System.out.println(maxX + " " + maxY);
        if (!area) {
            System.out.println(0);
        } else {
            System.out.println((maxX - minX + 1) * (maxY - minY + 1));
        }
    }
}