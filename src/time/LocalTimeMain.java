package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);

        System.out.println("현재 시간 : " + nowTime);
        System.out.println("지정 시간 : " + ofTime);

        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("지정시간 +30초 " + ofTimePlus);
    }
}
