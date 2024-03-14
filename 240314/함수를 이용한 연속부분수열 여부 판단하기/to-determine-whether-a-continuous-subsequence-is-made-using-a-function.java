import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        for (int j = 0; j < n2; j++) {
            arr2[j] = scanner.nextInt();
        }

        if (n1 >= n2 && isSubArr(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isSubArr(int[] arr1, int[] arr2) {
        int startIdx = 0;
        int correctCnt = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[0]) {
                startIdx = i;
                break;
            }
        }

        for (int j = 0; j < arr2.length; j++) {
            if (arr2[j] == arr1[j + startIdx]) {
                correctCnt++;
            }
        }

        if (correctCnt == arr2.length) {
            return true;
        } else {
            return false;
        }

    }
}