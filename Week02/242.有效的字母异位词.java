import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 * 
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        // boolean flag = absoluteSolution(s, t);
        boolean flag = hashSolution(s, t);
        return flag;
    }

    /**
     * 方法1:暴力
     * sort,sort_str 相等 ？ NLogN
     */
    public boolean absoluteSolution (String s, String t) {

        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
    
        return Arrays.equals(array1, array2);
    }

    /*
     * 方法2：hash,Map
     * 统计每个字符的频次
     * 因为s和t只包含A-Z的字母，所以直接设置一个26位的数组计数即可
     * 若两边为异位词，则最后数组中应全部是0
     */
    public boolean hashSolution (String s, String t) {
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) return false;
        }
        return true;
    }

}
// @lc code=end

