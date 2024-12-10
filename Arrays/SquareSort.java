package Arrays;

import java.util.Arrays;

/*
 Q.Given an integer nums sorted in non-decreasing order.return  an array of the square 
   of each number sorted in non-decreasing order with Time complexity:O(n).
   Given:nums[] = {-4,-1,0,3,10}
   Output:{0,1,9,16,100}
 */
public class SquareSort {
    private static int[] squareSort(int nums[]) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {

                nums[right] = nums[left];

            }
            nums[right] *= nums[right];
            right--;
        }

        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { -4, -1, 0, 3, 10 };
        int result[] = squareSort(nums);
        System.out.println(Arrays.toString(result));
    }
}
