package leetcode;

import java.util.Stack;

public class polish {
    
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String[] ops = new String[]{"+", "*", "-", "/"};


        for (String str : tokens) {
            if (str.equals(ops[0]) || str.equals(ops[1]) || str.equals(ops[2]) || str.equals(ops[3])) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                System.out.println(num1 + " " + num2);
                if (str.equals(ops[0])) {
                    stack.push(num2 + num1);
                }else if (str.equals(ops[1])) {
                    stack.push(num2 * num1);
                }else if (str.equals(ops[2])) {
                    stack.push(num2 - num1);
                }else if (str.equals(ops[3])) {
                    stack.push(num2 / num1);
                }
            }else{
                stack.push(Integer.parseInt(str));
            }
        }

        return stack.pop();
    }
}
