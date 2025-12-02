package leetcode;

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


public class invertnintree {
    void recurse(TreeNode root){

        if (root.left != null && root.right!= null) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            TreeNode temp = right;
            root.right = left;
            root.left = temp;
            recurse(root.left);
            recurse(root.right);
        }else if (root.left!=null) {
            TreeNode left = root.left;
            root.right = left;
            root.left = null;
            recurse(root.right);
        }else if (root.right!=null) {
            TreeNode right = root.right;
            root.left = right;
            root.right = null;
            recurse(root.left);
            
        }

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        recurse(root);

        return root;
    }
}
