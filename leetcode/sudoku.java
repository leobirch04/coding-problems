package leetcode;

import java.util.ArrayList;

public class sudoku {


    public static ArrayList<Integer> prefSum(int[] arr ){

        int len = arr.length;
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(arr[0]);
        for(int x = 1; x < len; x++){
            prefixSum.add(prefixSum.get(x-1) + arr[x]);
        }

        return prefixSum;

    }

    public static boolean isValidSudoku(char[][] board) {
        


        return false;
    }
    

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        ArrayList<Integer> prefixSum = prefSum(arr);
        for (int i : prefixSum) {
            System.out.print(i + " ");
        }
    }
    
}
