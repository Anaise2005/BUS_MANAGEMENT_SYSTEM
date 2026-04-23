public class BusManager extends Vehicle implements Bookable, Trackable {
    private String driverName, busNumber, routeAssigned;

    public BusManager(String id, String name, int cap, String fuel, String loc, String stat, String driver, String busNum) {
        super(id, name, cap, fuel, loc, stat);
        this.driverName = driver;
        this.busNumber = busNum;
    }

    // Implementation of Abstract Methods
    public void startVehicle() { System.out.println("Bus starting..."); }
    public void stopVehicle() { System.out.println("Bus stopped."); }
    public double calculateFuelConsumption() { return 10.5; }
    public boolean checkAvailability() { return true; }
    public void assignRoute(String route) { this.routeAssigned = route; }
    public void updateLocation(String loc) { /* update */ }
    public void performMaintenanceCheck() { System.out.println("Maintenance OK."); }
    public void generateVehicleReport() { System.out.println("Report for " + busNumber); }
    public void bookSeat() { System.out.println("Seat booked."); }
    public void cancelBooking() { System.out.println("Booking cancelled."); }
    public double calculateFare() { return 50.0; }
    public String trackLocation() { return "GPS Coords"; }
    public void updateStatus(String s) { /* update status */ }
}

