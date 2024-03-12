import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        findLCM(n, m);
    }

    public static void findLCM(int n, int m) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        n = n / gcd;
        m = m / gcd;
        int lcm = n * m * gcd;
        System.out.println(gcd);
    }
}