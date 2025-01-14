package String;

//Q. check that the string contins only digit or not
public class Question6 {
    public static boolean containsOnlyDigit(String str) {
        return str.matches("\\d+") ? true : false;
    }

    public static boolean containsOnlyDigit1(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean containsOnlyDigit2(String str) {
        return str.chars().allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println(containsOnlyDigit("12345"));
        System.out.println(containsOnlyDigit1("1232w345"));
        System.out.println(containsOnlyDigit2("12345s45"));
    }
}
