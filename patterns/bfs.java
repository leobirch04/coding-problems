package patterns;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class bfs {

    public ArrayList<Integer> search(TreeNode root, ArrayList<Integer> result){
       
        result.add(root.val);

        if(root.left != null) search(root.left, result);
        
        if(root.right != null) search(root.right, result);
        
        return result;
    }

    public void queSearch(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            System.out.println(node.val);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
}

    
}
