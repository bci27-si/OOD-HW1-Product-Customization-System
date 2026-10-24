public interface DeviceBuilder<T extends GenericProduct> {
    //DeviceInterface[] components = new DeviceInterface[10];

    DeviceBuilder<T> setProcessorType(String processorType);

    DeviceBuilder<T> setStorageSize(int storageSize);

    // enum to make specific 8 values like ram or storage multiples
    DeviceBuilder<T> setScreenSize(double size);

    DeviceBuilder<T> setCameraResolution(double width, double height);

    DeviceBuilder<T> setBatterySize(int batterySize);

    DeviceBuilder<T> setRamAmount(int ramAmount);

    //DeviceInterface finalizeComponents();

     //Laptop deviceBuild();
    // glm says use a generic, i just created two methods for this in each of the builder classes.

    T deviceBuild();
     //deviceBuild();
            //DeviceInterface[] components = new DeviceInterface[10];
    //String deviceBuild();

    // for the purposes of differentiation i have to put these methods that are specific to each device in.
    DeviceBuilder<T> setGraphicsCard(String graphicsCard);

    DeviceBuilder<T> setCameraType(String cameraType);

    DeviceBuilder<T> setSimType(String simType);

    //DeviceInterface deviceBuild();

}