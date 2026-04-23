public class BusFactory {
    public static BusManager createBus(String type, String id, String name, int cap, String driver, String plate) {
        switch (type.toLowerCase()) {
            case "luxury": return new LuxuryBus(id, name, cap, "Diesel", "Station", "Active", driver, plate, true);
            // Add cases for CityBus, ExpressBus, etc.
            default: return null;
        }
    }
}
