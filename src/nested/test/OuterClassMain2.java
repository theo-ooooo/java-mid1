package nested.test;

public class OuterClassMain2 {
    public static void main(String[] args) {
        OuterClass2 o = new OuterClass2();
        OuterClass2.InnerClass innerClass = o.new InnerClass();
        innerClass.print();
    }
}
