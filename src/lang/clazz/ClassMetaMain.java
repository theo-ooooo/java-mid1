package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        Class clazz = String.class; // 클래스에서 조화
//        Class clazz = new String().getClass(); // 인스턴스에서 조회
//        Class clazz = Class.forName("java.lang.String");

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("SUperclass " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("interface = " + i.getName());
        }
    }
}
