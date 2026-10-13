public abstract class DeviceInterface {
/// Device interface abstract Class,
/// designed to abstract parts of devices that are required / the same across devices
/// concrete methods allow implementation of the most basic version,
///      any additional devices can overirde and modify them.


    public DeviceInterface() {
        //defaults test


    }


    // all devices use the abstract methods becauses these are necessary to make any mobile device.
    public abstract void setProcessorType();
    public abstract void setStorageSize();
    public abstract void setScreenSize();
    public abstract void setCameraResolution();
    public abstract void setBatterySize();

    // laptop specific / like device methods

    public void setRamAmount(int ram){

        int ramAmount = ram;
        if(ram <= 0){
            ramAmount = 16;
        }
    }

    public void setGraphicsCard(String graphicsCard){
        String graphicsCardName = graphicsCard;
        if(graphicsCardName == null){
            graphicsCardName = "Intel B65 32gb";

        }

    }

    // mobile phone methods / like device

    public void setCameraTypes(){
        // may be an issue, may change to camera amount...
        // since this would be more then one camera type to determine all cameras, assuming >=2
        System.out.println("Choose camera types: \n 4x zoom 0.8 Focal Length, 2x Zoom 0.4 Focal Length Video Cam," +
                " Night Vision Camera, \n OR \n 10x Zoom 1.0 FocalLength, ");


    }

    public void setSimType(){
        // either Sim or Esim
        System.out.println("Pick Sim or E-Sim");

    }


    public abstract void setRamAmount();

    public abstract void setGraphicsCard();
}
