import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int cnt = 0;
        for (int n = a; n <= b; n++) {
            if (isPrime(n) && isEven(n)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int n) {
        int sumV = 0;
        while (n > 10) {
            sumV = n % 10;
            n = n / 10;
        }

        if ((sumV + n) % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}