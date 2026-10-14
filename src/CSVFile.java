import java.io.File;

public class CSVFile implements WorkFile {


    @Override
    public void ReadCSV(File CSV) {
        // output csv with 'n in each line ending and "   " three saces for cluumns

    }

    @Override
    public void WriteCSV(File CSV) {

    }
    // i know the csv reader was provided, but i wonder how hard it would be to make my own

    public String generateCSV() {
        // just creates the file with a name.
        // I could make the user provide the name with scanner or hardcode, but who cares.
        if(){
            return "Generated CSV File Successfully";
        }


        return "Something failed";
    }


}
