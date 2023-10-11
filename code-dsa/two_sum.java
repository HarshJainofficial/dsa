import java.util.Arrays;

/**
 * two_sum
 */
public class two_sum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 13;
        System.out.println(Arrays.toString(sum(nums, target)));
    }

    /* Two Pointer Approach for TWO SUM */
    public static int[] sum(int[] nums, int target) {
        int[] newNums = new int[2];
        /*
         * Two Pointer
         * if(nums[0] + nums[end] > target ) {end--; }
         * else if(nums[0] + nums[end] < end)
         * 
         */
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] + nums[end] == target) {
                newNums[0] = start;
                newNums[1] = end;
                return new int[] { newNums[0], newNums[1] };

            } else if (nums[start] + nums[end] > target) {
                end--;
            } else {
                start++;
            }

        }
        return new int[] {};
    }

}