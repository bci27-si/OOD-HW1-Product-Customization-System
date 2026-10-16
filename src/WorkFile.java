import java.io.File;

public interface WorkFile {
    // maybe need to make read return string, as in the csv formattted. later->
    void ReadCSV(File CSV);
    void WriteCSV(File CSV);

    void ReadCSV(File CSV);
}
