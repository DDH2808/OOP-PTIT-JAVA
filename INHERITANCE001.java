class Person{
    protected String name;
    protected String address;

    public Person (String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String toString(){
        return name + " - " + address;
    }
}

class Student extends Person {
    private static int credit = 0;

    public Student (String name, String address){
        super(name, address);
    }

    public void study(){
        credit++;
    }

    public static int getCredits(){
        return credit;
    }

    public void printCredits(){
        System.out.println("Study credits " + credit);
    }
}

public class INHERITANCE001 {
    public static void main(String[] args) {
        Student student = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        System.out.println(student.toString()); 

        student.printCredits(); 

        student.study(); 

        student.printCredits();
    }
}
