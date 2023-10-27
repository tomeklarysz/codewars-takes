package codewars;

public class SquareNumber {
    public static void main(String[] args) {
        int n = 77564022;
        boolean isSquare = false;
        if (Math.pow(Math.sqrt(n),2) == n && Math.sqrt(n) % 1 == 0) isSquare = true;
        System.out.println(Math.sqrt(n));
        System.out.println(isSquare);
    }
}
