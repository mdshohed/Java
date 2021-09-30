package Spring2021;

public class Three {
    public static void main(String[] args) {
        String str1 = "COmpare", str2 = "C0mpare";
        int output = str1.compareTo(str2);
        System.out.println(output);

        str1 = "Final Exam";
        str2 = "Final Exam";
        System.out.println( );
        System.out.println(str1.compareTo(str2));

        str2 = "one2three2one";
        str1 = "one2three#one";
        System.out.println(str2.compareTo(str1));

        str2 = "MobilePhone";
        str1 = "Mobileph0ne";
        System.out.println(str2.compareTo(str1));
    }
}