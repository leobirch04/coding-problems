package leetcode;

import java.util.ArrayList;

public class schedual {
    public int leastInterval(char[] tasks, int n) {
        ArrayList<Character> result = new ArrayList<>();
        for (char ch : tasks) {
            result.add(ch);
        }

        for(int i = 0; i < result.size()-1; i++){
            char current = result.get(i);
            char next = result.get(i+1);
            if (current == next) {
                char replace = ' ';
                for(int j = result.size() -1; j > i; j--){
                    char check = result.get(j);
                    if (check != current) {
                        replace = check;
                        result.remove(j);
                        break;
                    }
                }
                result.add(i+1, replace);
                System.out.println(result);

            }


        }
        



        
        return result.size();
    }
}
