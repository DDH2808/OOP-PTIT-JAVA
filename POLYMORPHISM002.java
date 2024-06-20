import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Moveable {
    void move(int dx, int dy);
}

class Organism implements Moveable {

    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x:" + x + ";y:" + y;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}

class Herd {

    private List<Organism> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    public void addToHerd(Moveable moveable) {
        if (moveable instanceof Organism) {
            organisms.add((Organism) moveable);
        }
    }

    public void move() {
        for (Organism organism : organisms) {
            organism.move(1, 1);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Organism organism : organisms) {
            sb.append(organism).append("\n");
        }
        return sb.toString();
    }
}

public class POLYMORPHISM002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Herd herd = new Herd();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            herd.addToHerd(new Organism(x, y));
        }

        herd.move();
        System.out.println(herd);
    }
}