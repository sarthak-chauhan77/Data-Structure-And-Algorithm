package Arrays;

//Q. find the factorial of largest number in the array 
public class LargestNumFact {
    public static void main(String[] args) {
        int arr[] = { 7, 4, 3, 2, 9 };
        int num = findLargest(arr);
        int fact = findFact(num);
        System.out.println("the factorial of largest number " + num + " in the array is:" + fact);
    }

    private static int findLargest(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int findFact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * findFact(num - 1);
    }

}
