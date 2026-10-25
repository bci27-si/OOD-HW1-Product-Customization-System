public class DeviceDirector {
    // this class builds the object and fills out the created CSV

    private DeviceBuilder<Laptop> builder;  // TYPE ERROR FIXME how do i do this...
    private DeviceBuilder<Smartphone> builder2; // lazy fix
    //private SmartPhoneBuilder builderS;

    public DeviceDirector() {
        this.builder = builder;
        this.builder2 = builder2;

    }
    // setting preset aparts that are available
    //      would limit the user and allow for the most customizable devices within bounds.

    //take inputs from scanner in main, but have default values--> will add


    public Laptop constructLaptopA(){

        return builder
                .setProcessorType("Intel 9th gen 9900K")
                .setStorageSize(512)
                .setRamAmount(16)
                .setScreenSize(17)
                .setCameraResolution(16,9)
                .setBatterySize(1200)
                .setGraphicsCard("Intel B70m 32Gb")

                .deviceBuild();
    }
    // if i use scanner to allow the user to select parts, i only need two build methods.
    // one for each type of device.
    // this allows me to have an infinite amount of combinations, with less code.

    public Smartphone constructSmartphone(){

        return (Smartphone) builder2
                .setProcessorType("Arm Snapdgragon 256 bit")
                .setStorageSize(128)
                .setRamAmount(8)
                .setScreenSize(6.5)
                .setCameraResolution(16,9)
                .setBatterySize(7000)
                .setSimType("E-Sim")
                //.setGraphicsCard()

                .deviceBuild();
    }

}
