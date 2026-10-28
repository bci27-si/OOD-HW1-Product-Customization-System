public interface DeviceBuilder<T extends GenericProduct, B extends DeviceBuilder<T, B>> {

    B setProcessorType(String processorType);

    B setStorageSize(int storageSize);

    // enum to make specific 8 values like ram or storage multiples
    B setScreenSize(double size);

    B setCameraResolution(double width, double height);

    B setBatterySize(int batterySize);

    B setRamAmount(int ramAmount);
    // for the purposes of differentiation i have to put these methods that are specific to each device in.
    B setGraphicsCard(String graphicsCard);

    B setCameraType(String cameraType);

    B setSimType(String simType);

    //DeviceInterface deviceBuild();

    //Laptop deviceBuild();
    // glm says use a generic, i just created two methods for this in each of the builder classes.

    T deviceBuild();
    //deviceBuild();
    //String deviceBuild();
}