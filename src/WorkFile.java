import java.io.File;

public interface WorkFile {
    // maybe need to make read return string, as in the csv formatted. later->
  void checkFile();

  void readAll();

  void writeFile(String columns);

}
