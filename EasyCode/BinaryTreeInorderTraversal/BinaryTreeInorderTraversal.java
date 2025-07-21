package EasyCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> store = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode current;
        current = root;
        while (root != null) {
            while (current != null) {
                store.push(current);
                current = current.left;
            }
            current = store.pop();
            result.add(current.val);
            if (store.isEmpty() && current.right==null){
                break;
            }
            current = current.right;
        }
        return result;
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal tree = new BinaryTreeInorderTraversal();

        TreeNode a = new TreeNode(6);
        TreeNode b = new TreeNode(7);
        TreeNode c = new TreeNode(9);
        TreeNode y = new TreeNode(10);


        TreeNode d = new TreeNode(5, a, b);
        TreeNode e = new TreeNode(8, c, null);
        TreeNode x = new TreeNode(4, null, y);
        TreeNode g = new TreeNode(2, x, d);


        TreeNode h = new TreeNode(3, null, e);
        TreeNode root = new TreeNode(1, g, h);

        List<Integer> l = tree.inorderTraversal(root);
        System.out.println(l);
    }
}
// This Java program performs an inorder traversal of a binary tree using an iterative approach with a stack. It visits
// nodes in the order: left subtree, root, then right subtree, and stores the result in a list. In the main method, a
// sample binary tree is created and the traversal result is printed.
