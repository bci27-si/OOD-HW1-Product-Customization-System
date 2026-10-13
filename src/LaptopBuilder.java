public class LaptopBuilder extends DeviceInterface{

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

    }

    @Override
    public void setRamAmount() {
        super.setRamAmount(0);
        System.out.println("set your Ram Amount");

    }

    @Override
    public void setGraphicsCard() {
        super.setGraphicsCard(null);
        System.out.println("set your GraphicsCard");
    }


    // take input but use equals ignore case to prevent case rejection
}
