import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] infos = new Info[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String zipcode = sc.next();
            String location = sc.next();

            infos[i] = new Info(name, zipcode, location);
        }

        // 사전순으로 이름이 가장 느린 사람 찾기
        int lastIdx = 0;
        for(int i = 1; i < n; i++) {
            if(infos[i].name.compareTo(infos[lastIdx].name) > 0)
            //infos[i] name 값이 더 큰 경우 lastIdx를 i로 변경
                lastIdx = i;
        }

        System.out.println("name " + infos[lastIdx].name);
        System.out.println("addr " + infos[lastIdx].zipcode);
        System.out.println("city " + infos[lastIdx].location);
        
    }
}

class Info {
    String name;
    String zipcode;
    String location;

    public Info(String name, String zipcode, String location) {
        this.name = name;
        this.zipcode = zipcode;
        this.location = location;
    }
}