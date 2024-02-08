package application;

import entities.Students;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> list = Arrays.asList("course A", "course B", "course C");
        Set<Students> y = new HashSet<>();

        for (String x : list) {
            System.out.print("How many students have in " + x + "? ");
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                System.out.print("Student enrollment " + i + ": ");
                int registration = sc.nextInt();

                Students student = new Students(registration);
                y.add(student);
            }
        }

        System.out.println();
        /*
        will return the total number of students,
        not including repetitions
         */
        System.out.print("Total students: " + y.size());
    }
}
