public class LaptopBuilder implements DeviceInterface{




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

        this.RamAmount = RamAmount;
        return this;
        //System.out.println("16Gb of Ram Selected!");

    }





    public void setGraphicsCard() {

        //System.out.println("set your GraphicsCard");
    }


    // take input but use equals ignore case to prevent case rejection
}
