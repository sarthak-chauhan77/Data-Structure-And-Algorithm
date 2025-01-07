package Arrays;

//Q.Count Pairs With The Taregt Sum
public class countPairsTargetSum {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 7, 3, 5 };
        int targetSum = 12;
        int count = countPairss(nums, targetSum);
        System.out.print("Pairs:" + count);
    }

    private static int countPairss(int[] nums, int targetSum) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == targetSum) {
                    count++;
                }
            }
        }
        return count;
    }
}
