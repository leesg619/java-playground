package exception.basic.checked;

public class CheckedThrowMain {

    static void main() throws MyCheckedException {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}
