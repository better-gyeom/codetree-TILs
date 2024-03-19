import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        System.out.println(fibonachi(N));
    }

    public static int fibonachi(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        return fibonachi(n - 1) + fibonachi(n - 2);
    }
}