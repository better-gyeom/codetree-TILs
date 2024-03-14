import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (!div2(i) && !end5(i) && !div3(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean div2(int i) {
        return i % 2 == 0;
    }

    public static boolean end5(int i) {
        return i % 10 == 5;
    }

    public static boolean div3(int i) {
        return i % 3 == 0 && i % 9 != 0;
    }
}