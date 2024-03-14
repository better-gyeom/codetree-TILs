import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String o = input.next();
        int c = input.nextInt();

        
        int ans = 0;
        if (o.equals("+")) {
            ans = sum(a, c);
            System.out.println(a + " " + o + " " + c + " = " + ans);
        } else if (o.equals("-")) {
            ans = minus(a, c);
            System.out.println(a + " " + o + " " + c + " = " + ans);
        } else if (o.equals("/")) {
            ans = div(a, c);
            System.out.println(a + " " + o + " " + c + " = " + ans);
        } else if (o.equals("*")) {
            ans = mul(a, c);
            System.out.println(a + " " + o + " " + c + " = " + ans);
        } else {
            System.out.println("False");
        }
    }

    public static int sum(int a, int c) {
        return a + c;
    }
    public static int minus(int a, int c) {
        return a - c;
    }
    public static int div(int a, int c) {
        return a / c;
    }
    public static int mul(int a, int c) {
        return a * c;
    }

    


}