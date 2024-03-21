import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(stranger(str));
    }

    public static int stranger(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            String newStr = "";
            char c = str.charAt(i);
            if (c == '1') {
                newStr = str.substring(0, i) + "0" + str.substring(i + 1);
                // System.out.println(newStr);
            } else if (c == '0') {
                newStr = str.substring(0, i) + "1" + str.substring(i + 1);
                // System.out.println(newStr);

            }
            int maxV = Integer.parseInt(newStr, 2);
            ans = Math.max(maxV, ans);
        }
        return ans;
    }
}