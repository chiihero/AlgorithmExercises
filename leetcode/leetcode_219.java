
/*
219. 存在重复元素 II
给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。

示例 1:

输入: nums = [1,2,3,1], k = 3
输出: true

示例 2:

输入: nums = [1,0,1,1], k = 1
输出: true

示例 3:

输入: nums = [1,2,3,1,2,3], k = 2
输出: false


*/

public class leetcode_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        if (len < 2)
            return false;
        for (int i = 1; i < len; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j])
                    break;
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;

                }
            }
        }
        return false;
    }
}
