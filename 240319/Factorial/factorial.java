import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        System.out.println(factorial(N));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return factorial(n - 1) * n;
    }
}