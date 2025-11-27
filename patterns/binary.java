package patterns;

public class binary {

    public int binary_search(int l, int r, int[] nums, int target) {
        if ( l > r) {
            return -1;
        }
        int middle = ((r - l) / 2 ) + l;
        if(nums[middle] == target) return middle;

        if (nums[middle] < target) {
            return binary_search(middle+1, r, nums, target);
        }
        return binary_search(l, middle -1, nums, target);
    }

    public int search(int[] nums, int target) {
        
        return binary_search(0, nums.length-1, nums, target);
    }
}
