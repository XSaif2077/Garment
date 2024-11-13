package MyPackage;

public class Teacher {

    String name;
    int age;
    private int salary;

    public void setDetails(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void showName() {
        System.out.println("Teacher's Name: " + name);
    }

    public void showAge() {
        System.out.println("Teacher's Age: " + age);
    }

    public void getSalary() {
        System.out.println("Teacher's Salary: " + salary);
    }
}
