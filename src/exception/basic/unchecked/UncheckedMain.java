package exception.basic.unchecked;

public class UncheckedMain {

    static void main() {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상종료  ");
    }
}
