package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class treewidth {
    int findHeight(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(findHeight(root.left) , findHeight(root.right));
    }

    
    public int diameterOfBinaryTree(TreeNode root) {
        int biggest = 0;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            int left = 0;
            int right = 0;
            

            if (current.left != null) {
                queue.add(current.left);
                left = findHeight(current.left);

            }
            if (current.right != null) {
                queue.add(current.right);
                right = findHeight(current.right);
            }

            int check = left + right;

            if (check > biggest) {
                biggest = check;
            }
        }

        return biggest;
    }
}
