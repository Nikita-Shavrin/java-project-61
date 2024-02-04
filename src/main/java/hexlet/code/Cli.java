package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!"
                +
                "\nMay I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }

    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n0 - Exit"
                + "\nYour choice:");
        int number = Integer.parseInt(scanner.next());
        if (number == 1) {
            greeting();
        }
    }
}
