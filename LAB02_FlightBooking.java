import java.util.Scanner;

class FlightBooking{
    public String flightId="OOP24";
    private static int seatAvailable=180;
  
    //Your code goes here
    public static void booking(int userId){
        seatAvailable--;
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }

    public static void confirmed(int userId){
        System.out.print("--User " + userId + " Confirmed--[Seat Available: " + seatAvailable + "]");
    }

    public static void cancel(int userId){
        seatAvailable++;
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }

    public static int setSeatAvailable(){
        return seatAvailable = 180;
    }
}

public class LAB02_FlightBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while (t-- > 0) {
            FlightBooking.setSeatAvailable();
            String[] actions = sc.nextLine().split(" ");
            for(int j = 0; j < actions.length; j += 2){
                int userId = Integer.parseInt(actions[j]);
                String task = actions[j + 1];

                if(task.equals("Booking")){
                    FlightBooking.booking(userId);
                }
                else if(task.equals("Confirmed")){
                    FlightBooking.confirmed(userId);
                }
                else if(task.equals("Cancel")){
                    FlightBooking.cancel(userId);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
