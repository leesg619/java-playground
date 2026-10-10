package exception.basic.ex3;

import exception.basic.ex3.exception.NetworkClientExceptionV3;

import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) {
        NetworkServiceV3_1 service = new NetworkServiceV3_1();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter data: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            service.sendMessage(input);
            System.out.println();
        }
        System.out.println("종료 ");
    }
}
