package time.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period periodBetween = Period.between(startDate, endDate);
        System.out.println("남은기간 = " + periodBetween.getYears() + "년 " + periodBetween.getMonths() + "개월 " + periodBetween.getDays() + "일");

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("디데이 = " + daysBetween + "일 남음");
    }
}
