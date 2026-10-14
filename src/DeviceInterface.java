public interface DeviceInterface {

    DeviceInterface setProcessorType(String processorType);

    DeviceInterface setStorageSize(int StorageSize);
// enum to make specific 8 values like ram or storage multiples
    DeviceInterface setScreenSize(double width, double height);

    DeviceInterface setCameraResolution(double width, double height);

    DeviceInterface setBatterySize(int batterySize);

    DeviceInterface setProcessorType();

    DeviceInterface setStorageSize();

    DeviceInterface setScreenSize();

    DeviceInterface setCameraResolution();

    DeviceInterface setBatterySize();

    DeviceInterface setRamAmount(int ramAmount);
