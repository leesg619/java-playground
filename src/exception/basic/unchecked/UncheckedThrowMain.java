package exception.basic.unchecked;

public class UncheckedThrowMain {

    static void main() {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상종료  ");
    }
}
