import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileWrite {
    /**
     *
     * @param textlocation Text File Write
     */
    public void textFileWrite(String textlocation,String content) {
        Path path = Paths.get(textlocation);
        try {
            Files.write(path,content.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param csvlocation CSV File Write
     */
    public void csvFileWrite(String csvlocation, String content) {
        Path path = Paths.get(csvlocation);
        try {
            Files.write(path,content.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
