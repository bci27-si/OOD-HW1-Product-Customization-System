public class SmartPhoneBuilder implements DeviceInterface {

    /**
     * Builder methods here FOr a customied spmartphone.
     *
     * Specific methods here are set sim type and set camera type
     *
     */
    @Override
    public DeviceInterface setProcessorType() {

        return this;
    }
    // mobile phones commonly have snapdragon, (ARM Based microprocessors)

    @Override
    public DeviceInterface setStorageSize() {

        return this;
    }
    // some multiple of 8

    @Override
    public DeviceInterface setRamAmount(int RamAmount) {


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


    public SmartPhoneBuilder setCameraTypes() {

        // transfer from other file here
        return this;
    }


    public SmartPhoneBuilder setSimType() {

        return this;

    }

}
