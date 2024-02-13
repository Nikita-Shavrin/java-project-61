package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void even() {
        Engine even = new Engine();
        even.setTask("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int rundomNumber = (int) (Math.random() * 100) + 1;
        even.setQuestion(String.valueOf(rundomNumber));
        even.setCorrectAnswer(((rundomNumber % 2) != 0) ? "no" : "yes");
        }
    }
