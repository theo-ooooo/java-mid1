package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum = 0;
        for (String s : arr) {
            String format = String.format("%s:%d", s, s.length());
            System.out.println(format);
            sum += s.length();
        }
        System.out.println("sum = " + sum);
    }
}
