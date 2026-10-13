public class SmartPhoneBuilder extends DeviceInterface {

    /**
     *
     */
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
    // battery size default setting. (If Statement)

    @Override
    public void setBatterySize() {
        int batterySize = 0;
        if (batterySize == 0){
            System.out.println("How many mAh");
        }
    }


    public void setCameraTypes() {

        // transfer from other file here

    }

    @Override
    public void setSimType() {
        super.setSimType();

    }

}
