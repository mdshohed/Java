import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        String location = "E:\\ClassRoom\\ALL Class\\7th Semester\\Java- CSE81.2[Mahbub Hasan]\\Code\\FileOperation\\src\\read.csv";
        Path path = Paths.get(location);
        try {
            List<String> text = Files.readAllLines(path);
            int sum = 0;
            for(String i:text) {
                String s[] = i.split(",");

                int x;
                x = Integer.parseInt(s[2]);
                System.out.println(x);
            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
