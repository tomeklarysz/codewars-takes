package codewars;

public class ShortestWord {
    public static void main(String[] args) {
        String s = "bitcoin take over the world maybe who knows perhaps"; // example

        String[] words = s.split("\\s");
        int shortestStrLength = words[0].length();
        for (String w : words) {
            if (w.length() < shortestStrLength) shortestStrLength = w.length();
        }
        System.out.println(shortestStrLength);
    }
}
