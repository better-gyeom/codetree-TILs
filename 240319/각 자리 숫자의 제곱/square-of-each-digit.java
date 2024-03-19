import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        System.out.println(powSumV(N));
    }

    public static int powSumV(int n) {
        if (n < 10) {
            return n * n;
        }

        return powSumV(n / 10) + ((n % 10) * (n % 10));
    }
}