import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        System.out.println(sumFun(N));
    }

    public static int sumFun(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        if (n % 2 == 0) {
            return sumFun(n - 2) + n;
        } else {
            return sumFun(n - 2) + n;
        }
    }
}