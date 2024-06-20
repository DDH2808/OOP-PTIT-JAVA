abstract class  TacoBox {
    protected int numTacos;

    public TacoBox(int numTacos) {
        this.numTacos = numTacos;
    }

    public abstract void eat();

    public int tacoRemaining() {
        return numTacos;
    }
}

class TripleTacoBox extends TacoBox {

    public TripleTacoBox() {
        super(3);
    }

    @Override
    public void eat() {
        if (numTacos > 0) {
            numTacos--;
        }
    }
}

class CustomTacoBox extends TacoBox {

    public CustomTacoBox(int initialTacos) {
        super(initialTacos);
    }

    @Override
    public void eat() {
        if (numTacos > 0) {
            numTacos--;
        }
    }
}

public class INTERFACE002 {

    public static void main(String[] args) {
        TripleTacoBox tripleTacoBox = new TripleTacoBox();
        tripleTacoBox.eat();
        tripleTacoBox.eat();
        System.out.println("Triple taco boxes left: " + tripleTacoBox.tacoRemaining());

        CustomTacoBox customTacoBox = new CustomTacoBox(8);
        customTacoBox.eat();
        System.out.println("Custom taco boxes left: " + customTacoBox.tacoRemaining());
    }
}