package Arrays;

/*
 Q. Given  a O-indexed integer array nums of length  and an integer target.
 return the numbers of pairs(i,j) where 0 <= i < j < n and nums[i] + nums[j] < target.
 EX -> Input: nums = [-1,1,2,3,1], target=2
       Output: 3
 */
public class CountPairs {
    private static int countPairs(int[] nums, int target) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] < target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 1, 2, 3, 1 };
        int target = 2;
        int count = countPairs(nums, target);
        System.out.print("Count Pairs:" + count);
    }
}
