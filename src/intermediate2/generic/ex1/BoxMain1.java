package intermediate2.generic.ex1;

public class BoxMain1 {

    static void main() {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); //오토 박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("str = " + string);

    }
}
