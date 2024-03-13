import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(isCount(a, b));
    }

    public static int isCount(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || haveNum(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean haveNum(int i) {
        String check = String.valueOf(i);
        if (check.contains("3") || check.contains("6") || check.contains("9")) {
            return true;
        } else {
            return false;
        }

    }
}