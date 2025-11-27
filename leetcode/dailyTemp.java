package leetcode;

import java.util.Stack;

public class dailyTemp {
    public int[] dailyTemperatures(int[] temps) {

        int[] res = new int[temps.length];
        Stack<int[]> stack = new Stack<>(); // pair: [temp, index]

        for (int i = 0; i < temps.length; i++) {
            int t = temps[i];
            while (!stack.isEmpty() && t > stack.peek()[0]) {
                int[] next = stack.pop();
                res[next[1]] = i - next[1];
            }
            stack.push(new int[]{t, i});
        }


        return res;
        
    }
    
    
    
}
