package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class perm {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);   
        }
        result.add(list);

        for(int i = 0; i < len; i++){
            List<Integer> shift = new ArrayList<>(list);
            Collections.rotate(shift, i);
            if (!result.contains(shift)) {
                result.add(shift);
            }
        }

        for(int i = 0; i < len -1; i++){
            
            
            for(int j = i+1; j<len; j++){
                List<Integer> temp = new ArrayList<>(list);
                temp.set(i, nums[j]);
                temp.set(j, nums[i]);
                if (!result.contains(temp)) {
                    result.add(temp);
                }
                
            }
        }


        return result;
    }
    
}
