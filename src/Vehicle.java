public abstract class Vehicle {
    private String vehicleID, vehicleName, fuelType, currentLocation, status;
    private int capacity;

    public Vehicle() {}

    public Vehicle(String vehicleID, String vehicleName, int capacity, String fuelType, String currentLocation, String status) {
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.currentLocation = currentLocation;
        this.status = status;
    }

    // Required Abstract Methods (Ensure you have all 8)
    public abstract void startVehicle();
    public abstract void stopVehicle();
    public abstract double calculateFuelConsumption();
    public abstract boolean checkAvailability();
    public abstract void assignRoute(String route);
    public abstract void updateLocation(String location);
    public abstract void performMaintenanceCheck();
    public abstract void generateVehicleReport();

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleID + ", Name: " + vehicleName + ", Capacity: " + capacity;
    }

    // Add your getters and setters here...
} // This final brace closes the class
