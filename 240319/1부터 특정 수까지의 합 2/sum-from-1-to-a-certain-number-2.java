import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        System.out.println(sumV(N));
    }

    public static int sumV(int n) {
        if (n == 1) {
            return 1;
        }

        return sumV(n - 1) + n;
    }
}