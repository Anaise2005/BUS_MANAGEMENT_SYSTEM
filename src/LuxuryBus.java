public class LuxuryBus extends BusManager {
    private boolean hasWiFi;

    public LuxuryBus(String id, String name, int cap, String fuel, String loc, String stat, String driver, String busNum, boolean wifi) {
        super(id, name, cap, fuel, loc, stat, driver, busNum);
        this.hasWiFi = wifi;
    }

    @Override
    public void startVehicle() { System.out.println("Luxury Bus starting silently..."); }

    @Override
    public double calculateFare() { return 150.0; } // Higher fare for luxury

    @Override
    public String toString() { return super.toString() + " [Luxury - WiFi: " + hasWiFi + "]"; }

}
