
/*
167. 两数之和 II - 输入有序数组
给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

说明:

    返回的下标值（index1 和 index2）不是从零开始的。
    你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。

示例:

输入: numbers = [2, 7, 11, 15], target = 9
输出: [1,2]
解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
*/

public class leetcode_167 {
    public  int[] twoSum(int[] numbers, int target) {
        for (int i = 0,len=numbers.length; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if(numbers[i]>target) break;
                if (numbers[i]+numbers[j]==target){
                    return new int[] {i+1,j+1};
                }
            }
        }
        return null;
    }
    //优化版本
    public  int[] twoSum2(int[] numbers, int target) {
        int show=0,fast=numbers.length-1;
        while(show<fast){
            if (numbers[show]+numbers[fast]==target)
                return new int[] {show+1,fast+1};
            else if(numbers[show]+numbers[fast]<target)
                show++;
            else
                fast--;
        }
        return null;
    }
   
}
