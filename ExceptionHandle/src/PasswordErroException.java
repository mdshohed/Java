

import java.util.Scanner;

public class PasswordErroException {
    static boolean b = true;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String s = in.nextLine();

        int upper = 0,lower = 0, digit = 0, special = 0, min = s.length();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if( 'A'<=ch && ch<='Z') upper++;
            else if( 'a'<=ch && ch<='z') lower++;
            else if( '0'<=ch && ch<='9') digit++;
            else special++;
        }

        try{
            UpperError(s,upper);
        }catch (CustomError e){
            System.err.println(e.getMessage());
        }

        try {
            LowerError(s,lower);
        }catch (CustomError e) {
            System.err.println(e.getMessage());
        }

        try {
            DigitError(s,digit);
        }catch (CustomError e) {
            System.err.println(e.getMessage());
        }

        try {
            SpecialCharError(s,special);
        }catch (CustomError e) {
            System.err.println(e.getMessage());
        }

        try {
            MinimumLength(s,min);
        }catch (CustomError e) {
            System.err.println(e.getMessage());
        }

        if (b) {
            System.out.println( "The Passsword is Valid");
        }
    }
    static class CustomError extends Exception {
        public CustomError(String message) {
            super(message);
        }
    }
    static void UpperError(String s,int upper)throws CustomError {
        if(upper==0) {
            b = false;
            throw new CustomError("Password should contains at least one Uppercase");
        }
    }
    static void LowerError(String s,int lower)throws CustomError {
        if(lower==0) {
            b = false;
            throw new CustomError("Password should contains at least one Lowercase");
        }
    }
    static void DigitError(String s,int digit)throws CustomError {
        if(digit==0) {
            b = false;
            throw new CustomError("Password should contains at least one Digit");
        }
    }
    static void SpecialCharError(String s,int special)throws CustomError {
        if(special==0) {
            b = false;
            throw new CustomError("Password should contains at least one special Character");
        }
    }
    static void MinimumLength(String s,int min)throws CustomError {
        if(min<8) {
            b = false;
            throw new CustomError("Password should contains Minimum length is 8");
        }
    }
}


