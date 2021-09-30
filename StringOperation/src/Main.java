import java.util.ArrayList;
import java.util.List;

/**
 * @link: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 */
public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        String text = "mdshohed";

        int age  = 10;
        double d = 3.73;

        /**
         * @return index char
         */
        char charValue = s.charAt(0);
        System.out.println(charValue);

        /**
         * @return char-> Ascii value
         */
        int asciiValue = s.codePointAt(0);
        System.out.println(asciiValue);

        /**
         * @return Before index char ascii value
         */
        int asciiBefore = s.codePointBefore(1);
        System.out.println(asciiBefore);

        /**
         * @return lexicographically check
         */
        int x = s.compareTo(text);
        System.out.println(x);

        /**
         * @return Two string add
         */
        String twoStringAdd = s.concat( " " + text);
        System.out.println(twoStringAdd);

        /**
         * @return word or char find
         */
        boolean wardFind = s.contains("Hello");
        System.out.println(wardFind);

        /**
         * @return All type of variable add in the string
         */
        String stringFormat = String.format( "My name is: %s, age: %d and cgpa: %.2f",text,age,d);
        System.out.println(stringFormat);

        /**
         * @return char first index value
         */
        int indexOf = text.indexOf('h');
        System.out.println(indexOf);

        /**
         * @return char last index value
         */
        int indexOfLast = text.lastIndexOf('h');
        System.out.println(indexOfLast);

        /**
         * @return char replace
         */
        String replace = s.replace('l','H');
        System.out.println(replace);

        String  trim = "__mdshohed__";
        trim = trim.trim();
        System.out.println(trim);
    }

    static void allChrIndexFind(String s) {

        // text all char index find
        List<Integer> ch = new ArrayList<>();
    }
}