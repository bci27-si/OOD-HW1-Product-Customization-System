public interface DeviceInterface {

    //DeviceInterface[] components = new DeviceInterface[10];

    DeviceInterface setProcessorType(String processorType);

    DeviceInterface setStorageSize(int storageSize);

    // enum to make specific 8 values like ram or storage multiples
    DeviceInterface setScreenSize(double size);

    DeviceInterface setCameraResolution(double width, double height);

    DeviceInterface setBatterySize(int batterySize);

    DeviceInterface setRamAmount(int ramAmount);

    DeviceInterface finalizeComponents();

    DeviceInterface deviceBuild();
            //DeviceInterface[] components = new DeviceInterface[10];
    //String deviceBuild();

    // for the purposes of differentiation i have to put these methods that are specific to each device in.
    DeviceInterface setGraphicsCard(String graphicsCard);

    DeviceInterface setCameraType(String cameraType);

    DeviceInterface setSimType(String simType);

    //DeviceInterface deviceBuild();

}