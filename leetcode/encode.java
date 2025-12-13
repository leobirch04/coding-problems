package leetcode;

import java.util.ArrayList;
import java.util.List;

public class encode {
   
   
    public String encode(List<String> strs) {
    String res = "";
    for (String string : strs) {
        res = res + string+ "leotheovenglove";

    }return res;

    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        String[] split = str.split("leotheovenglove");
        String temp = "";
        for (String string : split) {
            list.add(string);
            System.out.println(string);
            if (string.equals("leotheovenglove")) {
                list.add(temp);
                temp = "";
            }else{
                temp += string;
            }
        }return list;
        

    } 
}
