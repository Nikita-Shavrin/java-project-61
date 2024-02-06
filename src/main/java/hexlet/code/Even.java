package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!"
                +
                "\nMay I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n");
        while (result < 3) {
            Random random = new Random();
            int randomNumber = random.nextInt();
            System.out.println("Question: "
                    +
                    randomNumber
                    +
                    "\n"
                    +
                    "Your answer: ");
            String answer = scanner.next();
            if (randomNumber % 2 != 0) {
                if (answer.equals("yes")) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                            "Let's try again, " + userName + "!");
                    result = 0;
                } else if (answer.equals("no")) {
                    System.out.println("Correct!");
                    result++;
                } else {
                    System.out.println("use only 'yes' or 'no' for answer the question");
                }
            } else if (randomNumber % 2 == 0) {
                if (answer.equals("no")) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                            "Let's try again, " + userName + "!");
                    result = 0;
                } else if (answer.equals("yes")) {
                    System.out.println("Correct!");
                    result++;
                } else {
                    System.out.println("use only 'yes' or 'no' for answer the question");
                }
            }
        }
        System.out.println("Congratulations, " + userName + "!");

        scanner.close();
    }
}