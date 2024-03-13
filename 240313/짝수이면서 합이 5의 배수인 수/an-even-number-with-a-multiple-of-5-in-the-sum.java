import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (isMagicNum(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isMagicNum(int n) {
        int sumV = 0;
        if (n % 2 == 0) {
            while (n >= 10) {
            sumV += n / 10;
            n = n % 10;
            }

            if ((sumV + n) % 5 == 0) {
                return true;
            }
        }
        return false;
    }
}