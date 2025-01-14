package String;
//Q. reverse the string 
public class Questin2 {

    public void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str); // Convert the string to a StringBuilder
        int i = 0;
        int j = sb.length() - 1;

        // Use a while loop to swap characters
        while (i <= j) {
            char temp = sb.charAt(j); // Get the character at position j
            sb.setCharAt(j, sb.charAt(i)); // Set the character at position j to the character at i
            sb.setCharAt(i, temp); // Set the character at position i to the temporary value

            i++; // Move the pointer from the beginning
            j--; // Move the pointer from the end
        }

        // Print the reversed string
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Questin2 obj = new Questin2();
        obj.reverseString("water"); // Example usage
    }
}
