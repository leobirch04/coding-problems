package leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class topk {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> result = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            result.put(nums[i], result.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Integer> p = new PriorityQueue<>(
            (a, b) -> result.get(b) - result.get(a)
        );
        for (Integer key : result.keySet()) {
            p.add(key);
        }
        int[] fin = new int[k];
        
        for (int i = 0; i < k; i++) {
            fin[i] = p.poll();
        }
        
    
        return fin;
    }
    
}
