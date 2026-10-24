public interface DeviceInterface {

    DeviceInterface setProcessorType(String processorType);

    DeviceInterface setStorageSize(int storageSize);

    // enum to make specific 8 values like ram or storage multiples
    DeviceInterface setScreenSize(double size);

    DeviceInterface setCameraResolution(double width, double height);

    DeviceInterface setBatterySize(int batterySize);

    DeviceInterface setRamAmount(int ramAmount);

    DeviceInterface deviceBuild();
    //String deviceBuild();

    // for the purposes of differentiation i have to put these methods that are specific to each device in.
    DeviceInterface setGraphicsCard(String graphicsCard);

    DeviceInterface setSimType(String simType);

    //DeviceInterface deviceBuild();

}