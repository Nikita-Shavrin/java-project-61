package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n0 - Exit"
                + "\nYour choice:");
        int number = Integer.parseInt(scanner.next());
        System.out.println("Welcome to the Brain Games!");
        if (number == 1) {
            Cli.greeting();
        } else if (number == 2) {
            Engine.userInteraction(number);
        } else if (number == 3) {
            Engine.userInteraction(number);
        } else if (number == 4) {
            Engine.userInteraction(number);
        }
        scanner.close();
    }
}
