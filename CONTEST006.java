import java.util.Scanner;

class Money {
  private int euros;
  private int cents;

  // Constructor
  public Money(int euros, int cents) {
    this.euros = euros;
    this.cents = cents;

    // Đảm bảo cents nằm trong phạm vi 0-99
    if (cents < 0 || cents > 99) {
      throw new IllegalArgumentException("Cents must be between 0 and 99.");
    }
  }

  // Hàm toString() để hiển thị thông tin Money dưới dạng chuỗi
  @Override
  public String toString() {
    return String.format("%d.%02de",euros,cents);
  }

  public Money plus(Money added) {
    int totalEuros = euros + added.euros;
    int totalCents = cents + added.cents;
    if (totalCents >= 100) {
        totalEuros++;
        totalCents -= 100;
    }
    return new Money(totalEuros, totalCents);
}

public boolean lessThan(Money compared) {
    if (euros < compared.euros) {
        return true;
    } else if (euros == compared.euros && cents < compared.cents) {
        return true;
    }
    return false;
}

public Money minus(Money minus) {
    int totalEuros = euros - minus.euros;
    int totalCents = cents - minus.cents;
    if (totalCents < 0) {
        totalEuros--;
        totalCents += 100;
    }
    if (totalEuros < 0) {
        return new Money(0, 0);
    }
    return new Money(totalEuros, totalCents);
}
}

public class CONTEST006 {
    public static void main(String[] args) {
        Money a = new Money(10, 8);
        Money b = new Money(5, 5);
        Money c = a.plus(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    
        Money u = new Money(10, 0);
        Money v = new Money(3, 0);
        Money w = new Money(5, 0);
        System.out.println(u.lessThan(v)); // false
        System.out.println(v.lessThan(w)); // true
    
        Money m = new Money(10, 0);
        Money n = new Money(3, 50);
        Money o = m.minus(n);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
    
        o = o.minus(m);
        System.out.println(o);
    }
}
