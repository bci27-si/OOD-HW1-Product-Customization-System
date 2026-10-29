/// Class Laptop.java contains toStriing() method for displaying Components in the laptop
///and constructor for a laptop product.
public class Laptop implements GenericProduct {

    private String processorType;
    private int storageSize;
    private int ramAmount;
    private double screenSize;
    // width height of cam. probably not correct. lenses--> focal length and sensor size.
    private double width;
    private double height;

    private int batterySize;
    private String graphicsCard;

    //CSVFile csvFile;

    public Laptop(String processorType, int storageSize, int ramAmount, double screenSize, double width, double height, int batterySize, String graphicsCard) {
        this.processorType = processorType;
        this.storageSize = storageSize;
        this.ramAmount = ramAmount;
        this.screenSize = screenSize;
        this.width = width;
        this.height = height;
        this.batterySize = batterySize;
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Processor Type='" + processorType + '\'' +
                ", Storage Size=" + storageSize +
                ", Ram Amount=" + ramAmount +
                ", Screen Size=" + screenSize +
                ", Width=" + width +
                ", Height=" + height +
                ", Battery Size=" + batterySize +
                ", Graphics Card='" + graphicsCard + '\'' +
                '}';
    }

}


/*
    // create the laptop with the specs you want by sleecting methods

    public void buildLaptopA(){

    }

    public void buildLaptopB(){

    }

}
*/