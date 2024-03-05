import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int dirNum = 3; //현재 북쪽을 바라봄
        while (input.hasNext()) {
            String order = input.nextLine();
            String[] orders = order.split("");
            for (String o : orders) {
                if (o.equals("L")) { //왼쪽으로 90도 회전
                    dirNum = (dirNum - 1 + 4) % 4; //반시계 방향
                } else if (o.equals("R")) { //오른쪽으로 90도 회전
                    dirNum = (dirNum + 1) % 4; //시계 방향
                } else if (o.equals("F")) {
                    x = x + dx[dirNum];
                    y = y + dy[dirNum];
                }
            }
        }
        System.out.print(x + " ");
        System.out.println(y);
    }
}