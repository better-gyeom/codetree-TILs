import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int m1TotalDays = totalDays(m1, d1);
        int m2TotalDays = totalDays(m2, d2);

        System.out.println(m2TotalDays - m1TotalDays + 1);
    }

    public static int totalDays(int m, int d) {
        int days = 0;
        for (int i = 0; i < m; i++) {
            days += howDays(i);
        }
        days += d;

        return days;
    }

    public static int howDays(int m) {
        if (m == 2) {
            return 28;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }
        return 31;
    }
}