import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        System.out.println(untilOne(N));
    }

    public static int untilOne(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {

            return untilOne(n / 2) + 1; //untilOne을 진행했을 때의 횟수 + 1번 소요
        } else {

            return untilOne(n / 3) + 1;

        }
    }
}