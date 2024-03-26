import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Score[] scores = new Score[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            scores[i] = new Score(name, kor, eng, math);
        }

        Arrays.sort(scores);
        for (int i = 0; i < n; i++) {
            System.out.println(scores[i].name + " " + scores[i].kor + " "
            + scores[i].eng + " " + scores[i].math);
        }


    }
}

class Score implements Comparable<Score> {
    String name;
    int kor;
    int eng;
    int math;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Score score) {
        return (this.kor + this.eng + this.math) - (score.kor + score.eng + score.math);
    }
}