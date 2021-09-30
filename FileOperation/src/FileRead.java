
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {
    /**
     *
     * @param textlocation Text File Read
     */
    public void textFileRead(String textlocation) {
        Path path = Paths.get(textlocation);
        try{
            List<String> text = Files.readAllLines(path);
            text.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param csvlocation CSV File Read
     */
    public void csvFileRead(String csvlocation) {
        Path path = Paths.get(csvlocation);
        try{
            List<String> text = Files.readAllLines(path);
            text.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
