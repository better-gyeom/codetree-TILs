import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int D = input.nextInt();

        if (isExist(M, D)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isExist(int m, int d) {
        if (m == 1) {
            if (1 <= d && d <= 31) {
                return true;
            }
        } else if (m == 2) {
            if (1 <= d && d <= 28) {
                return true;
            }
        } else if (m == 3) {
            if (1 <= d && d <= 31) {
                return true;
            }
        } else if (m == 4) {
            if (1 <= d && d <= 30) {
                return true;
            }
        } else if (m == 5) {
            if (1 <= d && d <= 31) {
                return true;
            }
        } else if (m == 6) {
            if (1 <= d && d <= 30) {
                return true;
            }
        } else if (m == 7) {
            if (1 <= d && d <= 31) {
                return true;
            }
        } else if (m == 8) {
            if (1 <= d && d <= 31) {
                return true;
            }
        } else if (m == 9) {
            if (1 <= d && d <= 30) {
                return true;
            }
        } else if (m == 10) {
            if (1 <= d && d <= 31) {
                return true;
            }
        } else if (m == 11) {
            if (1 <= d && d <= 30) {
                return true;
            }
        } else if (m == 12) {
            if (1 <= d && d <= 31) {
                return true;
            }
        }
        return false;
    }
    //다른 방법
    //4, 5, 9, 11월일땐 30을 반환, 2일땐 28, 그 외엔 31을 반환하는 함수를 만들고
    //또 다른 함수에서 1월과 12월 사이인지 확인 && 그 월에 맞는 일수인지 확인 하여 true/false 반환
}