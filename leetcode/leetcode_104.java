
/*
104. 二叉树的�?大深�?
给定�?个二叉树，找出其�?大深度�??

二叉树的深度为根节点到最远叶子节点的�?长路径上的节点数�?

说明: 叶子节点是指没有子节点的节点�?

示例�?
给定二叉�? [3,9,20,null,null,15,7]�?

    3
   / \
  9  20
    /  \
   15   7

返回它的�?大深�? 3 �?

*/

public class leetcode_104 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
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
