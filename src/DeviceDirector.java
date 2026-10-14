public class DeviceDirector {
    // this class builds the object and fills out the created CSV

    private DeviceInterface builder;
    //private SmartPhoneBuilder builderS;

    public DeviceDirector(DeviceInterface builder) {
        this.builder = builder;
        //this.builderS = builderS;

    }

    public laptop constructLaptopA(){

        return builder
                .setProcessorType("Intel 9")
                .set()
                .build();
    }


   public void buildLaptop(){


   }

    public void buildSmartphone(){


    }

}
