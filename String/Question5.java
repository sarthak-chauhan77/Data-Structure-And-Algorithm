package String;

public class Question5 {

    // Function to reverse the string recursively
    public static String reverse(String str) {
        // Base case: if the string is empty or has only one character
        if (str.isEmpty()) {
            return str;
        }
        // Recursive case: reverse the substring starting from the second character
        // and append the first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "hello";
        String reversedStr = reverse(str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
