import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        // absoluteSolution(nums, k);
        reverseSolution(nums, k);
    }

    /**
     * 方法1：暴力
     * @param nums
     * @param k
     */
    public void absoluteSolution (int[] nums, int k) {
        int tmp1, tmp2;
        for (int i = 0; i < nums.length; i++) {
            tmp1 = nums[nums.length - 1];//取末尾
            // 互相调换
            for (int j = 0; j < nums.length; j++) {
                tmp2 = nums[j];
                nums[j] = tmp1;
                tmp1 = tmp2;
            }
        }
    }

    /**
     * 方法2：反转
     * @param nums
     * @param k
     */
    public void reverseSolution (int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse (int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
// @lc code=end

