package String;

// Q. find the count of vowels, consonants, and digits in a string
public class Question7 {
    public static void countVowelsConsonantsDigits(String str) {
        int i = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;

        while (i < str.length()) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') { // Check if the character is a digit
                digitCount++;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') { // Check for vowels
                vowelCount++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) { // Check for consonants
                consonantCount++;
            }
            i++;
        }

        System.out.println("Vowels count is: " + vowelCount +
                "\nConsonants count is: " + consonantCount +
                "\nDigits count is: " + digitCount);
    }

    public static void main(String[] args) {
        countVowelsConsonantsDigits("sarthak123");
    }
}
