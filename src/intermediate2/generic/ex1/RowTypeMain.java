package intermediate2.generic.ex1;

public class RowTypeMain {

    static void main() {
        // 제네릭 타입을 지정 안하면 raw type 또는 원시타입이라고함. / 안쓰면 오브젝트 들어간거랑 마찬가지
        // 제네릭 없는 과거 코드와의 하위 호환때문에 지원하는 것이다.
        GenericBox integerBox = new GenericBox();

        // 그러나 오브젝트 들어가면 좋겠을때 이렇게 아래처럼  직접 지정해서 쓰는것을 권장함.
        // GenericBox<Object> integerBox2 = new GenericBox<>();
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
