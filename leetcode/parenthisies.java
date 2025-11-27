package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class parenthisies {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hash = new HashMap<>();
        hash.put(']', '[');
        hash.put(')', '(');
        hash.put('}', '{');


        for (Character character : s.toCharArray()) {
            if (hash.containsKey(character)) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if( !pop.equals(hash.get(character))){
                    System.out.println(pop);
                    return false;
                }
            }else{
                stack.push(character);
            }
        }
        return stack.isEmpty();
    }
}
