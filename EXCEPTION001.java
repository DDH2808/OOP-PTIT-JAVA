import java.util.Scanner;

public class EXCEPTION001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            try {
                String[] parts = sc.nextLine().split(" ");
                check(new Amount(parts[0], Integer.parseInt(parts[1])), new Amount(parts[2], Integer.parseInt(parts[3])));
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void check(Amount amount1, Amount amount2) throws Exception{
        if(amount1.getCurrency().equals(amount2.getCurrency())){
            amount1.add(amount2);
        }
        else{
            throw new Exception("Currency doesn't match");
        }
    }


}

class Amount{
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public int getAmount() {
        return amount;
    }

    public void add(Amount amount){
        System.out.println(this.amount + amount.amount);
    }
}