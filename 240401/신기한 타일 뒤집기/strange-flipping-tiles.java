import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] colored = new int[2000001];

        int now = 10000;
        for (int i = 0; i < n; i++) {
            int dis = sc.nextInt();
            String dir = sc.next();

            if (dir.charAt(0) == 'R') {
                for (int j = now; j < now + dis; j++) {
                    colored[j] = 1;
                }
                now = now + dis - 1;
            } else {
                for (int j = now - dis + 1; j < now + 1; j++) {
                    
                    colored[j] = 2;
                }
                now = now - dis + 1;
            }
        }

        int b = 0;
        int w = 0;
        for (int i = 0; i < colored.length; i++) {
            if (colored[i] == 1) {
                b++;
            } else if (colored[i] == 2) {
                w++;
            } else {
                continue;
            }
        }

        System.out.println(w + " " + b);
    }
}