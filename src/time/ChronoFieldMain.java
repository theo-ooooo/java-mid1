package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println(value + ", range = " + value.range());
        }

        System.out.println("MONTH_OF_YEAR = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("DAY_OF_MONTH = " + ChronoField.DAY_OF_MONTH.range());

        LocalDateTime now = LocalDateTime.now();
        int test = now.get(ChronoField.HOUR_OF_DAY);
        System.out.println("test = " + test);
    }
}
