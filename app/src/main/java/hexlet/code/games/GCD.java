package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gcd() {
        Engine gcd = new Engine();
        int correctAnswer = 0;
        gcd.setTask("Find the greatest common divisor of given numbers.");
        int rundomNumber1 = (int) (Math.random() * 100) + 1;
        int rundomNumber2 = (int) (Math.random() * 100) + 1;
        for (int i = Math.min(rundomNumber1, rundomNumber2); i > 0; i--) {
            if (rundomNumber2 % i == 0 && rundomNumber1 % i == 0) {
                correctAnswer = i;
                break;
            }
        }
        gcd.setCorrectAnswer(String.valueOf(correctAnswer));
        gcd.setQuestion(rundomNumber1 + " " + rundomNumber2);
    }
}
