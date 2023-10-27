package codewars;

public class CreditCardMask {
    public static void main(String[] args) {
        String str = "4556364607935616";
        String newStr = "";
        System.out.println("Długość Stringa: " + str.length());

        if (str.length() > 4) {
            for (int i = 1; i < str.length() - 3; i++) {
                char newChar;
                newChar = '#';
                newStr += newChar;
            }
            for (int j = str.length() - 4; j < str.length(); j++) {
                newStr += str.charAt(j);
            }
            System.out.println(newStr + " Długość: " + newStr.length());
        }
        else System.out.println(str);
    }
}
