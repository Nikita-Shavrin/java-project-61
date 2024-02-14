package hexlet.code.games;

import hexlet.code.Engine;

import static java.lang.String.valueOf;

public class Prime {
    public static void prime() {
        int rundomNumber1 = (int) (Math.random() * 100) + 1;
        Engine prime = new Engine();
        prime.setTask("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        prime.setQuestion(String.valueOf((rundomNumber1)));
        prime.setCorrectAnswer((isPrime(rundomNumber1)) ? "yes" : "no");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


