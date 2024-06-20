interface Pet{
    String getName();
    void setName(String name);
    void play();
}


abstract class Animal {
    protected int numLegs;

    public Animal(int numLegs) {
        this.numLegs = numLegs;
    }

    public void eat(){
        System.out.println("This animal eats.");
    }

    public void walk() {
        System.out.printf("This animal walks on %d legs.\n", numLegs);
    }
}

class Spider extends Animal {

    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider eats a fly.");
    }
}

class Cat extends Animal implements Pet{

    private String name;

    public Cat() {
        super(4);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and mice.");
    }

    public void play() {
        System.out.printf("%s likes to play with string.\n", name);
    }
}

class Fish extends Animal implements Pet{

    private String name;


    public Fish() {
        super(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public void eat() {
        System.out.println("Fish eat pond scum.");
    }
    
    @Override
    public void play() {
        System.out.println("Fish swim in their tanks all day.");
    }
    
    @Override
    public void walk() {
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim.");
    }
}

public class INHERITANCE006 {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("Fish");
        fish.play();
        fish.walk();

        Cat fluffy = new Cat();
        fluffy.setName("Fluffy");
        fluffy.play();
        fluffy.eat();

        Spider spider = new Spider();
        spider.eat();
        fluffy.walk();
        spider.walk();
    }
}