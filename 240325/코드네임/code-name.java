import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Agent[] agent = new Agent[5];
        
        int idx = 0;
        int minV = 101;
        for (int i = 0; i < 5; i++) {
            String codeName = sc.next();
            int score = sc.nextInt();

            agent[i] = new Agent(codeName, score);

            if (agent[i].score < minV) {
                minV = agent[i].score;
                idx = i;
            }
        }

        System.out.println(agent[idx].codeName + " " + agent[idx].score);
    }
}

class Agent {
    String codeName;
    int score;

    public Agent(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}