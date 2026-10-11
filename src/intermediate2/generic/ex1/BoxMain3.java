package intermediate2.generic.ex1;

public class BoxMain3 {

    static void main() {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
//        integerBox.set("문자");
        //
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("str = " + string);

        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set(10.5);
        Double doubleValue = doubleGenericBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();


    }
}
