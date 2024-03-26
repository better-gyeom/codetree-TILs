import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            System.out.println(students[i].name + " " + students[i].height + 
            " " + students[i].weight);
        }

        System.out.println();
        Arrays.sort(students, (a, b) -> b.height - a.height);

        System.out.println("height");
        for (int i = 0; i < 5; i++) {
            System.out.println(students[i].name + " " + students[i].height + 
            " " + students[i].weight);
        }
    }
}

class Student {
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}