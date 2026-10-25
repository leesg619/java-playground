package intermediate2.generic.ex4;

public class MethodMain1 {

    static void main() {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        Integer integer = (Integer) GenericMethod.genericMethod(i);

        // 타입 인자(Type Arg) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);

        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double v = GenericMethod.<Double>numberMethod(10.5);
    }
}
