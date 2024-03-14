import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(pow(a, b));
    }

    public static int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }
}