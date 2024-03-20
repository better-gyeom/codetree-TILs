import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(sumFun(a * b * c));
    }

    public static int sumFun(int num) {
        if (num < 10) {
            return num;
        }

        return sumFun(num / 10) + (num % 10);
    }
}