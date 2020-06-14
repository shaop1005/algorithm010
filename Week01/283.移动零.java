/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) { return;}

        // // 解法一：非零元素前移
        // /**
        //  * count记录非0元素个数
        //  * 循环遍历数组
        //  * 若nums[i] != 0; 则nums[count] = nums[i]; count++;
        //  * 根据count将数组尾部剩余元素置为0；
        //  */
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         nums[count++] = nums[i];
        //     }
        // }
        // for (int i = count; i < nums.length; i++) {
        //     nums[i] = 0;
        // }

        // 解法二：双指针移动判断
        /**
         * 准备快慢指针i、j，指向首元素；
         * 若nums[i] != 0; i == j;说明两指针指向同一个非0元素，此时不交换， i、j右移；这种情况下，ij是同步的；
         * 若nums[i] = 0; i右移，j不动，等待i找到非0元素来替换nums[j]；
         * 若nums[i] != 0; i > j;i > j说明j当前指向了0，i在j的右遍；此时，将nums[i]、nums[j]交换，nums[i]可直接置为0；i、j右移；
         */
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }


    }
}
// @lc code=end