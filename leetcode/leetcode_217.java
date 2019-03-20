
/*
217. 存在重复元素
给定一个整数数组，判断是否存在重复元素。

如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

示例 1:
输入: [1,2,3,1]
输出: true

示例 2:
输入: [1,2,3,4]
输出: false

示例 3:
输入: [1,1,1,3,3,4,3,2,4,2]
输出: true
*/

public class leetcode_217 {
      public boolean containsDuplicate(int[] nums) {
            int len = nums.length;
            if(len <2)return false;
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<len;i++) {
			if(!set.add(nums[i]))return true;
		}
		return false;
      }
      public boolean containsDuplicate2(int[] nums) {
            int len = nums.length;
            if(len <2)return false;
            int max = nums[0];
            for(int i = 1;i <len;i++){
                if(nums[i] > max){
                    max = nums[i];
                }else if(nums[i] == max){
                    return true;
                }else{
                    for (int j = i - 1;j >= 0;j--){
                        if(nums[i] == nums[j]){
                            return true;
                        }
                    }
                }
            }
            return false;
      }
}
