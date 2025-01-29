package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] splitArr = fruits.split(",");

        for (String s : splitArr) {
            System.out.println(s);
        }
        String joinedString = String.join("->", splitArr);

        System.out.println("joinedString = " + joinedString);
    }
}
