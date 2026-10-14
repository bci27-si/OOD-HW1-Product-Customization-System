public class DeviceDirector {
    // this class builds the object and fills out the created CSV

    private DeviceInterface builder;
    //private SmartPhoneBuilder builderS;

    public DeviceDirector() {
        this.builder = builder;
        //this.builderS = builderS;

    }

    public DeviceInterface constructLaptopA(){

        return builder
                .setProcessorType("Intel 9")
                .setStorageSize(15)
                .setRamAmount(16)
                .setScreenSize(17)
                .setCameraResolution(16,9)
                .setBatterySize(1200)
                //.setGraphicsCard()


                .deviceBuild();
    }
    // if i use scanner to allow the user to select parts, i only need two build methods. one for each type of device.
    // this allows me to have an infinite amount of combinations, with less code.

    public DeviceInterface constructSmartphone(){

        return builder
                .setProcessorType("Intel 9")
                .setStorageSize(15)
                .setRamAmount(16)
                .setScreenSize(17)
                .setCameraResolution(16,9)
                .setBatterySize(1200)
                //.setGraphicsCard()


                .deviceBuild();
    }

}
