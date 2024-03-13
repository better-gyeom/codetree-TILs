import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(findMinV(a, b, c));
    }

    public static int findMinV(int a, int b, int c) {
        int minV = Math.min(Math.min(a, b), c);
        return minV;
    }
}