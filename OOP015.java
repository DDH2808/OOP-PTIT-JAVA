import java.util.Scanner;

class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " - " + address;
    }
}

public class OOP015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Bỏ qua dòng xuống sau số lượng test cases

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String address = scanner.nextLine();
            Person person = new Person(name, address);
            System.out.println(person.toString());
        }
    }
}