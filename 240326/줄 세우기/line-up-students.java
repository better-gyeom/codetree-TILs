import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int heigth = sc.nextInt();
            int weight = sc.nextInt();
            int num = i + 1;

            students[i] = new Student(heigth, weight, num);
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            System.out.println(students[i].heigth + " " + students[i].weight + 
            " " + students[i].num);
        }
    }
}

class Student implements Comparable<Student> {
    int heigth;
    int weight;
    int num;

    public Student(int heigth, int weight, int num) {
        this.heigth = heigth;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student) {
        if (this.heigth == student.heigth) {
            if (this.weight == student.weight) {
                return this.num - student.num;
            }
            return student.weight - this.weight;
        }
        return student.heigth - this.heigth;
    }
}