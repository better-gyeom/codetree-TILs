import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String newId = sc.next();
        int newLevel = sc.nextInt();

        NextLevel nextLevel = new NextLevel();

        System.out.println("user " + nextLevel.id + " lv " + nextLevel.level);

        nextLevel.id = newId;
        nextLevel.level = newLevel;

        System.out.println("user " + nextLevel.id + " lv " + nextLevel.level);

    }
}

class NextLevel {
    String id;
    int level;

    public NextLevel() {
        this.id = "codetree";
        this.level = 10;
    }

    public NextLevel(String id, int level) {
        this.id = id;
        this.level = level;
    }
}