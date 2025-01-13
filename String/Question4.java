package String;

public class Question4 {

    // Function to find and print all permutations of a string
    public static void findPermutations(String str) {
        // Convert the string to a character array
        char[] chars = str.toCharArray();
        // Call the recursive method to generate permutations
        generatePermutations(chars, 0);
    }

    // Helper function to generate permutations recursively
    private static void generatePermutations(char[] chars, int index) {
        // If we reach the end of the string, print the permutation
        if (index == chars.length) {
            System.out.println(new String(chars));
            return;
        }

        // Swap the current character with every character after it
        for (int i = index; i < chars.length; i++) {
            // Swap characters
            swap(chars, index, i);
            // Recursively call to generate permutations for the next index
            generatePermutations(chars, index + 1);
            // Backtrack by swapping the characters back to original
            swap(chars, index, i);
        }
    }

    // Swap two characters in the array
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str);
    }
}
