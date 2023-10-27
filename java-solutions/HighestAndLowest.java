package codewars;

public class HighestAndLowest {
    public static void main(String[] args) {

        String numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(numbers);
       // numbers = numbers.replaceAll("\\s", "");
       // System.out.println("After removing whitespaces: "+numbers);
        char high = numbers.charAt(0);
        char low = numbers.charAt(0);

        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i)==' ') continue;
            
            if (numbers.charAt(i) > high) high = numbers.charAt(i);
            System.out.println("High: "+high);
            if (numbers.charAt(i) < low) low = numbers.charAt(i);
            System.out.println("Low: "+low);
            System.out.println();
        }
        String result = high + " " + low;
        System.out.println("Wynik to: "+result);
    }
}
