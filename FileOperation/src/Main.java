
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String location = "E:\\ClassRoom\\ALL Class\\7th Semester\\Java- CSE81.2[Mahbub Hasan]\\Code\\FileOperation\\src\\in.txt";
        String content = "Hello World!";

        /**
         * Text File Read/Write
         */
        FileRead fileRead = new FileRead();
        FileWrite fileWrite = new FileWrite();
        fileRead.textFileRead(location);
        fileWrite.textFileWrite(location,content);

        /**
         * CSV File Read/Write
         */
        content = String.format("Turag, 201800000032",1,"cse");
        location = "E:\\ClassRoom\\ALL Class\\7th Semester\\Java- CSE81.2[Mahbub Hasan]\\Code\\FileOperation\\src\\StudentInformation.csv";
        fileRead.csvFileRead(location);
        fileWrite.csvFileWrite(location,content);
    }

}
