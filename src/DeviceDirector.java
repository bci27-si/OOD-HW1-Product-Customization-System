public class DeviceDirector {
    // this class builds the object and fills out the created CSV

    private DeviceInterface builder;
    //private SmartPhoneBuilder builderS;

    public DeviceDirector() {
        this.builder = builder;
        //this.builderS = builderS;

    }
    // setting preset aparts that are available
    //      would limit the user and allow for the most customiseable devices within bounds.

    public DeviceInterface constructLaptopA(){

        return builder
                .setProcessorType("Intel 9")
                .setStorageSize(512)
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
                .setStorageSize(128)
                .setRamAmount(8)
                .setScreenSize(6.5)
                .setCameraResolution(16,9)
                .setBatterySize(7000)
                //.setGraphicsCard()

                .deviceBuild();
    }

}
