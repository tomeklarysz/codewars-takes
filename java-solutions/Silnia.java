package codewars;

import java.lang.IllegalArgumentException;

public class Silnia {

    public static void main(String[] args) {
        IllegalArgumentException exception = new IllegalArgumentException();

        int result = 1;
        int number = 10;
        if (number < 0) {
            throw exception;
        }
        else if (number > 12) {
            throw exception;
        }
        else if (number == 0) result = 1;
        else for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
