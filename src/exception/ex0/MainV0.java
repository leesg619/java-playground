package exception.ex0;

import java.util.Scanner;

public class MainV0 {

    public static void main(String[] args) {
        NetworkServiceV0 service = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter date: ");
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
