package exception.basic.checked;

public class CheckedMain {

    static void main() {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
