import javax.crypto.spec.PSource;

public class SmartPhoneBuilder implements DeviceInterface {

    private String processorType;
    private int storageSize;
    private int ramAmount;
    private double screenSize;
    // width height of cam. probably not correct. lenses--> focal length and sensor size.
    private double width;
    private double height;
    //
    private int batterySize;
    private String cameraType;
    private String simType;


    /**
     * Builder methods here FOr a customied spmartphone.
     *
     * Specific methods here are set sim type and set camera type
     *
     */
    @Override           // Mobile devices usually have an arm based chip, like the newer 256 snapdragons
    public DeviceInterface setProcessorType(String processorType) {
        this.processorType = processorType;
        return this; // amd or intel ONLY Bry-ccelerators not ready yet.
    }
    // mobile phones commonly have snapdragon, (ARM Based microprocessors)

    @Override
    public DeviceInterface setStorageSize(int storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    // some multiple of 8

    @Override
    public DeviceInterface setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
        return this;
    }

    // screen size is actually measured from one corner to the other corner. fixes naming for width height.
    @Override
    public DeviceInterface setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    // hopefully w x h won't be a problem
    @Override
    public DeviceInterface setCameraResolution(double width, double height) {
        this.width = width;
        this.height = height;
        return this;
    }
    // battery size default setting. (If Statement)

    @Override
    public DeviceInterface setBatterySize(int batterySize) {
        this.batterySize = batterySize;
        return this;
    }

    public SmartPhoneBuilder setCameraType(String cameraType) {
        this.cameraType = cameraType;
        // transfer from other file here
        return this;
    }

    public SmartPhoneBuilder setSimType(String simType) {
        this.simType = simType;
        return this;
    }

    @Override
    public DeviceInterface deviceBuild() {
        return null;
    }

    // not sure which one is better... toString or this
    public Smartphone build() {
        System.out.println("Building customised laptop");
        return new Smartphone (processorType,storageSize,ramAmount,screenSize,width,height,batterySize,cameraType,simType);
    }
}
