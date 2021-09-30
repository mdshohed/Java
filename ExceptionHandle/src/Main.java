import Custom_exception.AgeException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            vaccine(age);
        }catch (AgeException e) {
            System.err.print(e.getMessage());
        }
    }
    static void vaccine(int age) {
        if ( age>=40) {
            System.out.println("you are eligible for vaccine");
        }else {
            throw new AgeException("You are not eligible for COVID-19 veccine");
        }
    }
}
