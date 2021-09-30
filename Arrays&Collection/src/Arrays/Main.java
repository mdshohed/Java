package Arrays;

import java.util.Arrays;

/***
 * @author mdshohed
 */
public class Main {
    public static void main(String[] args) {
        int [] ara = {3, 5, 3,45, 34,4,1};
        Arrays.sort(ara);
        int sum = Arrays.stream(ara).sum();
        double avg = Arrays.stream(ara).average().getAsDouble();
        int minValue = Arrays.stream(ara).min().getAsInt();
        int maxValue = Arrays.stream(ara).max().getAsInt();
    }
}
