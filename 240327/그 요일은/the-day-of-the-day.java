import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int startDay = totalDays(m1, d1);
        int endDay = totalDays(m2, d2);

        int diff = endDay - startDay + 1;

        System.out.println(diff / 7 + 1);

    }

    public static int totalDays(int m, int d) {
        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 0;
        for (int i = 1; i < m; i++) {
            days += monthDays[i];
        }
        days += d;

        return days;
    }
}