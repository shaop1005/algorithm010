import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return dbPointerSolution(nums);
    }

    /**
     * 双指针，将不重复元素放到数组左边
     * @param nums
     * @return
     */
    public int dbPointerSolution (int[] nums) {
        int i = 0, j = i + 1;
        while (j < nums.length) {
            if (nums[i] != nums[j] && j - 1 > i++) {
                nums[i] = nums[j];
            }
            j++;
        }
        
        return i + 1;

    }
}
// @lc code=end

