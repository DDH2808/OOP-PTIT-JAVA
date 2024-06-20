import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String name ;
    private int age;
    private static int numberOfStudent = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfStudent++;
    }

    public void display() {
        if (age >= 18) {
            System.out.println(name);
        }
    }

    public static int getNumberOfStudent() {
        return numberOfStudent;
    }
}



public class ELAB2302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (sc.hasNextLine()) {
            String name = sc.nextLine().trim();
            int age = Integer.parseInt(sc.nextLine().trim());

            Student student = new Student(name, age);
            student.display();
            students.add(student);
        }
        System.out.println(Student.getNumberOfStudent());

        sc.close();
    }
}