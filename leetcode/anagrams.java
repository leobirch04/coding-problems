package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class anagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Integer, HashMap<Character, Integer> > store = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0 ) {
            return result;
        }
        for(int i = 0; i < strs.length; i++){
            HashMap<Character, Integer> add = new HashMap<>();
            String current = strs[i];
            for(int j = 0; j< current.length(); j++){
                add.put(current.charAt(j), add.getOrDefault(current.charAt(j), 0)+ 1);
            }
            store.put(i, add);
        }// hashmap has been filled
        
        for(int i = 0; i < strs.length; i++){
            List<String> section = new ArrayList<>();
            HashMap<Character, Integer> current = store.get(i);
            if (current!=null) {
                section.add(strs[i]);
            for(int j=i+1; j < strs.length; j++){
                HashMap<Character, Integer> check = store.get(j);
                if (check!=null) {
                    if (check.equals(current)) {
                        section.add(strs[j]);
                        store.remove(j);
                    }
                }
                
            }
            result.add(section);
            }
            
        }


        return result;


        
    }
    
}
