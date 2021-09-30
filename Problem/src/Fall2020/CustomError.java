package Fall2020;

import java.util.Scanner;

public class CustomError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String password = sc.next();
            isValid(password);
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    static void isValid(String p) throws MyError {
        int upper = 0, lower = 0, special = 0;
        for(int i = 0; i<p.length(); i++) {
             char ch = p.charAt(i);
             if ( Character.isUpperCase(ch)) upper++;
             else if (Character.isLowerCase(ch)) lower++;
             else if (Character.isDigit(ch)) continue;
             else special++;
        }
        if (upper<1) {
            throw new MyError("At lest 2 Uppercase letter.");
        }
        if (lower<1) {
            throw new MyError("At lest 2 Lowercase letter.");
        }
        if (special<3) {
            throw new MyError( "At least 3 special character");
        }
        System.out.println("The Password is Valid");
    }
}

class MyError extends Exception {
    public MyError(String s) {
        super(s);
    }
}
