package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;

import java.util.List;
import java.util.Queue;




class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class averagelevels {



    public List<Double> averageOfLevels(TreeNode root) {    
        List<Double> res = new ArrayList<>();
        if (root == null) return res;  
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            int sum = 0;
            for(int x = 0; x < level; x++){
                TreeNode current = queue.remove();
                sum += current.val;
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            res.add((double) sum / level);

        }return res;

    
}
}
