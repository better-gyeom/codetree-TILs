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

        sortArr(n, arr);
    }

    public static void sortArr(int n, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Integer[] newArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(newArr, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}