class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BSTValidation {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, long left, long right) {
        if (node == null) {
            return true;
        }

        if (!(left < node.val && node.val < right)) {
            return false;
        }

        return isValidBST(node.left, left, node.val) && isValidBST(node.right, node.val, right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);

        BSTValidation validator = new BSTValidation();
        System.out.println(validator.isValidBST(root)); 
    }
}
