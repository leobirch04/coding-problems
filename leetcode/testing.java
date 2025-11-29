package leetcode;



public class testing {
    public static void main(String[] args) {
        TreeNode third = new TreeNode(15);
        TreeNode fourth = new TreeNode(7);
        
        TreeNode first = new TreeNode(20);
        TreeNode second = new TreeNode(9, third, fourth);
        
        TreeNode root = new TreeNode(3, first, second);
        averagelevels bfs = new averagelevels();
        
        System.out.println(bfs.averageOfLevels(root));
        
    }
    
}
