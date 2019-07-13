package SpringOffer.Jan11th;

import SpringOffer.TreeNode;

/**
 * Created by Amie on 2019/1/11.
 */
public class Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        if (pRootOfTree.left == null && pRootOfTree.right == null)
            return pRootOfTree;
        return pRootOfTree;
    }
}
