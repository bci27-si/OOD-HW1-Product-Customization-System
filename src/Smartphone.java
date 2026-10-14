public class Smartphone {

    // build the smartphone with the specs you want using methods

    private String processorType;
    private int storageSize;
    private int ramAmount;
    private double screenSize;
    // width height of cam. probably not correct. lenses--> focal length and sensor size.
    private double width;
    private double height;
    //
    private int batterySize;
    private String cameraType;
    private String simType;

    public Smartphone(String processorType, int storageSize, int ramAmount, double screenSize, double width, double height, int batterySize, String cameraType, String simType) {
        this.processorType = processorType;
        this.storageSize = storageSize;
        this.ramAmount = ramAmount;
        this.screenSize = screenSize;
        this.width = width;
        this.height = height;
        this.batterySize = batterySize;
        this.cameraType = cameraType;
        this.simType = simType;
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "Processor Type='" + processorType + '\'' +
                ", Storage Size=" + storageSize +
                ", Ram Amount=" + ramAmount +
                ", Screen Size=" + screenSize +
                ", Width=" + width +
                ", Height=" + height +
                ", Battery Size=" + batterySize +
                ", Camera Type='" + cameraType + '\'' +
                ", Sim Type='" + simType + '\'' +
                '}';
    }
}
