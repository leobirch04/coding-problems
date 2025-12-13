package AOC;

import java.util.ArrayList;

public class day1 {
    static int rotate(String direction, int num, int current){
        
       if (direction.equals("L")) {
        int temp = current - num;
        if(temp < 0){
            return temp % 100; 
        } return temp;
       }
       int temp = num + current;
       if (temp >= 100) {
        return temp % 100;
       }
       return temp;
    }
    public static void main(String[] args) {

        ArrayList<String> list = null; 
        try {
            list = ReadFile.read("AOC/txt1.txt");
            System.out.println(list.toString());
        } catch (Exception e) {
            System.err.println(e);
        }
        int start = 50;
        int count = 0;
        for (String string : list) {
            String letter = string.substring(0, 1);
            String num = string.substring(1);
            start = rotate(letter,Integer.parseInt(num), start );
            //System.out.println(start + letter + num);
            if (start == 0) {
                count ++;
            }
        }

        System.out.println(count);

        
        
    }
}
