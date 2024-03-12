import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        findGCD(n, m);
    }

    public static void findGCD(int n, int m) {
        int common = 0;
        
        for (int i = 1; i <= Math.min(n, m); i++) {
                if (n % i == 0 && m % i == 0) {
                    common = i;
                } //손으로 풀땐 약수들을 곱해가지만
                //코드로 풀땐 계속 증가시키면서 나누어지는 가장 큰수를 찾으면 된다..!
                
            }
        
        System.out.println(common);
    }
}