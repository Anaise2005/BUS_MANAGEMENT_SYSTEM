import java.util.Scanner;

public class BusSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== National Bus Management System ===");

        // Example User Interaction
        String id = "B101";
        System.out.print("Enter Bus Name: ");
        String name = sc.nextLine();

        int capacity = InputValidator.getValidInt(sc, "Enter Capacity: ");
        sc.nextLine(); // clear buffer

        BusManager myBus = BusFactory.createBus("luxury", id, name, capacity, "John Doe", "KGL 123");

        if (myBus != null) {
            System.out.println("\n--- Bus Registered Success ---");
            System.out.println(myBus.toString());
            myBus.startVehicle();
            System.out.println("Fare: $" + myBus.calculateFare());
        }
    }
}
