public class SmartPhoneBuilder implements DeviceInterface {

    /**
     *
     */
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
    // battery size default setting. (If Statement)

    @Override
    public DeviceInterface setBatterySize() {

        return this;
    }

    @Override
    public DeviceInterface setRamAmount(int RamAmount) {


        return this;
    }


    public SmartPhoneBuilder setCameraTypes() {

        // transfer from other file here
        return this;
    }


    public SmartPhoneBuilder setSimType() {

        return this;

    }

}
