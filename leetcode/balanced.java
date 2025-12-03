package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class balanced {

    public int height(TreeNode root){
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return false;
        }
        
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            int left = 0,  right = 0;
            if (current.left != null) {
                queue.add(current.left);
                left = height(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
                right = height(current.right);
            }
            System.out.println(left + " " +right);

            if (left >= right && left - right > 1) {
                return false;
            }else if (left < right &&  right - left > 1) {
                return false;
            }
        }


        return true;
    }
}
