
/*
107. 二叉树的层次遍历 II
给定�?个二叉树，返回其节点值自底向上的层次遍历�? （即按从叶子节点�?在层到根节点�?在的层，逐层从左向右遍历�?

例如�?
给定二叉�? [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

返回其自底向上的层次遍历为：

[
  [15,7],
  [9,20],
  [3]
]
*/

public class leetcode_107 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null)
            return 0;
        List<List<Integer>> lists = new ArrayList<>();
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (left > right) {
            return left+1;
        } else {
            return right+1;
        }

    }
    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }
    
        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
    
        int index = 1;
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        String line ="[3,9,20,null,null,15,7]";
        TreeNode root = stringToTreeNode(line);
            
        int ret =maxDepth(root);
        
        String out = String.valueOf(ret);
        
        System.out.print(out);

    }
}
