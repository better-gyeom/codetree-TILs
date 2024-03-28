import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] visited = new int[2001];
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        String[] dirs = new String[n];
        String[] colors = new String[2001];

        int cur = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String dir = sc.next();

            if (dir.equals("R")) {
                x1[i] = cur;
                x2[i] = cur + x;
                dirs[i] = "R";

                cur += x;
            } else {
                x1[i] = cur - x;
                x2[i] = cur;
                dirs[i] = "L";

                cur -= x;
            }

            x1[i] += 1000;
            x2[i] += 1000;

            
        }

        for (int i = 0; i < n; i++) {
            for (int j = x1[i]; j < x2[i]; j++) {
                visited[j]++;
                if (dirs[i].equals("R") && visited[j] <= 3) {
                    colors[j] = "B";
                } else if (dirs[i].equals("L") && visited[j] <= 3) {
                    colors[j] = "W";
                } else if (visited[j] >= 4) {
                    colors[j] = "G";
                }
            }
        }

        int w = 0;
        int b = 0;
        int g = 0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == null) {
                continue;
            }

            if (colors[i].equals("B")) {
                b++;
            } else if (colors[i].equals("W")) {
                w++;
            } else if (colors[i].equals("G")) {
                g++;
            }
        }

        System.out.println(w + " " + b + " " + g);
    }
}