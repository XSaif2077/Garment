package MyPackage;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Teacher t1 = new Teacher();
        System.out.print("Teacher's Name: ");
        String teacherName;
        teacherName = sc.nextLine();
        System.out.print("Age: ");
        int teacherAge = sc.nextInt();
        System.out.print("Salary: ");
        int teacherSalary = sc.nextInt();
        t1.setDetails(teacherName, teacherAge, teacherSalary);

        Student s1 = new Student();
        sc.nextLine();
        System.out.print("Student's Name: ");
        String studentName = sc.nextLine();
        System.out.print("Age: ");
        int studentAge = sc.nextInt();
        System.out.print("CGPA: ");

        t1.showName();
        t1.showAge();
        t1.getSalary();

        s1.showName();
        s1.showAge();
        s1.showCgpa();

        sc.close();
    }
}
