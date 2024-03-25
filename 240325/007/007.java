import java.util.*;

class Spy {
    String code;
    String location;
    int time;

    public Spy(String code, String location, int time) {
        this.code = code;
        this.location = location;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String location = sc.next();
        int time = sc.nextInt();

        Spy spy = new Spy(code, location, time);

        System.out.println("secret code : " + spy.code);
        System.out.println("meeting point : " + spy.location);
        System.out.println("time : " + spy.time);
    }
}