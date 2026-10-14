import com.sun.security.jgss.GSSUtil;

public class Customer {
    public static void main(String[] args) {

        System.out.println("|============================|");
        System.out.println("|     Welcome to NewEgg!     |");
        System.out.println("|============================|");


        // specific to device
        DeviceInterface builderL = new LaptopBuilder();
        DeviceInterface builderS = new SmartPhoneBuilder();
        DeviceDirector DeviceDirector = new DeviceDirector();

        System.out.println("   -----Select a Device: -----   " +
                "\n      Laptop \n           or \n      Smartphone");

        while (true) {

            System.out.println("Select the Processor Type: ");

            System.out.println("Select Storage Size: ");

            System.out.println("Select a Ram Amount: ");

            System.out.println("Select a Screen Size : ");

            System.out.println("Select a Camera Resolution Height: ");

            System.out.println("Select a Camera Resolution Width: ");

            System.out.println("Select a Battery Size: ");

            // ask if they want another device.
            // Y or yes
            /*
            if(){
                break;
            }
            */


        }

    }
}