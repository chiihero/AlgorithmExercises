
/*
119. 杨辉三角 II
给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。

https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif
在杨辉三角中，每个数是它左上方和右上方的数的和。

示例:

输入: 3
输出: [1,3,3,1]

进阶：

你可以优化你的算法到 O(k) 空间复杂度吗？

*/

public class leetcode_119 {

    public List<Integer> getRow(int rowIndex) {
      
            List<Integer> row = new ArrayList<Integer>();
            for (int i = 0; i <=rowIndex; i++) {
                row.add(1);
                int tmp = 1;
                for (int j = 1; j < i; j++) {
                    row.set(j, row.get(j) + tmp);
                    tmp = row.get(j)-tmp;
                }
            }
            return row;
    }


}
