public class LaptopBuilder implements DeviceBuilder<Laptop, LaptopBuilder> {
    /// All methods for LaptopBuilder specific building etc
    ///
    /// using device interface to "connect everything so i can return the actual this of the method thereby printing spces
    ///
    /// make sure sout doesn't return a memory address ***********
// i flipped LaptopBuilder builder with LaptopBuilder. thats the confusion...
    private String processorType;
    private int storageSize;
    private int ramAmount;
    private double screenSize;
    // width height of cam. probably not correct. lenses--> focal length and sensor size.
    private double width;
    private double height;
    //
    private int batterySize;
    private String graphicsCard;

    @Override
    public LaptopBuilder setProcessorType(String processorType) {
        this.processorType = processorType;
        return this;
    }

    @Override
    public LaptopBuilder setStorageSize(int storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    // using this to say "this exact piece of data you put in
    @Override
    public LaptopBuilder setRamAmount(int RamAmount) {
        this.ramAmount = RamAmount;
        return this;
    }

    @Override
    public LaptopBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }
        // probably will change for proper-ness to --> Select Camera Sensor
    @Override
    public LaptopBuilder setCameraResolution(double width, double height) {
        this.width = width;
        this.height = height;
        return this;
    }

    @Override
    public LaptopBuilder setBatterySize(int batterySize) {
        this.batterySize = batterySize;
        return this;
    }

    public LaptopBuilder setGraphicsCard(String graphicsCard) {
        //System.out.println("Available Cards: ");
        //System.out.println("graphicsCard: " + graphicsCard);
        this.graphicsCard = graphicsCard;

        return this;
    }

    // unused etc.. wanted to
    @Override
    public LaptopBuilder setCameraType(String cameraType) {
        return null;
    }

    // unused... though a LaptopBuilder maybe... could have a sim
    @Override
    public LaptopBuilder setSimType(String simType) {
        return null;
    }

    //FIXME
    // not sure why This is broken...
    // i know the device interface doe not support LaptopBuilder, but i need to consider how to
    /*
    public DeviceInterface deviceBuild() {
        System.out.println("Building customised LaptopBuilder");
        return processorType, storageSize, ramAmount, screenSize, width, height,batterySize,graphicsCard;
    }*/

    @Override
    public Laptop deviceBuild() {
        //System.out.println("not sure what broke here... types are messed up");
        return new Laptop( processorType, storageSize, ramAmount, screenSize, width, height, batterySize, graphicsCard);
    }

    /*
    @Override
    public String toString() {
        return "LaptopBuilder [ProcessorType=" + processorType + ", StorageSize=" + storageSize +
                ", sunroof=" + ramAmount + ", Screen Size=" + screenSize +
                ", Camera Width=" + width + ", Camera Height=" + height + "]";
    }
    */

}

/*
System.out.println("How many mAh");

System.out.println("set your Ram Amount");

//System.out.println("16Gb of Ram Selected!");

 */

    // take input but use equals ignore case to prevent case rejection

