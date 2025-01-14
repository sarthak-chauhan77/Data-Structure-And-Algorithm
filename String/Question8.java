package String;

public class Question8 {
    public static void occurrenceChar(String str) {
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                continue;
            }
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    c = str.charAt(i);
                }
            }
            System.out.println("char " + str.charAt(i) + " Occurr " + count + " times");
        }
    }

    public static void main(String[] args) {
        Question8.occurrenceChar("sarthakk");
    }
}
