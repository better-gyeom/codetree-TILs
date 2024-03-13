import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isMagicNum(n));
    }

    public static String isMagicNum(int n) {
        int sumV = 0;
        if (n % 2 == 0) {
            while (n >= 10) {
            sumV += n / 10;
            n = n % 10;
            }

            if ((sumV + n) % 5 == 0) {
                return "Yes";
            }
        }
        return "No";
    }
}