package hexlet.code;

import hexlet.code.games.Calc;

import java.util.Scanner;

public class Engine {
    static Scanner scanner = new Scanner(System.in);
    public static String question;
    public static String task;
    public static String correctAnswer;

    public static void userInteraction(int gameNumber) {
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        updateTheGame(gameNumber);
        System.out.println(task);
        int correctAnswers = 0;
        while (correctAnswers < 3) {
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(correctAnswer) ) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                correctAnswers = 0;
                System.out.println(answer + " is wrong answer ;(. Correct answer was "
                        + correctAnswer);
            }
            updateTheGame(gameNumber);
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();

    }
    public static void updateTheGame(int gameNumber) {
        if (gameNumber == 3) {
            Calc.calc();
        }
    }
}