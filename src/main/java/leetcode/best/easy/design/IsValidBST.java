package leetcode.best.easy.design;

import java.util.Stack;

public class IsValidBST

{

//Input: root = [2,1,3]
//[5,1,4,null,null,3,6]
    public static void main(String[] args) {

        TreeNode oneLeft = new TreeNode(4);
        TreeNode oneRight = new TreeNode(1);
        TreeNode root = new TreeNode(5, oneLeft, oneRight);

        System.out.println(new IsValidBST().isValidBST(root));

    }


    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre != null && root.val <= pre.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }

}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
