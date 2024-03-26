import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Number[] numbers = new Number[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int idx = i + 1;
            numbers[i] = new Number(num, idx);
        }

        Arrays.sort(numbers, (a, b) -> a.num - b.num);
        int[] numToRank = new int[n + 1];
        for (int i = 0; i < n; i++) {
            numToRank[numbers[i].idx] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numToRank[i + 1] + " ");
        }
    }
}

class Number {
    int num;
    int idx;

    public Number(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }
}