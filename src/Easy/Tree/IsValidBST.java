package Easy.Tree;

public class IsValidBST {
    public boolean isValidBST(TreeNode root) {
        if (root != null){
            if (root.left != null)
                isValidBST(root.left);
            if (root.right != null)
                isValidBST(root.right);

            if (root.left.val < root.val && root.right.val > root.val){

            }
            else
                return false;
        }
        return true;
    }
}
