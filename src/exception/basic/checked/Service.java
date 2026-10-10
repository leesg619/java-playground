package exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {

            System.out.println("예외메세지 :  " + e.getMessage());

        }

        System.out.println("정상 호출");
    }

    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
