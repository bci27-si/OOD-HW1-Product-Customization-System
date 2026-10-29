import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        //CSVFile csvFile = new CSVFile("Customer.csv");

        System.out.println("|============================|");
        System.out.println("|     Welcome to NewEgg!     |"); // Essentially a MicroCenter
        System.out.println("|============================|");
        //Both are Pc Parts stores. personally, never been to wither; only ordered from one.

        CSVFile file = new CSVFile();
        // create the file object

        DeviceDirector device = new DeviceDirector();
        System.out.println("--- Default Laptop ---");
        file.readAll();
        System.out.println("reading (Nothing if empty) 1 Test");

        // .toString is here because it needs a string. not sure where the type is set, but works for now.
        file.writeFile(device.constructLaptopA().toString());
        file.readAll();

        System.out.println("read 2 Test");

        System.out.println("--- Default Smartphone ---");
        device.constructSmartphone();

        file.writeFile(device.constructSmartphone().toString());

        //FIXME
        // ADD SPACING FOR ALL THE COMPONENTS OF THE LAPTOP WHEN IT IS READ IN CSV!!!!


        // print out all components with corresponding names

        // printout everything in the file
        System.out.println("read 3 Test");
        file.readAll();

        // adding the write file to return AND print the data to CSV
        //writeFile();

        //builderS.deviceBuild();
    }
}
/*
        while (true) {

            System.out.println("   -----Select a Device: -----   " +
                    "\n      Laptop \n           or \n      Smartphone");
            System.out.println("Choose default setup? ");
            if (scnr.hasNextLine()) {}

            System.out.println("Select the Processor Type: ");
            String ProcessorType = scnr.nextLine();

            System.out.println("Select Storage Size: ");
            String StorageSize = scnr.nextLine();

            System.out.println("Select a Ram Amount: ");
            String RamAmount = scnr.nextLine();

            System.out.println("Select a Screen Size : \n width");
            String ScreenWidth = scnr.nextLine();

            System.out.println("Height");
            String ScreenHeight = scnr.nextLine();

            System.out.println("Select a Camera Resolution Height: ");
            String CameraResolutionHeight = scnr.nextLine();

            System.out.println("Select a Camera Resolution Width: ");
            String CameraResolutionWidth = scnr.nextLine();

            System.out.println("Select a Battery Size: ");
            String BatterySize = scnr.nextLine();

        }
*/
            // ask if they want another device.
            // Y or yes
            /*
            if(){
                break;
            }
            */