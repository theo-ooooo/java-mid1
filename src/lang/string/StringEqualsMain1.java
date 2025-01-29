package lang.string;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교 :" + (str1 == str2));
        System.out.println("new String equals 비교 :" + (str1.equals(str2)));


        String str3 = "hello";
        String str4 = "hello";
        System.out.println("str3 == str4 :" + (str3 == str4));
        System.out.println("str3.equals(str4) :" + (str3.equals(str4)));
    }
}
