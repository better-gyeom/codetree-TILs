import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Info[] infoes = new Info[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            infoes[i] = new Info(date, day, weather);
            
            //전역객체를 만들어서 infoes의 rain인 것들 중 날짜를 compareTo해서 최근일 경우
            //전역객체의 값을 업데이트 시키는 방법도 사용할 수 있음
        }

        Info[] rains = new Info[101];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (infoes[i].weather.equals("Rain")) {
                rains[idx] = new Info(infoes[i].date ,infoes[i].day, infoes[i].weather);
                idx++;
            }
        }

        int x = 0;
        for (int i = 1; i < idx; i++) {
            if (rains[i].date.compareTo(rains[x].date) < 0) {
                x = i;
            }
        }

        System.out.println(rains[x].date + " " + rains[x].day + " " + rains[x].weather);
    }
}

class Info {
    String date;
    String day;
    String weather;

    public Info(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}