public class LaptopBuilder implements DeviceInterface {
    /// All methods for Laptop specific building etc
    ///
    /// using device interface to "connect eerything so i can return the actual this of the method thereby printing spces
    ///
    /// make sure sout doesnt return a memory address ***********

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


    @Override
    public DeviceInterface setProcessorType(String processorType) {
        return this;
    }

    @Override
    public DeviceInterface setStorageSize(int storageSize) {
        return this;
    }

    @Override
    public DeviceInterface setRamAmount(int RamAmount) {
        return this;
    }

    @Override
    public DeviceInterface setScreenSize(double screenSize) {
        return this;
    }

    @Override
    public DeviceInterface setCameraResolution(double width, double height) {
        return this;
    }

    @Override
    public DeviceInterface setBatterySize(int batterySize) {
        return this;
    }


    public DeviceInterface setGraphicsCard(String graphicsCard) {
        System.out.println("Available Cards: ");
        System.out.println("graphicsCard: " + graphicsCard);

        return this;
    }

    public DeviceInterface deviceBuild() {
        System.out.println("Building customised laptop");
        return new LaptopBuilder (processorType,storageSize,ramAmount,screenSize,width,height);
    }


    /*
    @Override
    public String toString() {
        return "Laptop [ProcessorType=" + processorType + ", StorageSize=" + storageSize +
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

