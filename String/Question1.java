package String;

// print duplicates from a string 
public class Question1 {
    public static void printDuplicate(String str) {
        // Array to store the count of each character
        int[] charCount = new int[256]; // Assuming ASCII character set

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Print characters that occur more than once
        System.out.println("Duplicate characters:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + " occurs " + charCount[i] + " times.");
            }
        }
    }

    public static void main(String[] args) {
        Question1.printDuplicate("sarthakk");
    }
}
