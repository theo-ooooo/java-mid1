package lang.object.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);

        //계산이후 기존 값 사라짐.
        System.out.println("obj = " + obj.getValue());
    }
}
