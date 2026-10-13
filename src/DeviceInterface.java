public abstract class DeviceInterface {


    // all devices use the abstract methods becauses these are necessary to make any mobile device.
    public abstract void SetProcessorType();
    public abstract void SetStorageSize();
    public abstract void SetScreenSize();
    public abstract void SetCameraResolution();
    public abstract void SetBatterySize();

    // laptop specific / like device methods

    public void SetRamAmount(){


    }

    public void SetGraphicsCard(){


    }

    // mobile phone methods / like device

    public void SetCameraTypes(){
        // may be an issue, may change to camera amount...
        // since this would be more then one camera type to determine all cameras, assuming >=2
        System.out.println("Choose camera types: \n 4x zoom 0.8 Focal Length, 2x Zoom 0.4 Focal Length Video Cam," +
                " Night Vision Camera, \n OR \n 10x Zoom 1.0 FocalLength, ");


    }

    public void SetSimType(){
        // either Sim or Esim
        System.out.println("Pick Sim or E-Sim");

    }



}
