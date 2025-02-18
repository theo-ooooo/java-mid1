package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();

        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("value.name() + \" , ordinal =\" + value.ordinal() = " + value.name() + " , ordinal =" + value.ordinal());
        }

        //String -> ENUM 변환 잘못된 문자면 에러 IllegalArgumentException
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("GOLD = " + gold);
    }
}
