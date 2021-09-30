import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class DifferentBatchStudentCount {
    public static void main(String[] args) {
        String location = "StudentInformation.csv";
        Path path = Paths.get(location);
        try {
            List<String> text = Files.readAllLines(path);
            Vector<Integer> v = new Vector<>();
            int j = 0;
            for(String i:text) {
                if (j==0) {
                    j++;
                    continue;
                }
                String s[] = i.split(",");
                int x = Integer.parseInt(s[2]);
                v.add(x);
            }
            Collections.sort(v);
            Map<Integer,Integer> mp = new HashMap<>();
            for(int i:v ) {
                if (mp.containsKey(i)) {
                    mp.put(i,mp.get(i)+1);
                }
                else {
                    mp.put(i,1);
                }
            }
            for(Map.Entry<Integer,Integer> entry: mp.entrySet()) {
                System.out.println(entry.getKey() + "th student = " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}