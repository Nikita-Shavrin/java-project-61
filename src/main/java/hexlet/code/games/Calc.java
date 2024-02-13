package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void calc() {
        Engine calc = new Engine();
        calc.setTask("What is the result of the expression?");
        int number1 = (int) (Math.random() * 100) + 1;
        int number2 = (int) (Math.random() * 100) + 1;
        int rundomAction = (int) (Math.random() * 3) + 1;
        char action = (rundomAction == 1) ? '+' : (rundomAction == 2) ? '-'
                : (rundomAction == 3) ? '*' : null;
         calc.setCorrectAnswer(String.valueOf((rundomAction == 1) ? number1 + number2 :
                 (rundomAction == 2) ? number1 - number2 :
                         (rundomAction == 3) ? number1 * number2 : null));
        calc.setQuestion(number1 + " " + action + " " + number2);
    }
}
