package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate localDate = LocalDate.of(year, month, 1);
        DayOfWeek first = localDate.getDayOfWeek();
        System.out.println("first = " + first);
        DayOfWeek last = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("last = " + last);
    }
}
