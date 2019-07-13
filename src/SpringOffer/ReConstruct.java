package SpringOffer;

/**
 * Created by Amie on 2019/1/8.
 */
public class ReConstruct {
    public TreeNode reConstructBinaryTree(int [] pre, int[] in){
        if (pre == null || in == null)
            return null;
        return construct(pre, 0, pre.length-1, in, 0, in.length-1);
    }

    private TreeNode construct(int[] pre, int ps, int pe, int[] in, int is, int ie) {
        if (ps > pe || is > ie)
            return null;
        TreeNode root = new TreeNode(pre[ps]); // 前序遍历根节点
        for (int i=is; i<=ie;i++){
            if (in[i] == pre[ps]){
                root.left = construct(pre, ps+1, ps+i-is, in, is, i-1);
                root.right = construct(pre, ps+i-is+1, pe, in, i+1, ie);
            }
        }
        return root;
    }
}

