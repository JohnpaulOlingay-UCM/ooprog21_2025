import java.util.Scanner;

public class DebugFour4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String destinationCity;
        String departureCity;
        String mode;
        DebugTrip trip1;
        DebugTrip trip2;
        DebugTrip trip3;

        System.out.print("Enter destination city >> ");
        destinationCity = input.nextLine();

        System.out.print("Enter departure city >> ");
        departureCity = input.nextLine();

        System.out.print("Enter mode of transportation >> ");
        mode = input.nextLine();

       
        trip1 = new DebugTrip(destinationCity);
        trip2 = new DebugTrip(destinationCity, departureCity);
        trip3 = new DebugTrip(destinationCity, departureCity, mode);

       
        display(trip1);
        display(trip2);
        display(trip3);

        input.close();
    }

    public static void display(DebugTrip trip) {
       
        System.out.println("Going to " + trip.getDestination());
        System.out.println("Leaving from " + trip.getDepartureCity());
        System.out.println("Going by " + trip.getMode());
        System.out.println("-------------------------");
    }
}
