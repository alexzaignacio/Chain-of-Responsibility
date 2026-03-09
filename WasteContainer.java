public class WasteContainer {
    private double capacity;
    private WasteType wasteType;

    public WasteContainer(double capacity, WasteType wasteType) {
        this.capacity = capacity;
        this.wasteType = wasteType;
    }

    public double getCapacity() {
        return capacity;
    }

    public WasteType getWasteType() {
        return wasteType;
    }

    @Override
    public String toString() {
        return "WasteContainer[type=" + wasteType + ", capacity=" + capacity + "]";
    }
}