public interface DeviceInterface {

    DeviceInterface setProcessorType(String processorType);

    DeviceInterface setStorageSize(int storageSize);

    // enum to make specific 8 values like ram or storage multiples
    DeviceInterface setScreenSize(double size);

    DeviceInterface setCameraResolution(double width, double height);

    DeviceInterface setBatterySize(int batterySize);

    DeviceInterface setRamAmount(int ramAmount);
    //String deviceBuild();

    DeviceInterface deviceBuild();

}