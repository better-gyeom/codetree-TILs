import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        printNum(N);
    }

    public static void printNum(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printNum(n - 1);
        System.out.print(n + " ");
    }
}