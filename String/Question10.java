package String;

//Q. convert the given stringdigit into int 
public class Question10 {

    public static int myAtoi(String str) {
        int i = 0, n = str.length();
        int result = 0;
        int sign = 1;

        // Step 1: Skip leading whitespaces
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }
        // Step 2: Handle sign if present
        if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        // Step 3: Convert characters to integer
        while (i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            int digit = str.charAt(i) - '0';
            // Step 4: Check for overflow/underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("   -42")); // Output: -42
        System.out.println(myAtoi("4193 with words")); // Output: 4193
        System.out.println(myAtoi("words and 987")); // Output: 0
        System.out.println(myAtoi("-91283472332")); // Output: -2147483648 (Integer.MIN_VALUE)
    }
}
