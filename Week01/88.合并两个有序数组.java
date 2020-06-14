import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // absoluteSolution(nums1, m, nums2, n);
        thPointerSolution(nums1, m, nums2, n);
    }

    /**
     * 方法1：暴力
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void absoluteSolution (int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    /**
     * 方法2：
     * 从num1尾部填充的值
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void thPointerSolution (int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int index1 = m - 1, index2 = n - 1;
        while (index2 >= 0) {
            if (index1 >= 0) {
                nums1[index--] = nums1[index1] > nums2[index2] ? nums1[index1--] : nums2[index2--];
            } else {
                nums1[index--] = nums2[index2--];
            }
        }
    }
}
// @lc code=end

