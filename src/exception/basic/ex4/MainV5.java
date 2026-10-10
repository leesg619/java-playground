package exception.basic.ex4;

import java.util.Scanner;

public class MainV5 {

    public static void main(String[] args) {
        NetworkServiceV5 service = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter data: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                service.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
        }
        System.out.println("종료 ");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메세지: 죄송합니다. 알수없는문제 발생햇습니당");
        System.out.println("==개발자용 디버깅메세지=");
        e.printStackTrace(System.out);
    }
}
