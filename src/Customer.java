import com.sun.security.jgss.GSSUtil;

public class Customer {
    public static void main(String[] args) {

        System.out.println("|============================|");
        System.out.println("|     Welcome to NewEgg!     |");
        System.out.println("|============================|");



        DeviceInterface builderL = new LaptopBuilder();
        DeviceInterface builderS = new SmartPhoneBuilder();
        DeviceDirector = new DeviceDirector(builderL,builderS);

        System.out.println("Select the Processor Type");