package leetcode;

import java.util.ArrayList;

public class product {

    


    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int total = nums[0];
        result[0] = 1;
        for(int i = 1; i < len; i++){
            int prod = nums[i - 1] * total;
            result[i] = prod;
        }
        for(int i = len -2; i >= 0; i--){
            int prod = result[i + 1] * total;
            result[i] = prod;
        }
        return result;
    }
    
}
