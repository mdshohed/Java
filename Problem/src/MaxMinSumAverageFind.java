
/**
 * @Max value find
 * @minmum value find
 * @sum calculate
 * @Array_sort
 * @Average value find
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxMinSumAverageFind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print( "Inter the Number: ");
        int n =in.nextInt();
        ArrayList<Double> ara = new ArrayList<>();

        for(int i = 0; i<n; i++) {
            ara.add(in.nextDouble());
        }

        System.out.println("Maximum value of the Array is: " + Collections.max(ara));
        System.out.println("Minimum value of the Array is: " + Collections.min(ara));

        Collections.sort(ara);
        System.out.println("Sorting Array: ");
        for(Double i:ara) {
            System.out.print( i+ " ");
        }
        System.out.println();
        double sum = 0;
        for(Double i:ara){
            sum +=i;
        }
        System.out.println( "Total sum: " + sum);
        System.out.println(String.format("The Average value is: %.5f",sum/n));
    }
}