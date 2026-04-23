import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("   ADVANCED BUS MANAGEMENT SYSTEM - GROUP C    ");
        System.out.println("===============================================");

        // 1. COLLECT BUS DETAILS
        System.out.println("\n--- [Step 1: Register a Bus] ---");
        System.out.print("Enter Bus Type (City, Express, Luxury, School, Tourist, Electric): ");
        String type = sc.nextLine();

        System.out.print("Enter Vehicle ID (e.g., BUS-001): ");
        String id = sc.nextLine();

        System.out.print("Enter Bus Name: ");
        String name = sc.nextLine();

        // Using Validator for numeric inputs
        int capacity = InputValidator.getValidInt(sc, "Enter Capacity: ");
        sc.nextLine(); // consume newline

        System.out.print("Enter Driver Name: ");
        String driver = sc.nextLine();

        System.out.print("Enter License Plate Number: ");
        String plate = sc.nextLine();

        // 2. USE FACTORY TO CREATE BUS (Demonstrating Polymorphism)
        BusManager myBus = BusFactory.createBus(type, id, name, capacity, driver, plate);

        if (myBus == null) {
            System.out.println("Error: Invalid bus type entered. System exiting.");
            return;
        }

        // 3. COLLECT PASSENGER DETAILS
        System.out.println("\n--- [Step 2: Register Passenger] ---");
        System.out.print("Enter Passenger Name: ");
        String pName = sc.nextLine();

        String phone;
        while (true) {
            System.out.print("Enter 10-digit Phone Number: ");
            phone = sc.nextLine();
            if (InputValidator.isValidPhone(phone)) break;
            System.out.println("Error: Invalid phone format.");
        }

        // 4. PERFORM OPERATIONS (Using Interfaces)
        System.out.println("\n--- [Step 3: Processing Booking & Tracking] ---");
        myBus.bookSeat();        // From Bookable interface
        myBus.startVehicle();    // From Vehicle abstract class

        String location = myBus.trackLocation(); // From Trackable interface
        System.out.println("Current Bus Status: " + location);

        // 5. DISPLAY FINAL SUMMARY
        System.out.println("\n===============================================");
        System.out.println("              BOOKING SUMMARY                  ");
        System.out.println("===============================================");
        System.out.println("Passenger: " + pName + " (" + phone + ")");
        System.out.println("Vehicle Info: " + myBus.toString());
        System.out.println("Total Fare: $" + myBus.calculateFare());
        System.out.println("Payment Status: COMPLETED");
        System.out.println("===============================================");

        sc.close(); // Close scanner to prevent resource leaks
    }
}
