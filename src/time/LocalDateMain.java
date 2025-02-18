package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2025, 4, 21);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " +ofDate);

        // 계산 불편
        LocalDate plusDays = ofDate.plusDays(100);
        System.out.println("plusDays = " + plusDays);
    }
}
