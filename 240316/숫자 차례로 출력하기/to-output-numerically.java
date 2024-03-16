import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        printNum(N);
        System.out.println();
        printNumRev(N);
        System.out.println();
    }

    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        
        printNum(n - 1);
        System.out.print(n + " ");

    }

    public static void printNumRev(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printNumRev(n - 1);
    }
}