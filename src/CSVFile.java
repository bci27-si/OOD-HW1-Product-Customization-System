import java.io.*;

public class CSVFile implements WorkFile {

    //could do better, but lets see

    //read or write?
    private int methodChecker = 3;



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


    @Override
    public void ReadCSV(File CSV) {
        methodChecker = 0;
        // output csv with 'n in each line ending and "   " three saces for cluumns
        if(checkFile() == true){

        }
        else {
            System.out.println("Read failed");
        }


    }
    public boolean checkFile(File CSV){

        try{
            FileWriter f = new FileWriter(CSV);
            return true;

        }
        catch (FileNotFoundException e){

            generateCSV();
            // add loop somewhere else, i can't have wiired loops everythnwer in functions. function shoud try again
            // no return just in case other problems were to arise
        }

        catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }

        // exception, maybe make a file if the exception is "file not found"
        /*
        finally{
            System.out.println("Not sure whats wrong");;
        }*/

    }


    @Override
    public void WriteCSV(File CSV) {
        methodChecker = 1;

        if(checkFile(CSV) == true){

        }

        else{
            System.out.println("Write failed");
        }

// temporary bc im not going to have a log for this.
    }
    // i know the csv reader was provided, but i wonder how hard it would be to make my own


}

