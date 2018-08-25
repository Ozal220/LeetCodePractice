package Easy.Tree;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); //isLeaf is checked here
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = (new TreeNode(1));
        root.right = (new TreeNode(2));

        TreeNode left1 = root.left;
        left1.left = (new TreeNode(3));

        MaxDepth maxDepth = new MaxDepth();
        System.out.println(maxDepth.maxDepth(root));
    }
}
