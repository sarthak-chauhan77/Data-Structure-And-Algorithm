package String;

public class Questin3 {
    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths of both strings are not equal, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create frequency arrays for both strings
        int[] charCount = new int[26]; // Array to store frequency of characters (for 'a' to 'z')

        // Count frequency of each character in the first string and decrement in the
        // second string
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++; // Increment count for str1
            charCount[str2.charAt(i) - 'a']--; // Decrement count for str2
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false; // If any count is not zero, they are not anagrams
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
