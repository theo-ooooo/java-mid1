package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        long iterations = 1_000_000_000;
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }

        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("실행 시간 : " + (endTime - startTime) + "ms");


        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; // 오토 발싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumWrapper);
        System.out.println("실행 시간 : " + (endTime - startTime) + "ms");

    }
}
