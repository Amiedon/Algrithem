package SpringOffer.Jan10th;

import SpringOffer.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Amie on 2019/1/10.
 */
public class FindPathTree {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> listall = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return listall;
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null){
            listall.add(new ArrayList<>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);
        return listall;
    }

    public ArrayList<ArrayList<Integer>> FindPath2(TreeNode root, int target){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Stack<Integer> stack = new Stack<>();
        Find(root, stack, target, result, 0);
        return result;
    }

    private void Find(TreeNode root, Stack<Integer> stack, int target, ArrayList<ArrayList<Integer>> result, int sum) {
        if (root == null)
            return;
        sum += root.val;
        stack.push(root.val);
        if (sum == target && root.left == null && root.right == null){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i:stack){
                list.add(new Integer(i));
            }
            result.add(list);
        }
        Find(root.left, stack, target, result, sum);
        Find(root.right, stack, target, result, sum);
        stack.pop();
    }

    public static void main(String[] args) {
        FindPathTree findPathTree = new FindPathTree();
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(12);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(7);
        ArrayList<ArrayList<Integer>> result = findPathTree.FindPath2(treeNode, 22);
        System.out.println(result);
    }
}
