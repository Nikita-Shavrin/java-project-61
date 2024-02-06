package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter."
                + "\n2 - Even"
                + "\n1 - Greet"
                + "\n0 - Exit"
                + "\nYour choice:");
        int number = Integer.parseInt(scanner.next());
        if (number == 1) {
            Cli.greeting();
        } else if (number == 2) {
            Even.even();
        }
        scanner.close();
    }
}
