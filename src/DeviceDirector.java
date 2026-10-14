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
                .deviceBuild();
    }


   public void buildLaptop(){


   }

    public void buildSmartphone(){


    }

}
