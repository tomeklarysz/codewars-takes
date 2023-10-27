package codewars;
import java.util.Arrays;
public class ReverseWords {
    public static void main(String[] args) {

        String original = "This is an example!";
        String[] words = original.split("\\s");
        String result = "";
        String reversedStr = "";

        for (String w : words) {
            for (int i = 0; i < w.length(); i++ ) {
                int currentIndex = w.length() - 1;
                reversedStr += w.charAt(currentIndex);
                currentIndex--;
            }
            result += reversedStr;
        }
        System.out.println(Arrays.toString(words));
//        System.out.println(result);
    }
}
