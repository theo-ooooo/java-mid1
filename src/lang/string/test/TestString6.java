package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hellog jpa";
        String key = "hello";

        String[] splitArr = str.split(",");

        int count = 0;
        for (String s : splitArr) {
            if(s.contains(key)) {
                count++;
            }
        }

        System.out.println("count = " + count);
    }
}
