package patterns;

import java.util.ArrayList;

public class testing {
    public static void main(String[] args) {
        TreeNode third = new TreeNode(15);
        TreeNode fourth = new TreeNode(7);
        
        TreeNode first = new TreeNode(20);
        TreeNode second = new TreeNode(9, third, fourth);
        
        TreeNode root = new TreeNode(3, first, second);
        bfs bfs = new bfs();
        ArrayList<Integer> res = new ArrayList<>();
        System.out.println(bfs.search(root, res));
        bfs.queSearch(root);
    }
    
}
