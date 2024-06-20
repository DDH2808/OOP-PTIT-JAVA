import java.util.ArrayList;

class Item {
    private String name;
    private int weight;

    public Item (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}

abstract class Box {
    public abstract void add(Item item);
    public abstract boolean isInBox(Item item);
}

class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item>  items;

    public BoxWithMaxWeight (int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(item.getWeight() <= maxWeight){
            items.add(item);
            maxWeight -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item i : items) {
            if (i.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }
}

public class test {
    public static void main(String[] args) {
        BoxWithMaxWeight box = new BoxWithMaxWeight(10);
        
        Item item1 = new Item("Saludo", 5);
        Item item2 = new Item("Pirkka", 5);
        Item item3 = new Item("Kopi", 5);

        box.add(item1);
        box.add(item2);
        box.add(item3);

        System.out.println(box.isInBox(item1)); // true
        System.out.println(box.isInBox(item2)); // true
        System.out.println(box.isInBox(item3)); // false
    }
}