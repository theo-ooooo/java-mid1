package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    int outerInstanceVar = 3;

    public Printer process(final int paramVar) {
        final int localVar = 1; // 지역 변수. 스텍영역이 종료되는 순간 함꼐 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outerInstanceVar = " + outerInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
//        localVar = 30; // final임
//        paramVar = 30; final임
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer process = localOuter.process(2);
        process.print();

        System.out.println("필드 확인");
        Field[] fields = process.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
