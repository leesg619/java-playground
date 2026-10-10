package exception.basic.ex4;

import exception.basic.ex3.NetworkServiceV3_1;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {
        NetworkServiceV4 service = new NetworkServiceV4();

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
