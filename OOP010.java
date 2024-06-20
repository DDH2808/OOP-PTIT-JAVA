
class Product{
    private String name;
    private String location;
    private int weight = 1;

    public Product(String name){
        this.name = name;
        this.location =  "shelf";
        this.weight = weight;
    }

    public Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public Product(String name, int weight){
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }
    
    public String toString(){
        return this.name + " (" + this.weight  + "kg) " + "can be found from the " + this.location;
    }
}
public class OOP010 {
public static void main(String[] args) {
    Product p1 = new Product("Tape measure");
    Product p2 = new Product("Plaster", "home improvement section");
    Product p3 = new Product("Tyre", 5);

    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());
}
}