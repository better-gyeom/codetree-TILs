import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Location[] locations = new Location[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int num = i + 1;

            locations[i] = new Location(x, y, num);
        }

        Arrays.sort(locations);
        for (int i = 0; i < n; i++) {
            System.out.println(locations[i].num);
        }
    }
}

class Location implements Comparable<Location> {
    int x;
    int y;
    int num;

    public Location(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }

    @Override
    public int compareTo(Location location) {
        int thisDistance = Math.abs(this.x - 0) + Math.abs(this.y - 0);
        int locaDistance = Math.abs(location.x - 0) + Math.abs(location.y - 0);
        if (thisDistance == locaDistance) {
            return this.num - location.num;
        }
        return thisDistance - locaDistance;
    }
}