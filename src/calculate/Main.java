package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {

        String ch = "y";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter first number");
            int a = scanner.nextInt();
            System.out.println("Enter second number");
            int b = scanner.nextInt();
            System.out.println("Please enter one of symbol");
            char symbol = scanner.next().charAt(0);
            Main cal = new Main();
            cal.calculateResult(a, b, symbol);
            System.out.println("“Would you like to do more calculation Please enter “Y” or “N” :");
            ch = scanner.next();

        } while (ch.equalsIgnoreCase("Y"));

    }

}
