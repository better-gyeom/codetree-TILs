import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String o = input.next();
        int c = input.nextInt();

        String ans = calculator(a, o, c);
        System.out.println(a + " " + o + " " + c + " = " + ans);
    }

    public static String calculator(int a, String o, int c) {
        String ans = "";
        if (o.equals("+")) {
            ans = String.valueOf(a + c);
        } else if (o.equals("-")) {
            ans = String.valueOf(a - c);
        } else if (o.equals("/")) {
            ans = String.valueOf(a / c);
        } else if (o.equals("*")) {
            ans = String.valueOf(a * c);
        } else {
            ans = "False";
        }

        return ans;
    }
}