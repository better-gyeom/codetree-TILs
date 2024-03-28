import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] xy = new int[n][2];
        for (int i = 0; i < n; i++) {
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }

        int minV = 101;
        for (int i = 0; i < xy.length; i++) {
            minV = Math.min(Math.min(xy[i][0], xy[i][1]), minV);
        }

        for (int i = 0; i < xy.length; i++) {
            xy[i][0] += Math.abs(minV);
            xy[i][1] += Math.abs(minV);
        }

        int[] arr = new int[202];
        for (int i = 0; i < xy.length; i++) {
            for (int j = xy[i][0]; j < xy[i][1]; j++) {
                arr[j] += 1;
            }
        }

        int maxV = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxV) {
                maxV = arr[i];
            }
        }

        System.out.println(maxV);
    }
}