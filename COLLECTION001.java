import java.util.HashMap;

class Warehouse {
    HashMap<String, Integer> stock;
    public Warehouse() {
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int stock){
        this.stock.put(product, stock);
    }

    public int getStock(String product) {
        return this.stock.getOrDefault(product, -99);
    }
}

public class COLLECTION001 {
    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        w.addProduct("milk", 10);
        w.addProduct("coffee", 7);
        System.out.println("prices:");
        System.out.println("milk: " + w.getStock("milk"));
        System.out.println("coffee: " + w.getStock("coffee"));
        System.out.println("sugar: " + w.getStock("sugar"));
    }   
}

