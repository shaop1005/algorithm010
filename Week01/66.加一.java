/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        return absoluteSolution(digits);
    }

    public int[] absoluteSolution (int[] digits) {

        int index = digits.length - 1;
        while (index >= 0) {
            if (digits[index] < 9) {
                digits[index]++;
                return digits;
            } else {
                digits[index] = 0;
                if (index == 0) {
                    int[] nums = new int[digits.length + 1];
                    nums[0] = 1;
                    System.arraycopy(digits, 0, nums, 1, digits.length);
                    return nums;
                }
            }
            index--;
        }
        return digits;
    }
}
// @lc code=end

