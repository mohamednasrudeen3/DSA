package NasruPracticeforDSA.BST;



public class Leetcode21 {
    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println("Max Depth: " + maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {

        if(root==null)
            return 0;


        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;

    }
}
