import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println(whereIs(n, k, T, arr));
    }

    public static String whereIs(int n, int k, String T, String[] arr) {
        Arrays.sort(arr);

        List<String> starts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i].startsWith(T)) {
                starts.add(arr[i]);
            }
        }

        return starts.get(k - 1);
    }
}