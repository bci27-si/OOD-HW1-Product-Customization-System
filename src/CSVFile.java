import java.awt.*;
import java.io.*;
import java.util.Arrays;

public class CSVFile implements WorkFile{

    // starting this over.
    private String fileName;
    File file = new File(fileName);

    public CSVFile(String fileName) {
        this.fileName = fileName + ".csv";
    }

    @Override
    public void checkFile() {
        //File file = new File(fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

                    bw.write("ProductName,Processor,RAM,Storage,Ingerated,OS Price");

                    bw.newLine();
                }
                System.out.println(fileName + " is created");
            } catch (IOException e) {
                System.out.println("CSV Error: " + e.getMessage() + "Method: checkFile();");
                //e.getMessage();
            }
        } else {
            System.out.println(fileName + " already exists");
        }
    }
    // SaMpl CSV
    //productName --- Processor --- RAM --- Storage --- Ingerated --- Operating Sys Price
// cannot find the CSV stuff we were supposedly provided excet the example csv, i guess i have to make one anyway
// safemode seems to not have

    @Override
    public void writeFile(String columns) {
        // added check file just in case.
        // write each piece of new data to a column as i listed above when creating the file.
        checkFile();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))){
            bw.write(String.join(",", columns));
            bw.newLine();

        }
        catch (IOException e) {
            System.out.println("CSV Error: " + e.getMessage() + "Method: newRow();");
        }
    }

    // could do something where it reads by specific line
    @Override
    public void readAll(){
        // added file check just in case
        checkFile();
        if(!file.exists()){
            System.out.println("CSV Error: " + fileName + " doesn't exist");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine())!= null){
                System.out.println(line);
                String[] columns =  line.split(",");
                // array for columns /\
                System.out.println(Arrays.toString(columns));
            }
        }
        catch (IOException e) {
            System.out.println("CSV Error: " + e.getMessage() + "Method: readAll();");
        }
    }
}
    /*
    String Name; // for now
    //could do better, but lets see
    //read or write?
    private int methodChecker = 3;
    // name of vsv gas to be sotred somewhere
    public void generateCSV(String fileName) throws IOException {
        // just creates the file with a name.
        // I could make the user provide the name with scanner or hardcode, but who cares.
        FileWriter fw = new FileWriter(fileName + ".csv");
        if(methodChecker == 0){
            ReadCSV(File fileName);
        }
        else if (methodChecker == 1){
            WriteCSV(File fileName);
        }
        else{
            System.out.println("Ouch");
        }
            System.out.println("Generated CSV File Successfully");
            System.out.println("Something failed");
    }
    // sout statements r plannning
    public boolean checkFile(File CSV){
        try{
            FileWriter f = new FileWriter(CSV);
            return true;
        }
        catch (FileNotFoundException e){
            generateCSV(String Name);
            // add loop somewhere else, i can't have wiired loops everythnwer in functions. function shoud try again
            // no return just in case other problems were to arise
            checkFile(File CSV);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }

        //format file?
        // next line/ row: seperate into columns

        public void formatCSV(String data){
            // user can input anything from the data and the csv should be formatted properly etc when created.
        }

        */

        // exception, maybe make a file if the exception is "file not found"
        /*
        finally{
            System.out.println("Not sure whats wrong");;
        }
        return false;
    }
    @Override
    public void ReadCSV(File CSV) {
        methodChecker = 0;
        // output csv with 'n in each line ending and "   " three saces for cluumns
        if(checkFile(CSV)){
        }
        else {
            System.out.println("Read failed");
        }}

    @Override
    public void WriteCSV(File CSV) {
        methodChecker = 1;
        if(checkFile(CSV)){
        }
        else{
            System.out.println("Write failed");
        }
*/