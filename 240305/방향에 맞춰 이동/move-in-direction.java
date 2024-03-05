import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int x = 0; 
        int y = 0;

        int[] dx = new int[]{0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 0; i < N; i++) {
            String location = input.next();
            int distance = input.nextInt();

            if (location.equals("N")) {
                x = x + (dx[0] * distance);
                y = y + (dy[0] * distance);
            } else if (location.equals("E")) {
                x = x + (dx[3] * distance);
                y = y + (dy[3] * distance);
            } else if (location.equals("S")) {
                x = x + (dx[2] * distance);
                y = y + (dy[2] * distance);
            } else if (location.equals("W")) {
                x = x + (dx[1] * distance);
                y = y + (dy[1] * distance);
            }
            
        }
        System.out.print(x + " ");
        System.out.println(y);
    }
}