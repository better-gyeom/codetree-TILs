import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mid(n, arr);
    }

    public static void mid(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            
            if (i % 2 == 0) { //홀수번째 수는 실제로 짝수 인덱스이기 때문에
                Arrays.sort(arr, 0, i + 1); //정렬도 i + 1까지 해야함

                System.out.print(arr[i / 2] + " ");
            }
        }
    }
}