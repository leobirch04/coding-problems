package leetcode;

import java.util.HashSet;

public class longestRC {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 1; 
        int result = 1;
        HashSet<Character> set = new HashSet<>();
        set.add(chars[left]);
        while(right < s.length()){
            boolean check = set.add(chars[right]);
            while (!check) {
                set.remove(chars[left]);
                left++;
                check = set.add(chars[right]);
            }
            if (set.size()> result) {
                result = set.size();
            }
            right++;
            
        }
        return result;
    }
}
