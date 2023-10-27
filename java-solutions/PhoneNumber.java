package codewars;

import java.util.Arrays;

public class PhoneNumber {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(numbers));
        String str = "(";
        StringBuffer sb = new StringBuffer(str);
        for (int i=0; i<3; i++) {
            sb.append(numbers[i]);
        }
        sb.append(") ");
        for (int u=3; u<6; u++) {
            sb.append(numbers[u]);
        }
        sb.append("-");
        for (int j=6; j<10; j++) {
            sb.append(numbers[j]);
        }
        System.out.println("wynik: "+sb);
    }
}
