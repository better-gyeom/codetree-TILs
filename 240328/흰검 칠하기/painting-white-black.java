import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] black = new int[10000];
        int[] white = new int[10000];
        int[] colors = new int[10000];

        int cur = 1000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String dir = sc.next();

            if (dir.equals("R")) {
                for (int j = cur; j < cur + x; j++) {
                    black[j]++;
                    colors[j] = 2;
                }
                cur += x - 1;
            } else {
                for (int j = cur - x + 1; j < cur + 1; j++) {
                    white[j]++;
                    colors[j] = 1;
                }
                cur -= x - 1;
            }
            
        }

        int w = 0;
        int b = 0;
        int g = 0;
        for (int i = 0; i < colors.length; i++) {
            if (white[i] >= 2 && black[i] >= 2) {
                g++;
            } else if (colors[i] == 1) {
                w++;
            } else if (colors[i] == 2) {
                b++;
            }
        }

        System.out.println(w + " " + b + " " + g);
    }
}