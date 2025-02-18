package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜시간 = " + nowDt);
        System.out.println("지정 날짜 = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정날짜시간+10000 " + ofDtPlus);
        LocalDateTime ofDtPlusYear = ofDt.plusYears(1);
        System.out.println("지정 날짜시간+1년 " + ofDtPlusYear);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDt.isAfter(ofDt));
        // equals 는 타임존까지. 객체 타입도. isEquals는 단순히 시간만.
        System.out.println("현재 날짜시간이 지정 날짜시간이 같은가? " + nowDt.isEqual(ofDt));
    }
}
