package hexlet.code.games;

import hexlet.code.Engine;
import sun.font.FontRunIterator;

import java.util.Arrays;

public class Progression {
    public static void progression() {
        Engine progression = new Engine();
        progression.setTask("What number is missing in the progression?");
        int randomNumber = (int) (Math.random() * 20) + 1;
        int randomChange = (int) (Math.random() * 5) + 1;
        int randomPoint = (int) (Math.random() * 10);
        String[] numbers = new String[10];
        for (int i = 0, j = randomNumber; i < numbers.length; i++, j += randomChange) {
            if (i == randomPoint) {
                progression.setCorrectAnswer(String.valueOf(j));
            }
            numbers[i] = String.valueOf(j);
            numbers[randomPoint] = "..";
        }
        progression.setQuestion(Arrays.toString(numbers));
    }
}
