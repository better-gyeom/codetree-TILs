import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);

        int Y = input.nextInt();
        int M = input.nextInt();
        int D = input.nextInt();

        System.out.println(isExist(Y, M, D));
    }

    public static String isExist(int y, int m, int d) {
        if (3 <= m && m <= 5 && d <= maxDay(y, m)) {
            return "Spring";
        } else if (6 <= m && m <= 8 && d <= maxDay(y, m)) {
            return "Summer";
        } else if (9 <= m && m <= 11 && d <= maxDay(y, m)) {
            return "Fall";
        } else if ((m == 12 || m == 1 || m == 2) && d <= maxDay(y, m)) {
            return "Winter";
        }
        return "-1";
    }

    public static int maxDay(int y, int m) {
        if (m == 2) {
            if (isLeafYear(y)) {
                return 29;
            } else {
                return 28;
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }
        return 31;
    }

    public static boolean isLeafYear(int y) {
        if (y % 4 != 0) {
            return false;
        }

        if (y % 100 != 0) {
            return true;
        }

        if (y % 400 == 0) {
            return true;
        }

        return false;
    }
}