import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String[] strArr = str.split("");

        int cnt = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("(")) {
                for (int j = i; j < strArr.length; j++) {
                    if (strArr[j].equals(")")) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}