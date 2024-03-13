import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println(sumFunction(N));
    }

    public static int sumFunction(int n) {
        int sumV = 0;
        if (n % 2 == 0) {
            sumV = (1 + n) * (n / 2);
        } else {
            sumV = ((1 + n) * (n / 2)) + (n / 2 + 1);
        }

        return sumV / 10;
    }
}