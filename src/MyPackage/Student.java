package MyPackage;

public class Student {

    String name;
    int age;
    double cgpa;

    public void setDetails(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    public void showName() {
        System.out.println("Student's Name: " + name);
    }

    public void showAge() {
        System.out.println("Student's Age: " + age);
    }

    public void showCgpa() {
        System.out.println("Student's CGPA: " + cgpa);
    }
}
