package Java.Trees;

import Java.TreeNode;

/**
 * @author: Arnav Garg
 */
public class IsBinaryTree {


    /**
     * We first check if the node is a null or not. return true if it is because a null node is a binary tree.
     * we then check for the faulty case where we check if the node's value is outside of the min and max value. if it
     * is then we return false and as the return clause has an 'and', the function will end up returning a false else it
     * would return a true.
     *
     * @param root : initial root value of the tree.
     * @param min : min value a particular node can have
     * @param max : max value a particular node can have.
     * @return boolean value that gives the answer.
     */
    public boolean isBinary(TreeNode root, int min, int max) {

        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        return isBinary(root.left, min, root.data) && isBinary(root.right, root.data, max);
    }

    public void run() {
        /*
        *
        *            10
        *       5           13
        *    4          11      15
        * */

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(13);

        root.left.left = new TreeNode(4);

        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(1);

        System.out.println(isBinary(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
