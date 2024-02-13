package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class Engine {
    static Scanner scanner = new Scanner(System.in);

    public Engine() {

    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    private static String question;
    private static String task;
    private static String correctAnswer;

    public static void userInteraction(int gameNumber) {
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        updateTheGame(gameNumber);
        System.out.println();
        int correctAnswers = 0;
        while (correctAnswers < 3) {
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String answer = scanner.next();
            if (answer.equals(correctAnswer)) {
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
        if (gameNumber == 2) {
            Even.even();
        } else if (gameNumber == 3) {
            Calc.calc();
        } else if (gameNumber == 4) {
            GCD.gcd();
        }
    }
}