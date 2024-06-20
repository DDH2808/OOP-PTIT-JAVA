import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws Exception {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new Exception("Name is not valid");
        }

        if (age < 0 || age > 120) {
            throw new Exception("Age is not valid");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "--Age:" + age;
    }
}

public class EXCEPTION004 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int age = scanner.nextInt();
            scanner.nextLine();

            try {
                Person person = new Person(name, age);
                System.out.println(person);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
