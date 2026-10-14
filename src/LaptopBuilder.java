public class LaptopBuilder implements DeviceInterface{
/// All methods for Laptop specific building etc
///
/// using device interface to "connect eerything so i can return the actual this of the method thereby printing spces
///
/// make sure sout doesnt return a memory address ***********

    @Override
    public DeviceInterface setProcessorType() {

        return this;
    }

    @Override
    public DeviceInterface setStorageSize() {

        return this;
    }

    @Override
    public DeviceInterface setScreenSize() {

        return this;
    }

    @Override
    public DeviceInterface setCameraResolution() {


        return this;
    }

    @Override
    public DeviceInterface setBatterySize() {
        System.out.println("How many mAh");

        return this;
    }

    @Override
    public DeviceInterface setRamAmount(int RamAmount) {
        System.out.println("set your Ram Amount");
        this.ramAmount = RamAmount;
        //this.RamAmount = RamAmount;
        return this;
        //System.out.println("16Gb of Ram Selected!");

    }





    public void setGraphicsCard() {

        //System.out.println("set your GraphicsCard");
    }


    // take input but use equals ignore case to prevent case rejection
}
