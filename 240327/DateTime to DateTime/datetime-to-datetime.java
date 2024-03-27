import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(how(a, b, c));
        
        //차이를 계산해버리고 그게 음수면 -1 출력하는 방법이 있다..........
    }

    public static int how(int a, int b, int c) {
        if (a == 11) {
            if (b < 11) {
                return -1;
            }

            if (c < 11) {
                return -1;
            }
        }
        
        int days = a - 11;
        int hours = b - 11;
        int minutes = c - 11;

        return (days * 24 * 60) + (hours * 60) + minutes;
    }
}