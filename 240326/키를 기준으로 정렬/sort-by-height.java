import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int heigth = sc.nextInt();
            int weigth = sc.nextInt();

            students[i] = new Student(name, heigth, weigth);
        }

        Arrays.sort(students, (a, b) -> a.heigth - b.heigth);

        for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].heigth
            + " " + students[i].weigth);
        }
    }
}

class Student {
    String name;
    int heigth;
    int weigth;

    public Student(String name, int heigth, int weigth) {
        this.name = name;
        this.heigth = heigth;
        this.weigth = weigth;
    }
}