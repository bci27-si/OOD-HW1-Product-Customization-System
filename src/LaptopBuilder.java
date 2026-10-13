public class LaptopBuilder implements DeviceInterface{

    public LaptopBuilder(){

        this.setCameraResolution();
        this.setBatterySize();

    }



    @Override
    public void setProcessorType() {

    }

    @Override
    public void setStorageSize() {

    }

    @Override
    public void setScreenSize() {

    }

    @Override
    public void setCameraResolution() {

    }

    @Override
    public void setBatterySize() {
        System.out.println("How many mAh");


    }

    @Override
    public void setRamAmount(int RamAmount) {
        System.out.println("set your Ram Amount");

        this.RamAmount = RamAmount;
        return this
        //System.out.println("16Gb of Ram Selected!");

    }





    public void setGraphicsCard() {

        //System.out.println("set your GraphicsCard");
    }


    // take input but use equals ignore case to prevent case rejection
}
