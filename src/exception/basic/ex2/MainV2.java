package exception.basic.ex2;

import exception.ex1.NetworkServiceV1_2;

import java.util.Scanner;

public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
        NetworkServiceV2_5 service = new NetworkServiceV2_5();

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
