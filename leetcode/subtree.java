package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class subtree {
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null||q==null) {
            if (q!=null || p!=null) {
                return false;
            }
            return true;
        }
        
        Queue<TreeNode> que1 = new ArrayDeque<>();
        que1.add(p);

        Queue<TreeNode> que2 = new ArrayDeque<>();
        que2.add(q);

        while (!que1.isEmpty() || !que2.isEmpty()) {
            TreeNode cur1 = que1.poll();
            TreeNode cur2 = que2.poll();
            if (cur1.val != cur2.val) {
                return false;
            }

            if (cur1.right != null || cur2.right != null) {
                if(cur1.right == null || cur2.right == null)  return false;
                que1.add(cur1.right);
                que2.add(cur2.right);
            }
            if (cur1.left != null || cur2.left != null) {
                if(cur1.left == null || cur2.left == null) return false;
                que1.add(cur1.left);
                que2.add(cur2.left);
            }
        }

        return true;

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
         Queue<TreeNode> que1 = new ArrayDeque<>();
         que1.add(root);
         while (!que1.isEmpty()) {
            TreeNode cur = que1.poll();
            if (isSameTree(cur, subRoot)) {
                return true;
            }
            if (cur.left != null) {
                que1.add(cur.left);
            }
            if (cur.right != null) {
                que1.add(cur.right);
            }
         }



         return false;
    }

}
