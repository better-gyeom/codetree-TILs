import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(check(str));
    }

    public static int check(String str) {
        char[] arr = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == ')') {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}