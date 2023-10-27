package codewars;

public class ReversedString {

    public static void main(String[] args) {
        System.out.println(reverse("Tomek ma 17 lat")); // print reverse
    }
    public static String reverse(String str) { // funkcja zwracajaca reversed wczytanego stringa
        StringBuilder newStr = new StringBuilder();
        int currentIndex = str.length() - 1; // current index stringa zeby wiedziec jaka jest tam litera
        // zaczynamy od ostatniej litery bo odwracamy

        for (int i = 0; i < str.length(); i++) { // petla for zeby dodawac litere z
            newStr.append(str.charAt(currentIndex)); // current index wprowadzonego stringa
            currentIndex--;
        }
        return newStr.toString();
    }
}
