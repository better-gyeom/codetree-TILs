import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        printSquare(N);
    }

    public static void printSquare(int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (k % 10 == 0) {
                    k++;
                }
                System.out.print(k % 10 + " ");
                k++;
            }
            System.out.println();
        }
    }
}