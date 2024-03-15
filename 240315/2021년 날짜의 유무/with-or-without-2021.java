import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int D = input.nextInt();

        if (isExist(M, D)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isExist(int m, int d) {
        if (1 <= m && m <= 12) {
            if ((1 <= d && d <= 28) || d == 30 || d == 31) {
                return true;
            }
        }
        return false;
    }
}