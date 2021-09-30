package Fall2020;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadUpperChar {
    public static void main(String[] args) {
        String location = "E:\\ClassRoom\\ALL Class\\7th Semester\\Java- CSE81.2[Mahbub Hasan]\\Code\\FileOperation\\src\\in.txt";
        Path path = Paths.get(location);
        try {
            List<String> text = Files.readAllLines(path);
            boolean k = false;
            for (String i:text) {
                String s[] = i.split(" ");
                for (String j:s) {
                    char ch = j.charAt(0);
                    if (Character.isUpperCase(ch)) {
                        continue;
                    }
                    else {
                        k = true;
                        break;
                    }
                }
            }
            if(k) System.out.println( "NOt Valid");
            else System.out.println("Valid");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
