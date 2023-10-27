package codewars;

public class MiddleCharacter {

    public static void main(String[] args) {
        String test1 = "testing"; // example
        char middleChar = 'c';
        char middleChar2 = 'c';
        String middleString = "";
        if (test1.length() % 2 == 0) {
            middleChar = test1.charAt(test1.length() / 2);
            middleChar2 = test1.charAt(test1.length() / 2 - 1);
            middleString = String.valueOf(middleChar2).concat(String.valueOf(middleChar));
        }
        else {
            middleChar = test1.charAt(test1.length() / 2);
            middleString = String.valueOf(middleChar);
        }
        System.out.println(middleString);
    }
}
