package SpringOffer;

import sun.reflect.generics.tree.Tree;

/**
 * Created by Amie on 2019/1/9.
 */
public class SubTree {
    public boolean HasSubTree(TreeNode root1, TreeNode root2){
        boolean result = false;
        if (root1 !=null && root2!=null){
            if (root1.val == root2.val){
                result = doesHasSubtree(root1, root2);
            }
            if (!result){
                result = HasSubTree(root1.left, root2);
            }
            if (!result)
                result = HasSubTree(root1.right, root2);
        }
        return result;
    }

    private boolean doesHasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }
        if (root1.val != root2.val)
            return false;
        return doesHasSubtree(root1.left, root2.left) && doesHasSubtree(root1.right, root2.right);
    }
}
