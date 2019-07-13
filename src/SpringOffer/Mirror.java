package SpringOffer;

/**
 * Created by Amie on 2019/1/9.
 */
public class Mirror {
    public void Mirror(TreeNode root){
        if (root == null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
