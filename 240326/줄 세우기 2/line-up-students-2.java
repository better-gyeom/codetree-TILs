import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int idx = i + 1;

            students[i] = new Student(idx, h, w);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.h == b.h) {
                    return b.w - a.w;
                }
                return a.h - b.h;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(students[i].h + " " + students[i].w + " "
            + students[i].idx);
        }
    }
}

class Student {
    int idx;
    int h;
    int w;

    public Student(int idx, int h, int w) {
        this.idx = idx;
        this.h = h;
        this.w = w;
    }
}